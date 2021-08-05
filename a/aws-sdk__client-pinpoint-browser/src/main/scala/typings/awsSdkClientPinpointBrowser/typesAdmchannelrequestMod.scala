package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAdmchannelrequestMod {
  
  trait ADMChannelRequest extends StObject {
    
    /**
      * The Client ID that you obtained from the Amazon App Distribution Portal.
      */
    var ClientId: js.UndefOr[String] = js.undefined
    
    /**
      * The Client Secret that you obtained from the Amazon App Distribution Portal.
      */
    var ClientSecret: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates whether or not the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[Boolean] = js.undefined
  }
  object ADMChannelRequest {
    
    inline def apply(): ADMChannelRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ADMChannelRequest]
    }
    
    extension [Self <: ADMChannelRequest](x: Self) {
      
      inline def setClientId(value: String): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "ClientId", js.undefined)
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "ClientSecret", value.asInstanceOf[js.Any])
      
      inline def setClientSecretUndefined: Self = StObject.set(x, "ClientSecret", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    }
  }
  
  type UnmarshalledADMChannelRequest = ADMChannelRequest
}
