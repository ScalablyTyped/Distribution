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

object WiMAXProperties {
  @scala.inline
  def apply[M /* <: ManagedObject */, B](
    AutoConnect: B = null,
    EAP: EAPProperties = null,
    SignalStrength: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  ): WiMAXProperties[M, B] = {
    val __obj = js.Dynamic.literal()
    if (AutoConnect != null) __obj.updateDynamic("AutoConnect")(AutoConnect.asInstanceOf[js.Any])
    if (EAP != null) __obj.updateDynamic("EAP")(EAP)
    if (!js.isUndefined(SignalStrength)) __obj.updateDynamic("SignalStrength")(SignalStrength)
    __obj.asInstanceOf[WiMAXProperties[M, B]]
  }
}

