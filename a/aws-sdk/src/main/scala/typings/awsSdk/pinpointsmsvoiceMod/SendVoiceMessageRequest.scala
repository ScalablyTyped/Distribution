package typings.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendVoiceMessageRequest extends js.Object {
  
  /**
    * The phone number that appears on recipients' devices when they receive the message.
    */
  var CallerId: js.UndefOr[String] = js.native
  
  /**
    * The name of the configuration set that you want to use to send the message.
    */
  var ConfigurationSetName: js.UndefOr[WordCharactersWithDelimiters] = js.native
  
  var Content: js.UndefOr[VoiceMessageContent] = js.native
  
  /**
    * The phone number that you want to send the voice message to.
    */
  var DestinationPhoneNumber: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The phone number that Amazon Pinpoint should use to send the voice message. This isn't necessarily the phone number that appears on recipients' devices when they receive the message, because you can specify a CallerId parameter in the request.
    */
  var OriginationPhoneNumber: js.UndefOr[NonEmptyString] = js.native
}
object SendVoiceMessageRequest {
  
  @scala.inline
  def apply(): SendVoiceMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendVoiceMessageRequest]
  }
  
  @scala.inline
  implicit class SendVoiceMessageRequestOps[Self <: SendVoiceMessageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCallerId(value: String): Self = this.set("CallerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallerId: Self = this.set("CallerId", js.undefined)
    
    @scala.inline
    def setConfigurationSetName(value: WordCharactersWithDelimiters): Self = this.set("ConfigurationSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationSetName: Self = this.set("ConfigurationSetName", js.undefined)
    
    @scala.inline
    def setContent(value: VoiceMessageContent): Self = this.set("Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("Content", js.undefined)
    
    @scala.inline
    def setDestinationPhoneNumber(value: NonEmptyString): Self = this.set("DestinationPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationPhoneNumber: Self = this.set("DestinationPhoneNumber", js.undefined)
    
    @scala.inline
    def setOriginationPhoneNumber(value: NonEmptyString): Self = this.set("OriginationPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginationPhoneNumber: Self = this.set("OriginationPhoneNumber", js.undefined)
  }
}
