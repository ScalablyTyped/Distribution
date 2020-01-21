package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpnConnectionsResult extends js.Object {
  /**
    * Information about one or more VPN connections.
    */
  var VpnConnections: js.UndefOr[VpnConnectionList] = js.native
}

object DescribeVpnConnectionsResult {
  @scala.inline
  def apply(VpnConnections: VpnConnectionList = null): DescribeVpnConnectionsResult = {
    val __obj = js.Dynamic.literal()
    if (VpnConnections != null) __obj.updateDynamic("VpnConnections")(VpnConnections.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpnConnectionsResult]
  }
}

