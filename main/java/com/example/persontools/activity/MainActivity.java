package com.example.persontools.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.persontools.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    private long exitTime = 0;
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (System.currentTimeMillis() - exitTime > 2000){
            Toast.makeText(this,"再按一次退出",Toast.LENGTH_SHORT).show();
            exitTime = System.currentTimeMillis();
        }else finish();

    }
}
