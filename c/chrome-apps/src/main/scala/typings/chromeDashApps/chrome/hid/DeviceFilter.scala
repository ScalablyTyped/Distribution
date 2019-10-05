package typings.chromeDashApps.chrome.hid

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since Chrome 39. */
trait DeviceFilter extends js.Object {
  /** Device product ID, only checked only if the vendor ID matches. */
  var productId: js.UndefOr[integer] = js.undefined
  /** HID usage identifier, checked only if the HID usage page matches. */
  var usage: js.UndefOr[integer] = js.undefined
  /** HID usage page identifier. */
  var usagePage: js.UndefOr[integer] = js.undefined
  /** Device vendor ID. */
  var vendorId: js.UndefOr[integer] = js.undefined
}

object DeviceFilter {
  @scala.inline
  def apply(
    productId: Int | Double = null,
    usage: Int | Double = null,
    usagePage: Int | Double = null,
    vendorId: Int | Double = null
  ): DeviceFilter = {
    val __obj = js.Dynamic.literal()
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    if (usagePage != null) __obj.updateDynamic("usagePage")(usagePage.asInstanceOf[js.Any])
    if (vendorId != null) __obj.updateDynamic("vendorId")(vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceFilter]
  }
}

