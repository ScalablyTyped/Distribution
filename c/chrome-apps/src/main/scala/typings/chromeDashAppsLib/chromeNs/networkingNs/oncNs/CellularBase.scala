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

object CellularBase {
  @scala.inline
  def apply(
    ActivationState: ActivationStateType = null,
    NetworkTechnology: java.lang.String = null,
    RoamingState: java.lang.String = null,
    SIMPresent: js.UndefOr[scala.Boolean] = js.undefined,
    SignalStrength: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  ): CellularBase = {
    val __obj = js.Dynamic.literal()
    if (ActivationState != null) __obj.updateDynamic("ActivationState")(ActivationState)
    if (NetworkTechnology != null) __obj.updateDynamic("NetworkTechnology")(NetworkTechnology)
    if (RoamingState != null) __obj.updateDynamic("RoamingState")(RoamingState)
    if (!js.isUndefined(SIMPresent)) __obj.updateDynamic("SIMPresent")(SIMPresent)
    if (!js.isUndefined(SignalStrength)) __obj.updateDynamic("SignalStrength")(SignalStrength)
    __obj.asInstanceOf[CellularBase]
  }
}

