package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGcmchannelrequestMod {
  
  trait GCMChannelRequest extends StObject {
    
    /**
      * Platform credential API key from Google.
      */
    var ApiKey: js.UndefOr[String] = js.undefined
    
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[Boolean] = js.undefined
  }
  object GCMChannelRequest {
    
    inline def apply(): GCMChannelRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GCMChannelRequest]
    }
    
    extension [Self <: GCMChannelRequest](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "ApiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "ApiKey", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    }
  }
  
  type UnmarshalledGCMChannelRequest = GCMChannelRequest
}
