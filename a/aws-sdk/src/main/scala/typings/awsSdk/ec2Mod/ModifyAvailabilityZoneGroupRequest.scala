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
  def apply(
    GroupName: String,
    OptInStatus: ModifyAvailabilityZoneOptInStatus,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): ModifyAvailabilityZoneGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], OptInStatus = OptInStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyAvailabilityZoneGroupRequest]
  }
}

