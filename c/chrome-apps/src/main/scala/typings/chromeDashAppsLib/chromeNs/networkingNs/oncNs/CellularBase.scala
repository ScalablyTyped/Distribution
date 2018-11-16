package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CellularBase extends js.Object {
  /** Carrier account activation state. */
  var ActivationState: js.UndefOr[ActivationStateType] = js.undefined
  /** If the modem is registered on a network, the network technology currently in use. */
  var NetworkTechnology: js.UndefOr[java.lang.String] = js.undefined
  /** The roaming state of the cellular modem on the current network. */
  var RoamingState: js.UndefOr[java.lang.String] = js.undefined
  /** Whether a SIM card is present. */
  var SIMPresent: js.UndefOr[scala.Boolean] = js.undefined
  /** The current network signal strength. */
  var SignalStrength: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
}

