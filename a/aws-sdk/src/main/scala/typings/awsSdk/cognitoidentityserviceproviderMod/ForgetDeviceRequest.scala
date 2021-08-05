package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForgetDeviceRequest extends StObject {
  
  /**
    * The access token for the forgotten device request.
    */
  var AccessToken: js.UndefOr[TokenModelType] = js.undefined
  
  /**
    * The device key.
    */
  var DeviceKey: DeviceKeyType
}
object ForgetDeviceRequest {
  
  inline def apply(DeviceKey: DeviceKeyType): ForgetDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceKey = DeviceKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForgetDeviceRequest]
  }
  
  extension [Self <: ForgetDeviceRequest](x: Self) {
    
    inline def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "AccessToken", js.undefined)
    
    inline def setDeviceKey(value: DeviceKeyType): Self = StObject.set(x, "DeviceKey", value.asInstanceOf[js.Any])
  }
}
