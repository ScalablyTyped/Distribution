package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeactivateMFADeviceRequest extends js.Object {
  /**
    * The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the device ARN. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: =,.@:/-
    */
  var SerialNumber: serialNumberType = js.native
  /**
    * The name of the user whose MFA device you want to deactivate. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: existingUserNameType = js.native
}

object DeactivateMFADeviceRequest {
  @scala.inline
  def apply(SerialNumber: serialNumberType, UserName: existingUserNameType): DeactivateMFADeviceRequest = {
    val __obj = js.Dynamic.literal(SerialNumber = SerialNumber.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeactivateMFADeviceRequest]
  }
  @scala.inline
  implicit class DeactivateMFADeviceRequestOps[Self <: DeactivateMFADeviceRequest] (val x: Self) extends AnyVal {
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
    def setSerialNumber(value: serialNumberType): Self = this.set("SerialNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserName(value: existingUserNameType): Self = this.set("UserName", value.asInstanceOf[js.Any])
  }
  
}

