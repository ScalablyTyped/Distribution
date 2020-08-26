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
  def apply(NatGatewayId: NatGatewayId): DeleteNatGatewayRequest = {
    val __obj = js.Dynamic.literal(NatGatewayId = NatGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNatGatewayRequest]
  }
  @scala.inline
  implicit class DeleteNatGatewayRequestOps[Self <: DeleteNatGatewayRequest] (val x: Self) extends AnyVal {
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
    def setNatGatewayId(value: NatGatewayId): Self = this.set("NatGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
  
}

