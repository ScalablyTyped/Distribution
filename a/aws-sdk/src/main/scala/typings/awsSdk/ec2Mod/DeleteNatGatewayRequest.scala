package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNatGatewayRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the NAT gateway.
    */
  var NatGatewayId: typings.awsSdk.ec2Mod.NatGatewayId = js.native
}

object DeleteNatGatewayRequest {
  @scala.inline
  def apply(NatGatewayId: NatGatewayId, DryRun: js.UndefOr[Boolean] = js.undefined): DeleteNatGatewayRequest = {
    val __obj = js.Dynamic.literal(NatGatewayId = NatGatewayId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNatGatewayRequest]
  }
}

