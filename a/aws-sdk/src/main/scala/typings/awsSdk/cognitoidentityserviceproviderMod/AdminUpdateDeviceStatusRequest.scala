package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminUpdateDeviceStatusRequest extends js.Object {
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
  implicit class AdminUpdateDeviceStatusRequestOps[Self <: AdminUpdateDeviceStatusRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeviceKey(value: DeviceKeyType): Self = this.set("DeviceKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: UsernameType): Self = this.set("Username", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceRememberedStatus(value: DeviceRememberedStatusType): Self = this.set("DeviceRememberedStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceRememberedStatus: Self = this.set("DeviceRememberedStatus", js.undefined)
  }
  
}

