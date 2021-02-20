package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForgetDeviceRequest extends StObject {
  
  /**
    * The access token for the forgotten device request.
    */
  var AccessToken: js.UndefOr[TokenModelType] = js.native
  
  /**
    * The device key.
    */
  var DeviceKey: DeviceKeyType = js.native
}
object ForgetDeviceRequest {
  
  @scala.inline
  def apply(DeviceKey: DeviceKeyType): ForgetDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceKey = DeviceKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForgetDeviceRequest]
  }
  
  @scala.inline
  implicit class ForgetDeviceRequestMutableBuilder[Self <: ForgetDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenUndefined: Self = StObject.set(x, "AccessToken", js.undefined)
    
    @scala.inline
    def setDeviceKey(value: DeviceKeyType): Self = StObject.set(x, "DeviceKey", value.asInstanceOf[js.Any])
  }
}
