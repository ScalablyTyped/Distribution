package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WiMAXProperties[M /* <: ManagedObject */, B] extends js.Object {
  /** Whether the network should be connected automatically. */
  var AutoConnect: js.UndefOr[B] = js.undefined
  /** The network EAP properties. */
  var EAP: js.UndefOr[EAPProperties] = js.undefined
  /** The network signal strength. */
  var SignalStrength: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
}

