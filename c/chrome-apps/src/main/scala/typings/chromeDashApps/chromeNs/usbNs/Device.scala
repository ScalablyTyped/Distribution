package typings.chromeDashApps.chromeNs.usbNs

import typings.chromeDashApps.chromeNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  /**
    * An opaque ID for the USB device. It remains unchanged until the device is unplugged.
    * @since Chrome 31.
    */
  var device: integer
  /**
    * The iManufacturer string read from the device, if available.
    * @since Chrome 46.
    */
  var manufacturerName: String
  /** The product ID. */
  var productId: integer
  /**
    * The iProduct string read from the device, if available.
    * @since Chrome 46.
    */
  var productName: String
  /**
    * The iSerialNumber string read from the device, if available.
    * @since Chrome 46.
    */
  var serialNumber: String
  /** The vendor ID. */
  var vendorId: integer
  /**
    * The device version (bcdDevice field).
    * @since Chrome 46.
    */
  var version: integer
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
    val __obj = js.Dynamic.literal(device = device, manufacturerName = manufacturerName, productId = productId, productName = productName, serialNumber = serialNumber, vendorId = vendorId, version = version)
  
    __obj.asInstanceOf[Device]
  }
}

