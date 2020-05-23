package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSecurityGroupRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the security group. Required for a nondefault VPC.
    */
  var GroupId: js.UndefOr[SecurityGroupId] = js.native
  /**
    * [EC2-Classic, default VPC] The name of the security group. You can specify either the security group name or the security group ID.
    */
  var GroupName: js.UndefOr[SecurityGroupName] = js.native
}

object DeleteSecurityGroupRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    GroupId: SecurityGroupId = null,
    GroupName: SecurityGroupName = null
  ): DeleteSecurityGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId.asInstanceOf[js.Any])
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSecurityGroupRequest]
  }
}

