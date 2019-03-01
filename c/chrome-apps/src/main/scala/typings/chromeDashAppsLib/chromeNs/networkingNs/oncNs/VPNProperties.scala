package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VPNProperties[M /* <: ManagedObject */, B, S] extends js.Object {
  /** Whether the VPN network should be connected automatically. */
  var AutoConnect: js.UndefOr[B] = js.undefined
  /** The VPN host. */
  var Host: js.UndefOr[S] = js.undefined
  /**
    * The VPN type.
    * This cannot be an enum because of 'L2TP-IPSec'.
    * This is optional for NetworkConfigProperties which is passed to
    * *setProperties* which may be used to set only specific properties.
    */
  var Type: js.UndefOr[S] = js.undefined
}

object VPNProperties {
  @scala.inline
  def apply[M /* <: ManagedObject */, B, S](AutoConnect: B = null, Host: S = null, Type: S = null): VPNProperties[M, B, S] = {
    val __obj = js.Dynamic.literal()
    if (AutoConnect != null) __obj.updateDynamic("AutoConnect")(AutoConnect.asInstanceOf[js.Any])
    if (Host != null) __obj.updateDynamic("Host")(Host.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[VPNProperties[M, B, S]]
  }
}

