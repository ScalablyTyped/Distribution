package typings.chromeDashApps.chrome.usb

import typings.chromeDashApps.chrome.integer
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
    interfaceClass: Int | Double = null,
    interfaceProtocol: Int | Double = null,
    interfaceSubclass: Int | Double = null,
    productId: Int | Double = null
  ): DeviceFilterStrict = {
    val __obj = js.Dynamic.literal(vendorId = vendorId)
    if (interfaceClass != null) __obj.updateDynamic("interfaceClass")(interfaceClass.asInstanceOf[js.Any])
    if (interfaceProtocol != null) __obj.updateDynamic("interfaceProtocol")(interfaceProtocol.asInstanceOf[js.Any])
    if (interfaceSubclass != null) __obj.updateDynamic("interfaceSubclass")(interfaceSubclass.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceFilterStrict]
  }
}

