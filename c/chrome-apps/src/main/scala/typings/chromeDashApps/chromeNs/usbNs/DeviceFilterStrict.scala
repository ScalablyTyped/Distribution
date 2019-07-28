package typings.chromeDashApps.chromeNs.usbNs

import typings.chromeDashApps.chromeNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceFilterStrict extends js.Object {
  /** USB interface class, matches any interface on the device. */
  var interfaceClass: js.UndefOr[integer] = js.undefined
  /** USB interface protocol, checked only if the interface sub-class matches. */
  var interfaceProtocol: js.UndefOr[integer] = js.undefined
  /** USB interface sub-class, checked only if the interface class matches. */
  var interfaceSubclass: js.UndefOr[integer] = js.undefined
  /** Device product ID, checked only if the vendor ID matches. */
  var productId: js.UndefOr[integer] = js.undefined
  /** Device vendor ID. */
  var vendorId: integer
}

object DeviceFilterStrict {
  @scala.inline
  def apply(
    vendorId: integer,
    interfaceClass: js.UndefOr[integer] = js.undefined,
    interfaceProtocol: js.UndefOr[integer] = js.undefined,
    interfaceSubclass: js.UndefOr[integer] = js.undefined,
    productId: js.UndefOr[integer] = js.undefined
  ): DeviceFilterStrict = {
    val __obj = js.Dynamic.literal(vendorId = vendorId)
    if (!js.isUndefined(interfaceClass)) __obj.updateDynamic("interfaceClass")(interfaceClass)
    if (!js.isUndefined(interfaceProtocol)) __obj.updateDynamic("interfaceProtocol")(interfaceProtocol)
    if (!js.isUndefined(interfaceSubclass)) __obj.updateDynamic("interfaceSubclass")(interfaceSubclass)
    if (!js.isUndefined(productId)) __obj.updateDynamic("productId")(productId)
    __obj.asInstanceOf[DeviceFilterStrict]
  }
}

