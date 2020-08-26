package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyAvailabilityZoneGroupRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The name of the Availability Zone Group.
    */
  var GroupName: String = js.native
  /**
    * Indicates whether to enable or disable membership. The valid values are opted-in. You must contact AWS Support to disable an Availability Zone group.
    */
  var OptInStatus: ModifyAvailabilityZoneOptInStatus = js.native
}

object ModifyAvailabilityZoneGroupRequest {
  @scala.inline
  def apply(GroupName: String, OptInStatus: ModifyAvailabilityZoneOptInStatus): ModifyAvailabilityZoneGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], OptInStatus = OptInStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyAvailabilityZoneGroupRequest]
  }
  @scala.inline
  implicit class ModifyAvailabilityZoneGroupRequestOps[Self <: ModifyAvailabilityZoneGroupRequest] (val x: Self) extends AnyVal {
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
    def setGroupName(value: String): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptInStatus(value: ModifyAvailabilityZoneOptInStatus): Self = this.set("OptInStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
  
}

