package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSmschannelrequestMod {
  
  trait SMSChannelRequest extends StObject {
    
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sender identifier of your messages.
      */
    var SenderId: js.UndefOr[String] = js.undefined
    
    /**
      * ShortCode registered with phone provider.
      */
    var ShortCode: js.UndefOr[String] = js.undefined
  }
  object SMSChannelRequest {
    
    inline def apply(): SMSChannelRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SMSChannelRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SMSChannelRequest] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
      
      inline def setSenderId(value: String): Self = StObject.set(x, "SenderId", value.asInstanceOf[js.Any])
      
      inline def setSenderIdUndefined: Self = StObject.set(x, "SenderId", js.undefined)
      
      inline def setShortCode(value: String): Self = StObject.set(x, "ShortCode", value.asInstanceOf[js.Any])
      
      inline def setShortCodeUndefined: Self = StObject.set(x, "ShortCode", js.undefined)
    }
  }
  
  type UnmarshalledSMSChannelRequest = SMSChannelRequest
}
