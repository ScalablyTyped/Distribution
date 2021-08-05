package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignSmsMessage extends StObject {
  
  /**
    * The body of the SMS message.
    */
  var Body: js.UndefOr[string] = js.undefined
  
  /**
    * The SMS message type. Valid values are TRANSACTIONAL (for messages that are critical or time-sensitive, such as a one-time passwords) and PROMOTIONAL (for messsages that aren't critical or time-sensitive, such as marketing messages).
    */
  var MessageType: js.UndefOr[typings.awsSdk.pinpointMod.MessageType] = js.undefined
  
  /**
    * The sender ID to display on recipients' devices when they receive the SMS message.
    */
  var SenderId: js.UndefOr[string] = js.undefined
}
object CampaignSmsMessage {
  
  inline def apply(): CampaignSmsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignSmsMessage]
  }
  
  extension [Self <: CampaignSmsMessage](x: Self) {
    
    inline def setBody(value: string): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    inline def setMessageType(value: MessageType): Self = StObject.set(x, "MessageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "MessageType", js.undefined)
    
    inline def setSenderId(value: string): Self = StObject.set(x, "SenderId", value.asInstanceOf[js.Any])
    
    inline def setSenderIdUndefined: Self = StObject.set(x, "SenderId", js.undefined)
  }
}
