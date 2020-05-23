package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEgressOnlyInternetGatewayRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the egress-only internet gateway.
    */
  var EgressOnlyInternetGatewayId: typings.awsSdk.ec2Mod.EgressOnlyInternetGatewayId = js.native
}

object DeleteEgressOnlyInternetGatewayRequest {
  @scala.inline
  def apply(
    EgressOnlyInternetGatewayId: EgressOnlyInternetGatewayId,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): DeleteEgressOnlyInternetGatewayRequest = {
    val __obj = js.Dynamic.literal(EgressOnlyInternetGatewayId = EgressOnlyInternetGatewayId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEgressOnlyInternetGatewayRequest]
  }
}

