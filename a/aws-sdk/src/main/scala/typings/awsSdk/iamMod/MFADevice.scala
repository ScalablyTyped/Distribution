package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MFADevice extends js.Object {
  /**
    * The date when the MFA device was enabled for the user.
    */
  var EnableDate: dateType = js.native
  /**
    * The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the device ARN.
    */
  var SerialNumber: serialNumberType = js.native
  /**
    * The user with whom the MFA device is associated.
    */
  var UserName: userNameType = js.native
}

object MFADevice {
  @scala.inline
  def apply(EnableDate: dateType, SerialNumber: serialNumberType, UserName: userNameType): MFADevice = {
    val __obj = js.Dynamic.literal(EnableDate = EnableDate.asInstanceOf[js.Any], SerialNumber = SerialNumber.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MFADevice]
  }
}

