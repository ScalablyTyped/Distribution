package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsEc2SecurityGroupUserIdGroupPair extends js.Object {
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The status of a VPC peering connection, if applicable.
    */
  var PeeringStatus: js.UndefOr[NonEmptyString] = js.native
  /**
    * The ID of an AWS account. For a referenced security group in another VPC, the account ID of the referenced security group is returned in the response. If the referenced security group is deleted, this value is not returned. [EC2-Classic] Required when adding or removing rules that reference a security group in another AWS. 
    */
  var UserId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The ID of the VPC for the referenced security group, if applicable.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The ID of the VPC peering connection, if applicable.
    */
  var VpcPeeringConnectionId: js.UndefOr[NonEmptyString] = js.native
}

object AwsEc2SecurityGroupUserIdGroupPair {
  @scala.inline
  def apply(): AwsEc2SecurityGroupUserIdGroupPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2SecurityGroupUserIdGroupPair]
  }
  @scala.inline
  implicit class AwsEc2SecurityGroupUserIdGroupPairOps[Self <: AwsEc2SecurityGroupUserIdGroupPair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGroupId(value: NonEmptyString): Self = this.set("GroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupId: Self = this.set("GroupId", js.undefined)
    @scala.inline
    def setGroupName(value: NonEmptyString): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
    @scala.inline
    def setPeeringStatus(value: NonEmptyString): Self = this.set("PeeringStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeeringStatus: Self = this.set("PeeringStatus", js.undefined)
    @scala.inline
    def setUserId(value: NonEmptyString): Self = this.set("UserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("UserId", js.undefined)
    @scala.inline
    def setVpcId(value: NonEmptyString): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
    @scala.inline
    def setVpcPeeringConnectionId(value: NonEmptyString): Self = this.set("VpcPeeringConnectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcPeeringConnectionId: Self = this.set("VpcPeeringConnectionId", js.undefined)
  }
  
}

