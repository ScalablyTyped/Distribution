package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpcPeeringConnectionOptionsRequest extends js.Object {
  /**
    * The VPC peering connection options for the accepter VPC.
    */
  var AccepterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptionsRequest] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The VPC peering connection options for the requester VPC.
    */
  var RequesterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptionsRequest] = js.native
  /**
    * The ID of the VPC peering connection.
    */
  var VpcPeeringConnectionId: typings.awsSdk.ec2Mod.VpcPeeringConnectionId = js.native
}

object ModifyVpcPeeringConnectionOptionsRequest {
  @scala.inline
  def apply(VpcPeeringConnectionId: VpcPeeringConnectionId): ModifyVpcPeeringConnectionOptionsRequest = {
    val __obj = js.Dynamic.literal(VpcPeeringConnectionId = VpcPeeringConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcPeeringConnectionOptionsRequest]
  }
  @scala.inline
  implicit class ModifyVpcPeeringConnectionOptionsRequestOps[Self <: ModifyVpcPeeringConnectionOptionsRequest] (val x: Self) extends AnyVal {
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
    def setVpcPeeringConnectionId(value: VpcPeeringConnectionId): Self = this.set("VpcPeeringConnectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccepterPeeringConnectionOptions(value: PeeringConnectionOptionsRequest): Self = this.set("AccepterPeeringConnectionOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccepterPeeringConnectionOptions: Self = this.set("AccepterPeeringConnectionOptions", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setRequesterPeeringConnectionOptions(value: PeeringConnectionOptionsRequest): Self = this.set("RequesterPeeringConnectionOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequesterPeeringConnectionOptions: Self = this.set("RequesterPeeringConnectionOptions", js.undefined)
  }
  
}

