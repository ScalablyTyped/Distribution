package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeviceRequest extends StObject {
  
  /**
    * The access token.
    */
  var AccessToken: js.UndefOr[TokenModelType] = js.undefined
  
  /**
    * The device key.
    */
  var DeviceKey: DeviceKeyType
}
object GetDeviceRequest {
  
  @scala.inline
  def apply(DeviceKey: DeviceKeyType): GetDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceKey = DeviceKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceRequest]
  }
  
  @scala.inline
  implicit class GetDeviceRequestMutableBuilder[Self <: GetDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenUndefined: Self = StObject.set(x, "AccessToken", js.undefined)
    
    @scala.inline
    def setDeviceKey(value: DeviceKeyType): Self = StObject.set(x, "DeviceKey", value.asInstanceOf[js.Any])
  }
}
