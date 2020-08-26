package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVirtualMFADeviceRequest extends js.Object {
  /**
    * The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the same as the ARN. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: =,.@:/-
    */
  var SerialNumber: serialNumberType = js.native
}

object DeleteVirtualMFADeviceRequest {
  @scala.inline
  def apply(SerialNumber: serialNumberType): DeleteVirtualMFADeviceRequest = {
    val __obj = js.Dynamic.literal(SerialNumber = SerialNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVirtualMFADeviceRequest]
  }
  @scala.inline
  implicit class DeleteVirtualMFADeviceRequestOps[Self <: DeleteVirtualMFADeviceRequest] (val x: Self) extends AnyVal {
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
  }
  
}

