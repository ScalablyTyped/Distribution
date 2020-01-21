package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDhcpOptionsRequest extends js.Object {
  /**
    * The ID of the DHCP options set.
    */
  var DhcpOptionsId: typings.awsSdk.ec2Mod.DhcpOptionsId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
}

object DeleteDhcpOptionsRequest {
  @scala.inline
  def apply(DhcpOptionsId: DhcpOptionsId, DryRun: js.UndefOr[scala.Boolean] = js.undefined): DeleteDhcpOptionsRequest = {
    val __obj = js.Dynamic.literal(DhcpOptionsId = DhcpOptionsId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDhcpOptionsRequest]
  }
}

