package typings.baiduApp.swan.ai

import typings.baiduApp.swan.BaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 将文本转换为可以播放的mp3文件。
  */
@js.native
trait textToAudioOptions
  extends BaseOptions[js.Any, js.Any] {
  
  // 合成的文本，使用UTF-8编码，小于512个中文字或者英文数字（文本在百度服务器内转换为GBK后，长度必须小于1024字节）。
  var ctp: js.UndefOr[String | Double] = js.native
  
  // 客户端类型选择，Web端填写固定值1。
  var lan: js.UndefOr[String] = js.native
  
  // 音量，取值0-9，默认为5中音量。
  var per: js.UndefOr[String] = js.native
  
  // 语速，取值0-9，默认为5中语速。
  var pit: js.UndefOr[String] = js.native
  
  // 固定值zh。语言选择,目前只有中英文混合模式，填写固定值zh。
  var spd: js.UndefOr[String] = js.native
  
  // 发音人选择, 0为普通女声，1为普通男生，3为情感合成-度逍遥，4为情感合成-度丫丫，默认为普通女声。
  @JSName("success")
  var success_textToAudioOptions: js.UndefOr[js.Function1[/* res */ textToAudioResponse, Unit]] = js.native
  
  var tex: String = js.native
  
  // 音调，取值0-9，默认为5中语调。
  var vol: js.UndefOr[String] = js.native
}
object textToAudioOptions {
  
  @scala.inline
  def apply(tex: String): textToAudioOptions = {
    val __obj = js.Dynamic.literal(tex = tex.asInstanceOf[js.Any])
    __obj.asInstanceOf[textToAudioOptions]
  }
  
  @scala.inline
  implicit class textToAudioOptionsMutableBuilder[Self <: textToAudioOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtp(value: String | Double): Self = StObject.set(x, "ctp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtpUndefined: Self = StObject.set(x, "ctp", js.undefined)
    
    @scala.inline
    def setLan(value: String): Self = StObject.set(x, "lan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanUndefined: Self = StObject.set(x, "lan", js.undefined)
    
    @scala.inline
    def setPer(value: String): Self = StObject.set(x, "per", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerUndefined: Self = StObject.set(x, "per", js.undefined)
    
    @scala.inline
    def setPit(value: String): Self = StObject.set(x, "pit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitUndefined: Self = StObject.set(x, "pit", js.undefined)
    
    @scala.inline
    def setSpd(value: String): Self = StObject.set(x, "spd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpdUndefined: Self = StObject.set(x, "spd", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ textToAudioResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTex(value: String): Self = StObject.set(x, "tex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVol(value: String): Self = StObject.set(x, "vol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolUndefined: Self = StObject.set(x, "vol", js.undefined)
  }
}
