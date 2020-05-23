package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClientVpnRouteRequest extends js.Object {
  /**
    * The ID of the Client VPN endpoint from which the route is to be deleted.
    */
  var ClientVpnEndpointId: typings.awsSdk.ec2Mod.ClientVpnEndpointId = js.native
  /**
    * The IPv4 address range, in CIDR notation, of the route to be deleted.
    */
  var DestinationCidrBlock: String = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the target subnet used by the route.
    */
  var TargetVpcSubnetId: js.UndefOr[SubnetId] = js.native
}

object DeleteClientVpnRouteRequest {
  @scala.inline
  def apply(
    ClientVpnEndpointId: ClientVpnEndpointId,
    DestinationCidrBlock: String,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    TargetVpcSubnetId: SubnetId = null
  ): DeleteClientVpnRouteRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any], DestinationCidrBlock = DestinationCidrBlock.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (TargetVpcSubnetId != null) __obj.updateDynamic("TargetVpcSubnetId")(TargetVpcSubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClientVpnRouteRequest]
  }
}

