package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualMFADevice extends js.Object {
  /**
    *  The base32 seed defined as specified in RFC3548. The Base32StringSeed is base64-encoded. 
    */
  var Base32StringSeed: js.UndefOr[BootstrapDatum] = js.native
  /**
    * The date and time on which the virtual MFA device was enabled.
    */
  var EnableDate: js.UndefOr[dateType] = js.native
  /**
    *  A QR code PNG image that encodes otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String where $virtualMFADeviceName is one of the create call arguments. AccountName is the user name if set (otherwise, the account ID otherwise), and Base32String is the seed in base32 format. The Base32String value is base64-encoded. 
    */
  var QRCodePNG: js.UndefOr[BootstrapDatum] = js.native
  /**
    * The serial number associated with VirtualMFADevice.
    */
  var SerialNumber: serialNumberType = js.native
  /**
    * The IAM user associated with this virtual MFA device.
    */
  var User: js.UndefOr[typings.awsSdk.iamMod.User] = js.native
}

object VirtualMFADevice {
  @scala.inline
  def apply(SerialNumber: serialNumberType): VirtualMFADevice = {
    val __obj = js.Dynamic.literal(SerialNumber = SerialNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualMFADevice]
  }
  @scala.inline
  implicit class VirtualMFADeviceOps[Self <: VirtualMFADevice] (val x: Self) extends AnyVal {
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
    def setBase32StringSeed(value: BootstrapDatum): Self = this.set("Base32StringSeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase32StringSeed: Self = this.set("Base32StringSeed", js.undefined)
    @scala.inline
    def setEnableDate(value: dateType): Self = this.set("EnableDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDate: Self = this.set("EnableDate", js.undefined)
    @scala.inline
    def setQRCodePNG(value: BootstrapDatum): Self = this.set("QRCodePNG", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQRCodePNG: Self = this.set("QRCodePNG", js.undefined)
    @scala.inline
    def setUser(value: User): Self = this.set("User", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("User", js.undefined)
  }
  
}

