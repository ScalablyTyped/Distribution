package typings.chromeApps.chrome.hid

import typings.chromeApps.chrome.integer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HidDeviceInfo extends js.Object {
  /**
    * Top-level collections from this device's report descriptors.
    */
  var collections: js.Array[Collection] = js.native
  /** Opaque device ID. */
  var deviceId: integer = js.native
  /** Top-level collection's maximum feature report size. */
  var maxFeatureReportSize: integer = js.native
  /** Top-level collection's maximum input report size. */
  var maxInputReportSize: integer = js.native
  /** Top-level collection's maximum output report size. */
  var maxOutputReportSize: integer = js.native
  /** Product ID. */
  var productId: integer = js.native
  /**
    * The product name read from the device, if available.
    * @since Chrome 46
    * */
  var productName: String = js.native
  /**
    * Raw device report descriptor (not available on Windows).
    * @since Chrome 42
    * */
  var reportDescriptor: ArrayBuffer = js.native
  /**
    * The serial number read from the device, if available.
    * @since Chrome 46
    */
  var serialNumber: String = js.native
  /** Vendor ID. */
  var vendorId: integer = js.native
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
    val __obj = js.Dynamic.literal(collections = collections.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], maxFeatureReportSize = maxFeatureReportSize.asInstanceOf[js.Any], maxInputReportSize = maxInputReportSize.asInstanceOf[js.Any], maxOutputReportSize = maxOutputReportSize.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], productName = productName.asInstanceOf[js.Any], reportDescriptor = reportDescriptor.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HidDeviceInfo]
  }
  @scala.inline
  implicit class HidDeviceInfoOps[Self <: HidDeviceInfo] (val x: Self) extends AnyVal {
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
    def setCollectionsVarargs(value: Collection*): Self = this.set("collections", js.Array(value :_*))
    @scala.inline
    def setCollections(value: js.Array[Collection]): Self = this.set("collections", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceId(value: integer): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxFeatureReportSize(value: integer): Self = this.set("maxFeatureReportSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxInputReportSize(value: integer): Self = this.set("maxInputReportSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxOutputReportSize(value: integer): Self = this.set("maxOutputReportSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductId(value: integer): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductName(value: String): Self = this.set("productName", value.asInstanceOf[js.Any])
    @scala.inline
    def setReportDescriptor(value: ArrayBuffer): Self = this.set("reportDescriptor", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setVendorId(value: integer): Self = this.set("vendorId", value.asInstanceOf[js.Any])
  }
  
}

