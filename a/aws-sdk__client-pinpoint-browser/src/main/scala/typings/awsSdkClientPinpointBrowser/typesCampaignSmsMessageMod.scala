package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PROMOTIONAL
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.TRANSACTIONAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCampaignSmsMessageMod {
  
  trait CampaignSmsMessage extends StObject {
    
    /**
      * The SMS text body.
      */
    var Body: js.UndefOr[String] = js.undefined
    
    /**
      * Is this is a transactional SMS message, otherwise a promotional message.
      */
    var MessageType: js.UndefOr[TRANSACTIONAL | PROMOTIONAL | String] = js.undefined
    
    /**
      * Sender ID of sent message.
      */
    var SenderId: js.UndefOr[String] = js.undefined
  }
  object CampaignSmsMessage {
    
    inline def apply(): CampaignSmsMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CampaignSmsMessage]
    }
    
    extension [Self <: CampaignSmsMessage](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
      
      inline def setMessageType(value: TRANSACTIONAL | PROMOTIONAL | String): Self = StObject.set(x, "MessageType", value.asInstanceOf[js.Any])
      
      inline def setMessageTypeUndefined: Self = StObject.set(x, "MessageType", js.undefined)
      
      inline def setSenderId(value: String): Self = StObject.set(x, "SenderId", value.asInstanceOf[js.Any])
      
      inline def setSenderIdUndefined: Self = StObject.set(x, "SenderId", js.undefined)
    }
  }
  
  type UnmarshalledCampaignSmsMessage = CampaignSmsMessage
}
