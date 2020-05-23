package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachVpnGatewayRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: typings.awsSdk.ec2Mod.VpcId = js.native
  /**
    * The ID of the virtual private gateway.
    */
  var VpnGatewayId: typings.awsSdk.ec2Mod.VpnGatewayId = js.native
}

object DetachVpnGatewayRequest {
  @scala.inline
  def apply(VpcId: VpcId, VpnGatewayId: VpnGatewayId, DryRun: js.UndefOr[Boolean] = js.undefined): DetachVpnGatewayRequest = {
    val __obj = js.Dynamic.literal(VpcId = VpcId.asInstanceOf[js.Any], VpnGatewayId = VpnGatewayId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachVpnGatewayRequest]
  }
}

