package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GCMChannelRequest extends StObject {
  
  /**
    * The Web API Key, also referred to as an API_KEY or server key, that you received from Google to communicate with Google services.
    */
  var ApiKey: string
  
  /**
    * Specifies whether to enable the GCM channel for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.undefined
}
object GCMChannelRequest {
  
  inline def apply(ApiKey: string): GCMChannelRequest = {
    val __obj = js.Dynamic.literal(ApiKey = ApiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GCMChannelRequest]
  }
  
  extension [Self <: GCMChannelRequest](x: Self) {
    
    inline def setApiKey(value: string): Self = StObject.set(x, "ApiKey", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
