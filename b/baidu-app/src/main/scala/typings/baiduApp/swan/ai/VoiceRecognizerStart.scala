package typings.baiduApp.swan.ai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 获取全局唯一的语音识别器voiceRecognizer。
  */
@js.native
trait VoiceRecognizerStart extends js.Object {
  
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
  implicit class VoiceRecognizerStartOps[Self <: VoiceRecognizerStart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setLongSpeech(value: Boolean): Self = this.set("longSpeech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongSpeech: Self = this.set("longSpeech", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
}
