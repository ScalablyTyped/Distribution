package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateDhcpOptionsRequest extends js.Object {
  /**
    * The ID of the DHCP options set, or default to associate no DHCP options with the VPC.
    */
  var DhcpOptionsId: DefaultingDhcpOptionsId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: typings.awsSdk.ec2Mod.VpcId = js.native
}

object AssociateDhcpOptionsRequest {
  @scala.inline
  def apply(
    DhcpOptionsId: DefaultingDhcpOptionsId,
    VpcId: VpcId,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): AssociateDhcpOptionsRequest = {
    val __obj = js.Dynamic.literal(DhcpOptionsId = DhcpOptionsId.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateDhcpOptionsRequest]
  }
}

