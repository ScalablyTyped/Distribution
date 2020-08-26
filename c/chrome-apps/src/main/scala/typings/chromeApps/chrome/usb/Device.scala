package typings.chromeApps.chrome.usb

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
  /**
    * An opaque ID for the USB device. It remains unchanged until the device is unplugged.
    * @since Chrome 31.
    */
  var device: integer = js.native
  /**
    * The iManufacturer string read from the device, if available.
    * @since Chrome 46.
    */
  var manufacturerName: String = js.native
  /** The product ID. */
  var productId: integer = js.native
  /**
    * The iProduct string read from the device, if available.
    * @since Chrome 46.
    */
  var productName: String = js.native
  /**
    * The iSerialNumber string read from the device, if available.
    * @since Chrome 46.
    */
  var serialNumber: String = js.native
  /** The vendor ID. */
  var vendorId: integer = js.native
  /**
    * The device version (bcdDevice field).
    * @since Chrome 46.
    */
  var version: integer = js.native
}

object Device {
  @scala.inline
  def apply(
    device: integer,
    manufacturerName: String,
    productId: integer,
    productName: String,
    serialNumber: String,
    vendorId: integer,
    version: integer
  ): Device = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], manufacturerName = manufacturerName.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], productName = productName.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
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
    def setDevice(value: integer): Self = this.set("device", value.asInstanceOf[js.Any])
    @scala.inline
    def setManufacturerName(value: String): Self = this.set("manufacturerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductId(value: integer): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductName(value: String): Self = this.set("productName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setVendorId(value: integer): Self = this.set("vendorId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: integer): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

