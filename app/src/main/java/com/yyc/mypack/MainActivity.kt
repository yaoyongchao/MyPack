package com.yyc.mypack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yyc.mylib.YycUtil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        YycUtil.show("1111111")
    }
}