package typings
package chromeDashAppsLib.chromeNs.hidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HidDeviceInfo extends js.Object {
  /**
    * Top-level collections from this device's report descriptors.
    */
  var collections: js.Array[Collection]
  /** Opaque device ID. */
  var deviceId: chromeDashAppsLib.chromeNs.integer
  /** Top-level collection's maximum feature report size. */
  var maxFeatureReportSize: chromeDashAppsLib.chromeNs.integer
  /** Top-level collection's maximum input report size. */
  var maxInputReportSize: chromeDashAppsLib.chromeNs.integer
  /** Top-level collection's maximum output report size. */
  var maxOutputReportSize: chromeDashAppsLib.chromeNs.integer
  /** Product ID. */
  var productId: chromeDashAppsLib.chromeNs.integer
  /**
    * The product name read from the device, if available.
    * @since Chrome 46
    * */
  var productName: java.lang.String
  /**
    * Raw device report descriptor (not available on Windows).
    * @since Chrome 42
    * */
  var reportDescriptor: stdLib.ArrayBuffer
  /**
    * The serial number read from the device, if available.
    * @since Chrome 46
    */
  var serialNumber: java.lang.String
  /** Vendor ID. */
  var vendorId: chromeDashAppsLib.chromeNs.integer
}

