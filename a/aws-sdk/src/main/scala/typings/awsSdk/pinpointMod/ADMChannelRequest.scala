package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ADMChannelRequest extends StObject {
  
  /**
    * The Client ID that you received from Amazon to send messages by using ADM.
    */
  var ClientId: string
  
  /**
    * The Client Secret that you received from Amazon to send messages by using ADM.
    */
  var ClientSecret: string
  
  /**
    * Specifies whether to enable the ADM channel for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.undefined
}
object ADMChannelRequest {
  
  inline def apply(ClientId: string, ClientSecret: string): ADMChannelRequest = {
    val __obj = js.Dynamic.literal(ClientId = ClientId.asInstanceOf[js.Any], ClientSecret = ClientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[ADMChannelRequest]
  }
  
  extension [Self <: ADMChannelRequest](x: Self) {
    
    inline def setClientId(value: string): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    inline def setClientSecret(value: string): Self = StObject.set(x, "ClientSecret", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
