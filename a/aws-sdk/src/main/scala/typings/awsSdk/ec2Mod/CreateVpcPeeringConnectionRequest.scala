package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpcPeeringConnectionRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The AWS account ID of the owner of the accepter VPC. Default: Your AWS account ID
    */
  var PeerOwnerId: js.UndefOr[String] = js.native
  /**
    * The Region code for the accepter VPC, if the accepter VPC is located in a Region other than the Region in which you make the request. Default: The Region in which you make the request.
    */
  var PeerRegion: js.UndefOr[String] = js.native
  /**
    * The ID of the VPC with which you are creating the VPC peering connection. You must specify this parameter in the request.
    */
  var PeerVpcId: js.UndefOr[String] = js.native
  /**
    * The tags to assign to the peering connection.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  /**
    * The ID of the requester VPC. You must specify this parameter in the request.
    */
  var VpcId: js.UndefOr[typings.awsSdk.ec2Mod.VpcId] = js.native
}

object CreateVpcPeeringConnectionRequest {
  @scala.inline
  def apply(): CreateVpcPeeringConnectionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcPeeringConnectionRequest]
  }
  @scala.inline
  implicit class CreateVpcPeeringConnectionRequestOps[Self <: CreateVpcPeeringConnectionRequest] (val x: Self) extends AnyVal {
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
    def setPeerOwnerId(value: String): Self = this.set("PeerOwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerOwnerId: Self = this.set("PeerOwnerId", js.undefined)
    @scala.inline
    def setPeerRegion(value: String): Self = this.set("PeerRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerRegion: Self = this.set("PeerRegion", js.undefined)
    @scala.inline
    def setPeerVpcId(value: String): Self = this.set("PeerVpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerVpcId: Self = this.set("PeerVpcId", js.undefined)
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = this.set("TagSpecifications", js.Array(value :_*))
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = this.set("TagSpecifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagSpecifications: Self = this.set("TagSpecifications", js.undefined)
    @scala.inline
    def setVpcId(value: VpcId): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

