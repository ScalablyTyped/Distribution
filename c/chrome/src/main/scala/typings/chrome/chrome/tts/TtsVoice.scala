package typings.chrome.chrome.tts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TtsVoice extends js.Object {
  
  /** Optional. All of the callback event types that this voice is capable of sending. */
  var eventTypes: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional. The ID of the extension providing this voice. */
  var extensionId: js.UndefOr[String] = js.native
  
  /**
    * Optional. This voice's gender.
    * One of: "male", or "female"
    * @deprecated since Chrome 70. Gender is deprecated and will be ignored.
    */
  var gender: js.UndefOr[String] = js.native
  
  /** Optional. The language that this voice supports, in the form language-region. Examples: 'en', 'en-US', 'en-GB', 'zh-CN'. */
  var lang: js.UndefOr[String] = js.native
  
  /**
    * Optional. If true, the synthesis engine is a remote network resource. It may be higher latency and may incur bandwidth costs.
    * @since Chrome 33.
    */
  var remote: js.UndefOr[Boolean] = js.native
  
  /** Optional. The name of the voice. */
  var voiceName: js.UndefOr[String] = js.native
}
object TtsVoice {
  
  @scala.inline
  def apply(): TtsVoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TtsVoice]
  }
  
  @scala.inline
  implicit class TtsVoiceOps[Self <: TtsVoice] (val x: Self) extends AnyVal {
    
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
    def setEventTypesVarargs(value: String*): Self = this.set("eventTypes", js.Array(value :_*))
    
    @scala.inline
    def setEventTypes(value: js.Array[String]): Self = this.set("eventTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTypes: Self = this.set("eventTypes", js.undefined)
    
    @scala.inline
    def setExtensionId(value: String): Self = this.set("extensionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionId: Self = this.set("extensionId", js.undefined)
    
    @scala.inline
    def setGender(value: String): Self = this.set("gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setRemote(value: Boolean): Self = this.set("remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemote: Self = this.set("remote", js.undefined)
    
    @scala.inline
    def setVoiceName(value: String): Self = this.set("voiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoiceName: Self = this.set("voiceName", js.undefined)
  }
}
