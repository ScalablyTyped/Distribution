package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGroup extends js.Object {
  /**
    * A description of the security group.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[String] = js.native
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[String] = js.native
  /**
    * The inbound rules associated with the security group.
    */
  var IpPermissions: js.UndefOr[IpPermissionList] = js.native
  /**
    * [VPC only] The outbound rules associated with the security group.
    */
  var IpPermissionsEgress: js.UndefOr[IpPermissionList] = js.native
  /**
    * The AWS account ID of the owner of the security group.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * Any tags assigned to the security group.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * [VPC only] The ID of the VPC for the security group.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object SecurityGroup {
  @scala.inline
  def apply(): SecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroup]
  }
  @scala.inline
  implicit class SecurityGroupOps[Self <: SecurityGroup] (val x: Self) extends AnyVal {
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
    def setIpPermissionsVarargs(value: IpPermission*): Self = this.set("IpPermissions", js.Array(value :_*))
    @scala.inline
    def setIpPermissions(value: IpPermissionList): Self = this.set("IpPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpPermissions: Self = this.set("IpPermissions", js.undefined)
    @scala.inline
    def setIpPermissionsEgressVarargs(value: IpPermission*): Self = this.set("IpPermissionsEgress", js.Array(value :_*))
    @scala.inline
    def setIpPermissionsEgress(value: IpPermissionList): Self = this.set("IpPermissionsEgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpPermissionsEgress: Self = this.set("IpPermissionsEgress", js.undefined)
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

