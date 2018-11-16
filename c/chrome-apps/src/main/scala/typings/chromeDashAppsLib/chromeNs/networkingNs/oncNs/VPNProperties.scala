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

