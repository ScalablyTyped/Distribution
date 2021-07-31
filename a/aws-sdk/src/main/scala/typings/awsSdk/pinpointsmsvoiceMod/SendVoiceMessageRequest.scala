package typings.awsSdk.pinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendVoiceMessageRequest extends StObject {
  
  /**
    * The phone number that appears on recipients' devices when they receive the message.
    */
  var CallerId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the configuration set that you want to use to send the message.
    */
  var ConfigurationSetName: js.UndefOr[WordCharactersWithDelimiters] = js.undefined
  
  var Content: js.UndefOr[VoiceMessageContent] = js.undefined
  
  /**
    * The phone number that you want to send the voice message to.
    */
  var DestinationPhoneNumber: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The phone number that Amazon Pinpoint should use to send the voice message. This isn't necessarily the phone number that appears on recipients' devices when they receive the message, because you can specify a CallerId parameter in the request.
    */
  var OriginationPhoneNumber: js.UndefOr[NonEmptyString] = js.undefined
}
object SendVoiceMessageRequest {
  
  @scala.inline
  def apply(): SendVoiceMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendVoiceMessageRequest]
  }
  
  @scala.inline
  implicit class SendVoiceMessageRequestMutableBuilder[Self <: SendVoiceMessageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallerId(value: String): Self = StObject.set(x, "CallerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallerIdUndefined: Self = StObject.set(x, "CallerId", js.undefined)
    
    @scala.inline
    def setConfigurationSetName(value: WordCharactersWithDelimiters): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationSetNameUndefined: Self = StObject.set(x, "ConfigurationSetName", js.undefined)
    
    @scala.inline
    def setContent(value: VoiceMessageContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    @scala.inline
    def setDestinationPhoneNumber(value: NonEmptyString): Self = StObject.set(x, "DestinationPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationPhoneNumberUndefined: Self = StObject.set(x, "DestinationPhoneNumber", js.undefined)
    
    @scala.inline
    def setOriginationPhoneNumber(value: NonEmptyString): Self = StObject.set(x, "OriginationPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginationPhoneNumberUndefined: Self = StObject.set(x, "OriginationPhoneNumber", js.undefined)
  }
}
