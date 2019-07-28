package typings.chromeDashApps.chromeNs.hidNs

import typings.chromeDashApps.chromeNs.integer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HidDeviceInfo extends js.Object {
  /**
    * Top-level collections from this device's report descriptors.
    */
  var collections: js.Array[Collection]
  /** Opaque device ID. */
  var deviceId: integer
  /** Top-level collection's maximum feature report size. */
  var maxFeatureReportSize: integer
  /** Top-level collection's maximum input report size. */
  var maxInputReportSize: integer
  /** Top-level collection's maximum output report size. */
  var maxOutputReportSize: integer
  /** Product ID. */
  var productId: integer
  /**
    * The product name read from the device, if available.
    * @since Chrome 46
    * */
  var productName: String
  /**
    * Raw device report descriptor (not available on Windows).
    * @since Chrome 42
    * */
  var reportDescriptor: ArrayBuffer
  /**
    * The serial number read from the device, if available.
    * @since Chrome 46
    */
  var serialNumber: String
  /** Vendor ID. */
  var vendorId: integer
}

object HidDeviceInfo {
  @scala.inline
  def apply(
    collections: js.Array[Collection],
    deviceId: integer,
    maxFeatureReportSize: integer,
    maxInputReportSize: integer,
    maxOutputReportSize: integer,
    productId: integer,
    productName: String,
    reportDescriptor: ArrayBuffer,
    serialNumber: String,
    vendorId: integer
  ): HidDeviceInfo = {
    val __obj = js.Dynamic.literal(collections = collections, deviceId = deviceId, maxFeatureReportSize = maxFeatureReportSize, maxInputReportSize = maxInputReportSize, maxOutputReportSize = maxOutputReportSize, productId = productId, productName = productName, reportDescriptor = reportDescriptor, serialNumber = serialNumber, vendorId = vendorId)
  
    __obj.asInstanceOf[HidDeviceInfo]
  }
}

