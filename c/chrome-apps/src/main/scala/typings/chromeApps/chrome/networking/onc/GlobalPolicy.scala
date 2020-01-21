package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalPolicy extends js.Object {
  /**
    * If true, only policy networks may auto connect.
    * @default false
    */
  var AllowOnlyPolicyNetworksToAutoconnect: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, only policy networks may be connected to
    * and no new networks may be added or configured.
    * @default false
    */
  var AllowOnlyPolicyNetworksToConnect: js.UndefOr[Boolean] = js.undefined
  /**
    * List of blacklisted networks.
    * Connections to blacklisted networks are prohibited.
    * Networks can be whitelisted again by specifying an explicit network configuration.
    * @default []
    */
  var BlacklistedHexSSIDs: js.UndefOr[js.Array[String]] = js.undefined
}

object GlobalPolicy {
  @scala.inline
  def apply(
    AllowOnlyPolicyNetworksToAutoconnect: js.UndefOr[Boolean] = js.undefined,
    AllowOnlyPolicyNetworksToConnect: js.UndefOr[Boolean] = js.undefined,
    BlacklistedHexSSIDs: js.Array[String] = null
  ): GlobalPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowOnlyPolicyNetworksToAutoconnect)) __obj.updateDynamic("AllowOnlyPolicyNetworksToAutoconnect")(AllowOnlyPolicyNetworksToAutoconnect.asInstanceOf[js.Any])
    if (!js.isUndefined(AllowOnlyPolicyNetworksToConnect)) __obj.updateDynamic("AllowOnlyPolicyNetworksToConnect")(AllowOnlyPolicyNetworksToConnect.asInstanceOf[js.Any])
    if (BlacklistedHexSSIDs != null) __obj.updateDynamic("BlacklistedHexSSIDs")(BlacklistedHexSSIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalPolicy]
  }
}

