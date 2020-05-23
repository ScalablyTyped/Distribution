package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInternetGatewayRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the internet gateway.
    */
  var InternetGatewayId: typings.awsSdk.ec2Mod.InternetGatewayId = js.native
}

object DeleteInternetGatewayRequest {
  @scala.inline
  def apply(InternetGatewayId: InternetGatewayId, DryRun: js.UndefOr[Boolean] = js.undefined): DeleteInternetGatewayRequest = {
    val __obj = js.Dynamic.literal(InternetGatewayId = InternetGatewayId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInternetGatewayRequest]
  }
}

