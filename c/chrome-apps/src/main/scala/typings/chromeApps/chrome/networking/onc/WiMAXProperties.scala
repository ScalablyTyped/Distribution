package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WiMAXProperties[M /* <: ManagedObject */, B] extends js.Object {
  /** Whether the network should be connected automatically. */
  var AutoConnect: js.UndefOr[B] = js.undefined
  /** The network EAP properties. */
  var EAP: js.UndefOr[EAPProperties] = js.undefined
  /** The network signal strength. */
  var SignalStrength: js.UndefOr[integer] = js.undefined
}

object WiMAXProperties {
  @scala.inline
  def apply[M /* <: ManagedObject */, B](AutoConnect: B = null, EAP: EAPProperties = null, SignalStrength: Int | Double = null): WiMAXProperties[M, B] = {
    val __obj = js.Dynamic.literal()
    if (AutoConnect != null) __obj.updateDynamic("AutoConnect")(AutoConnect.asInstanceOf[js.Any])
    if (EAP != null) __obj.updateDynamic("EAP")(EAP.asInstanceOf[js.Any])
    if (SignalStrength != null) __obj.updateDynamic("SignalStrength")(SignalStrength.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiMAXProperties[M, B]]
  }
}

