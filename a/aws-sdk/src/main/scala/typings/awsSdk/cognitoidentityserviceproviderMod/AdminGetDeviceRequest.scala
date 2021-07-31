package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminGetDeviceRequest extends StObject {
  
  /**
    * The device key.
    */
  var DeviceKey: DeviceKeyType
  
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
  
  /**
    * The user name.
    */
  var Username: UsernameType
}
object AdminGetDeviceRequest {
  
  @scala.inline
  def apply(DeviceKey: DeviceKeyType, UserPoolId: UserPoolIdType, Username: UsernameType): AdminGetDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceKey = DeviceKey.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminGetDeviceRequest]
  }
  
  @scala.inline
  implicit class AdminGetDeviceRequestMutableBuilder[Self <: AdminGetDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceKey(value: DeviceKeyType): Self = StObject.set(x, "DeviceKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
