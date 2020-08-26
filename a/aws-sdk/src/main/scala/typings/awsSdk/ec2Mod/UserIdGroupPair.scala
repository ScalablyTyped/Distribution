package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserIdGroupPair extends js.Object {
  /**
    * A description for the security group rule that references this user ID group pair. Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=;{}!$*
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[String] = js.native
  /**
    * The name of the security group. In a request, use this parameter for a security group in EC2-Classic or a default VPC only. For a security group in a nondefault VPC, use the security group ID.  For a referenced security group in another VPC, this value is not returned if the referenced security group is deleted.
    */
  var GroupName: js.UndefOr[String] = js.native
  /**
    * The status of a VPC peering connection, if applicable.
    */
  var PeeringStatus: js.UndefOr[String] = js.native
  /**
    * The ID of an AWS account. For a referenced security group in another VPC, the account ID of the referenced security group is returned in the response. If the referenced security group is deleted, this value is not returned. [EC2-Classic] Required when adding or removing rules that reference a security group in another AWS account.
    */
  var UserId: js.UndefOr[String] = js.native
  /**
    * The ID of the VPC for the referenced security group, if applicable.
    */
  var VpcId: js.UndefOr[String] = js.native
  /**
    * The ID of the VPC peering connection, if applicable.
    */
  var VpcPeeringConnectionId: js.UndefOr[String] = js.native
}

object UserIdGroupPair {
  @scala.inline
  def apply(): UserIdGroupPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserIdGroupPair]
  }
  @scala.inline
  implicit class UserIdGroupPairOps[Self <: UserIdGroupPair] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setGroupId(value: String): Self = this.set("GroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupId: Self = this.set("GroupId", js.undefined)
    @scala.inline
    def setGroupName(value: String): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
    @scala.inline
    def setPeeringStatus(value: String): Self = this.set("PeeringStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeeringStatus: Self = this.set("PeeringStatus", js.undefined)
    @scala.inline
    def setUserId(value: String): Self = this.set("UserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("UserId", js.undefined)
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
    @scala.inline
    def setVpcPeeringConnectionId(value: String): Self = this.set("VpcPeeringConnectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcPeeringConnectionId: Self = this.set("VpcPeeringConnectionId", js.undefined)
  }
  
}

