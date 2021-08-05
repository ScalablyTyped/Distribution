package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBaiduChannelRequestMod {
  
  trait BaiduChannelRequest extends StObject {
    
    /**
      * Platform credential API key from Baidu.
      */
    var ApiKey: js.UndefOr[String] = js.undefined
    
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Platform credential Secret key from Baidu.
      */
    var SecretKey: js.UndefOr[String] = js.undefined
  }
  object BaiduChannelRequest {
    
    inline def apply(): BaiduChannelRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaiduChannelRequest]
    }
    
    extension [Self <: BaiduChannelRequest](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "ApiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "ApiKey", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
      
      inline def setSecretKey(value: String): Self = StObject.set(x, "SecretKey", value.asInstanceOf[js.Any])
      
      inline def setSecretKeyUndefined: Self = StObject.set(x, "SecretKey", js.undefined)
    }
  }
  
  type UnmarshalledBaiduChannelRequest = BaiduChannelRequest
}
