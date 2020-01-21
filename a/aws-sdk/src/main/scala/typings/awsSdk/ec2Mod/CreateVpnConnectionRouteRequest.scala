package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpnConnectionRouteRequest extends js.Object {
  /**
    * The CIDR block associated with the local subnet of the customer network.
    */
  var DestinationCidrBlock: String = js.native
  /**
    * The ID of the VPN connection.
    */
  var VpnConnectionId: typings.awsSdk.ec2Mod.VpnConnectionId = js.native
}

object CreateVpnConnectionRouteRequest {
  @scala.inline
  def apply(DestinationCidrBlock: String, VpnConnectionId: VpnConnectionId): CreateVpnConnectionRouteRequest = {
    val __obj = js.Dynamic.literal(DestinationCidrBlock = DestinationCidrBlock.asInstanceOf[js.Any], VpnConnectionId = VpnConnectionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateVpnConnectionRouteRequest]
  }
}

