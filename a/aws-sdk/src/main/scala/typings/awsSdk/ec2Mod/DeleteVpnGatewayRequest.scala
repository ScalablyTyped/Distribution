package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVpnGatewayRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the virtual private gateway.
    */
  var VpnGatewayId: typings.awsSdk.ec2Mod.VpnGatewayId = js.native
}

object DeleteVpnGatewayRequest {
  @scala.inline
  def apply(VpnGatewayId: VpnGatewayId, DryRun: js.UndefOr[Boolean] = js.undefined): DeleteVpnGatewayRequest = {
    val __obj = js.Dynamic.literal(VpnGatewayId = VpnGatewayId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpnGatewayRequest]
  }
}

