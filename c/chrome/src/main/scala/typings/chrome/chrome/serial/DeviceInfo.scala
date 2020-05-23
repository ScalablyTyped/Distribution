package typings.chrome.chrome.serial

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
    displayName: js.UndefOr[Double] = js.undefined,
    productId: js.UndefOr[Double] = js.undefined,
    vendorId: js.UndefOr[Double] = js.undefined
  ): DeviceInfo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(displayName)) __obj.updateDynamic("displayName")(displayName.get.asInstanceOf[js.Any])
    if (!js.isUndefined(productId)) __obj.updateDynamic("productId")(productId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vendorId)) __obj.updateDynamic("vendorId")(vendorId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceInfo]
  }
}

