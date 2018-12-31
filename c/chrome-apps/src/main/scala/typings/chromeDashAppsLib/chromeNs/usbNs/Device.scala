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

