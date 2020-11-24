package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoiceMessage extends js.Object {
  
  /**
    * The text of the script to use for the voice message.
    */
  var Body: js.UndefOr[string] = js.native
  
  /**
    * The code for the language to use when synthesizing the text of the message script. For a list of supported languages and the code for each one, see the Amazon Polly Developer Guide.
    */
  var LanguageCode: js.UndefOr[string] = js.native
  
  /**
    * The long code to send the voice message from. This value should be one of the dedicated long codes that's assigned to your AWS account. Although it isn't required, we recommend that you specify the long code in E.164 format, for example +12065550100, to ensure prompt and accurate delivery of the message.
    */
  var OriginationNumber: js.UndefOr[string] = js.native
  
  /**
    * The default message variables to use in the voice message. You can override the default variables with individual address variables.
    */
  var Substitutions: js.UndefOr[MapOfListOfString] = js.native
  
  /**
    * The name of the voice to use when delivering the message. For a list of supported voices, see the Amazon Polly Developer Guide.
    */
  var VoiceId: js.UndefOr[string] = js.native
}
object VoiceMessage {
  
  @scala.inline
  def apply(): VoiceMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceMessage]
  }
  
  @scala.inline
  implicit class VoiceMessageOps[Self <: VoiceMessage] (val x: Self) extends AnyVal {
    
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
    def setBody(value: string): Self = this.set("Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("Body", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: string): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("LanguageCode", js.undefined)
    
    @scala.inline
    def setOriginationNumber(value: string): Self = this.set("OriginationNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginationNumber: Self = this.set("OriginationNumber", js.undefined)
    
    @scala.inline
    def setSubstitutions(value: MapOfListOfString): Self = this.set("Substitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubstitutions: Self = this.set("Substitutions", js.undefined)
    
    @scala.inline
    def setVoiceId(value: string): Self = this.set("VoiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoiceId: Self = this.set("VoiceId", js.undefined)
  }
}
