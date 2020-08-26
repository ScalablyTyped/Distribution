package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptVpcPeeringConnectionRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the VPC peering connection. You must specify this parameter in the request.
    */
  var VpcPeeringConnectionId: js.UndefOr[typings.awsSdk.ec2Mod.VpcPeeringConnectionId] = js.native
}

object AcceptVpcPeeringConnectionRequest {
  @scala.inline
  def apply(): AcceptVpcPeeringConnectionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptVpcPeeringConnectionRequest]
  }
  @scala.inline
  implicit class AcceptVpcPeeringConnectionRequestOps[Self <: AcceptVpcPeeringConnectionRequest] (val x: Self) extends AnyVal {
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
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setVpcPeeringConnectionId(value: VpcPeeringConnectionId): Self = this.set("VpcPeeringConnectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcPeeringConnectionId: Self = this.set("VpcPeeringConnectionId", js.undefined)
  }
  
}

