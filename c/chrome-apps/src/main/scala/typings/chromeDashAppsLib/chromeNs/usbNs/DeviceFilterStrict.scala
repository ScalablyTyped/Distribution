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

