package typings
package chromeDashAppsLib.chromeNs.hidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since Chrome 39. */
trait DeviceFilter extends js.Object {
  /** Device product ID, only checked only if the vendor ID matches. */
  var productId: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** HID usage identifier, checked only if the HID usage page matches. */
  var usage: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** HID usage page identifier. */
  var usagePage: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** Device vendor ID. */
  var vendorId: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
}

