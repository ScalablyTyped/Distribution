package typings
package chromeDashAppsLib.chromeNs.usbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceFilterStrict extends js.Object {
  /** USB interface class, matches any interface on the device. */
  var interfaceClass: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** USB interface protocol, checked only if the interface sub-class matches. */
  var interfaceProtocol: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** USB interface sub-class, checked only if the interface class matches. */
  var interfaceSubclass: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** Device product ID, checked only if the vendor ID matches. */
  var productId: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** Device vendor ID. */
  var vendorId: chromeDashAppsLib.chromeNs.integer
}

object DeviceFilterStrict {
  @scala.inline
  def apply(
    vendorId: chromeDashAppsLib.chromeNs.integer,
    interfaceClass: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    interfaceProtocol: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    interfaceSubclass: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    productId: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  ): DeviceFilterStrict = {
    val __obj = js.Dynamic.literal(vendorId = vendorId)
    if (!js.isUndefined(interfaceClass)) __obj.updateDynamic("interfaceClass")(interfaceClass)
    if (!js.isUndefined(interfaceProtocol)) __obj.updateDynamic("interfaceProtocol")(interfaceProtocol)
    if (!js.isUndefined(interfaceSubclass)) __obj.updateDynamic("interfaceSubclass")(interfaceSubclass)
    if (!js.isUndefined(productId)) __obj.updateDynamic("productId")(productId)
    __obj.asInstanceOf[DeviceFilterStrict]
  }
}

