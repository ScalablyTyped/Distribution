package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyMountTargetSecurityGroupsRequest extends js.Object {
  /**
    * The ID of the mount target whose security groups you want to modify.
    */
  var MountTargetId: typings.awsSdk.efsMod.MountTargetId = js.native
  /**
    * An array of up to five VPC security group IDs.
    */
  var SecurityGroups: js.UndefOr[typings.awsSdk.efsMod.SecurityGroups] = js.native
}

object ModifyMountTargetSecurityGroupsRequest {
  @scala.inline
  def apply(MountTargetId: MountTargetId): ModifyMountTargetSecurityGroupsRequest = {
    val __obj = js.Dynamic.literal(MountTargetId = MountTargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyMountTargetSecurityGroupsRequest]
  }
  @scala.inline
  implicit class ModifyMountTargetSecurityGroupsRequestOps[Self <: ModifyMountTargetSecurityGroupsRequest] (val x: Self) extends AnyVal {
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
    def setMountTargetId(value: MountTargetId): Self = this.set("MountTargetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroup*): Self = this.set("SecurityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: SecurityGroups): Self = this.set("SecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroups: Self = this.set("SecurityGroups", js.undefined)
  }
  
}

