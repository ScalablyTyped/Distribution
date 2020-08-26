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
  def apply(VpcId: VpcId, VpnGatewayId: VpnGatewayId): DetachVpnGatewayRequest = {
    val __obj = js.Dynamic.literal(VpcId = VpcId.asInstanceOf[js.Any], VpnGatewayId = VpnGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachVpnGatewayRequest]
  }
  @scala.inline
  implicit class DetachVpnGatewayRequestOps[Self <: DetachVpnGatewayRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVpcId(value: VpcId): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpnGatewayId(value: VpnGatewayId): Self = this.set("VpnGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
  
}

