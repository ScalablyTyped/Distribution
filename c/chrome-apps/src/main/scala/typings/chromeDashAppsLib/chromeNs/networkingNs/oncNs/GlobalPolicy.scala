package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalPolicy extends js.Object {
  /**
    * If true, only policy networks may auto connect.
    * @default false
    */
  var AllowOnlyPolicyNetworksToAutoconnect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, only policy networks may be connected to
    * and no new networks may be added or configured.
    * @default false
    */
  var AllowOnlyPolicyNetworksToConnect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * List of blacklisted networks.
    * Connections to blacklisted networks are prohibited.
    * Networks can be whitelisted again by specifying an explicit network configuration.
    * @default []
    */
  var BlacklistedHexSSIDs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

