package typings
package chromeDashAppsLib.chromeNs.usbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  /**
    * An opaque ID for the USB device. It remains unchanged until the device is unplugged.
    * @since Chrome 31.
    */
  var device: chromeDashAppsLib.chromeNs.integer
  /**
    * The iManufacturer string read from the device, if available.
    * @since Chrome 46.
    */
  var manufacturerName: java.lang.String
  /** The product ID. */
  var productId: chromeDashAppsLib.chromeNs.integer
  /**
    * The iProduct string read from the device, if available.
    * @since Chrome 46.
    */
  var productName: java.lang.String
  /**
    * The iSerialNumber string read from the device, if available.
    * @since Chrome 46.
    */
  var serialNumber: java.lang.String
  /** The vendor ID. */
  var vendorId: chromeDashAppsLib.chromeNs.integer
  /**
    * The device version (bcdDevice field).
    * @since Chrome 46.
    */
  var version: chromeDashAppsLib.chromeNs.integer
}

object Device {
  @scala.inline
  def apply(
    device: chromeDashAppsLib.chromeNs.integer,
    manufacturerName: java.lang.String,
    productId: chromeDashAppsLib.chromeNs.integer,
    productName: java.lang.String,
    serialNumber: java.lang.String,
    vendorId: chromeDashAppsLib.chromeNs.integer,
    version: chromeDashAppsLib.chromeNs.integer
  ): Device = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("device")(device)
    __obj.updateDynamic("manufacturerName")(manufacturerName)
    __obj.updateDynamic("productId")(productId)
    __obj.updateDynamic("productName")(productName)
    __obj.updateDynamic("serialNumber")(serialNumber)
    __obj.updateDynamic("vendorId")(vendorId)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Device]
  }
}

