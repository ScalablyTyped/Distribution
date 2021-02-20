package typings.baiduApp.swan.ai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 获取全局唯一的语音识别器voiceRecognizer。
  */
@js.native
trait VoiceRecognizerStart extends StObject {
  
  // 是否开启长语音
  var context: js.UndefOr[String] = js.native
  
  // 听音模式，有效值dnn/touch
  var longSpeech: js.UndefOr[Boolean] = js.native
  
  var mode: js.UndefOr[String] = js.native
}
object VoiceRecognizerStart {
  
  @scala.inline
  def apply(): VoiceRecognizerStart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceRecognizerStart]
  }
  
  @scala.inline
  implicit class VoiceRecognizerStartMutableBuilder[Self <: VoiceRecognizerStart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setLongSpeech(value: Boolean): Self = StObject.set(x, "longSpeech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongSpeechUndefined: Self = StObject.set(x, "longSpeech", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
