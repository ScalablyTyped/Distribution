package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDeviceStatusRequest extends StObject {
  
  /**
    * The access token.
    */
  var AccessToken: TokenModelType
  
  /**
    * The device key.
    */
  var DeviceKey: DeviceKeyType
  
  /**
    * The status of whether a device is remembered.
    */
  var DeviceRememberedStatus: js.UndefOr[DeviceRememberedStatusType] = js.undefined
}
object UpdateDeviceStatusRequest {
  
  inline def apply(AccessToken: TokenModelType, DeviceKey: DeviceKeyType): UpdateDeviceStatusRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any], DeviceKey = DeviceKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceStatusRequest]
  }
  
  extension [Self <: UpdateDeviceStatusRequest](x: Self) {
    
    inline def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    inline def setDeviceKey(value: DeviceKeyType): Self = StObject.set(x, "DeviceKey", value.asInstanceOf[js.Any])
    
    inline def setDeviceRememberedStatus(value: DeviceRememberedStatusType): Self = StObject.set(x, "DeviceRememberedStatus", value.asInstanceOf[js.Any])
    
    inline def setDeviceRememberedStatusUndefined: Self = StObject.set(x, "DeviceRememberedStatus", js.undefined)
  }
}
