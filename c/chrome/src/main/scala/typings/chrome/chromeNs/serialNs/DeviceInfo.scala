package typings.chrome.chromeNs.serialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceInfo extends js.Object {
  /** Optional. A human-readable display name for the underlying device if one can be queried from the host driver. */
  var displayName: js.UndefOr[Double] = js.undefined
  /** The device's system path. This should be passed as the path argument to chrome.serial.connect in order to connect to this device. */
  var path: String
  /** Optional. A USB product ID if one can be determined for the underlying device. */
  var productId: js.UndefOr[Double] = js.undefined
  /** Optional. A PCI or USB vendor ID if one can be determined for the underlying device. */
  var vendorId: js.UndefOr[Double] = js.undefined
}

object DeviceInfo {
  @scala.inline
  def apply(
    path: String,
    displayName: Int | Double = null,
    productId: Int | Double = null,
    vendorId: Int | Double = null
  ): DeviceInfo = {
    val __obj = js.Dynamic.literal(path = path)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (vendorId != null) __obj.updateDynamic("vendorId")(vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceInfo]
  }
}

