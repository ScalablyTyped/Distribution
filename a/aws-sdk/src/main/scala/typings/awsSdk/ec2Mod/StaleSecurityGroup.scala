package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaleSecurityGroup extends js.Object {
  /**
    * The description of the security group.
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
    * Information about the stale inbound rules in the security group.
    */
  var StaleIpPermissions: js.UndefOr[StaleIpPermissionSet] = js.native
  /**
    * Information about the stale outbound rules in the security group.
    */
  var StaleIpPermissionsEgress: js.UndefOr[StaleIpPermissionSet] = js.native
  /**
    * The ID of the VPC for the security group.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object StaleSecurityGroup {
  @scala.inline
  def apply(): StaleSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaleSecurityGroup]
  }
  @scala.inline
  implicit class StaleSecurityGroupOps[Self <: StaleSecurityGroup] (val x: Self) extends AnyVal {
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
    def setStaleIpPermissionsVarargs(value: StaleIpPermission*): Self = this.set("StaleIpPermissions", js.Array(value :_*))
    @scala.inline
    def setStaleIpPermissions(value: StaleIpPermissionSet): Self = this.set("StaleIpPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaleIpPermissions: Self = this.set("StaleIpPermissions", js.undefined)
    @scala.inline
    def setStaleIpPermissionsEgressVarargs(value: StaleIpPermission*): Self = this.set("StaleIpPermissionsEgress", js.Array(value :_*))
    @scala.inline
    def setStaleIpPermissionsEgress(value: StaleIpPermissionSet): Self = this.set("StaleIpPermissionsEgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaleIpPermissionsEgress: Self = this.set("StaleIpPermissionsEgress", js.undefined)
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

