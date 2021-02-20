package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminUpdateDeviceStatusRequest extends StObject {
  
  /**
    * The device key.
    */
  var DeviceKey: DeviceKeyType = js.native
  
  /**
    * The status indicating whether a device has been remembered or not.
    */
  var DeviceRememberedStatus: js.UndefOr[DeviceRememberedStatusType] = js.native
  
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
  
  /**
    * The user name.
    */
  var Username: UsernameType = js.native
}
object AdminUpdateDeviceStatusRequest {
  
  @scala.inline
  def apply(DeviceKey: DeviceKeyType, UserPoolId: UserPoolIdType, Username: UsernameType): AdminUpdateDeviceStatusRequest = {
    val __obj = js.Dynamic.literal(DeviceKey = DeviceKey.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminUpdateDeviceStatusRequest]
  }
  
  @scala.inline
  implicit class AdminUpdateDeviceStatusRequestMutableBuilder[Self <: AdminUpdateDeviceStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceKey(value: DeviceKeyType): Self = StObject.set(x, "DeviceKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceRememberedStatus(value: DeviceRememberedStatusType): Self = StObject.set(x, "DeviceRememberedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceRememberedStatusUndefined: Self = StObject.set(x, "DeviceRememberedStatus", js.undefined)
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
