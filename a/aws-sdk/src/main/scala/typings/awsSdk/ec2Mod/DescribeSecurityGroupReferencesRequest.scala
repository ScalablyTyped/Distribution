package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSecurityGroupReferencesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The IDs of the security groups in your account.
    */
  var GroupId: GroupIds = js.native
}

object DescribeSecurityGroupReferencesRequest {
  @scala.inline
  def apply(GroupId: GroupIds, DryRun: js.UndefOr[scala.Boolean] = js.undefined): DescribeSecurityGroupReferencesRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSecurityGroupReferencesRequest]
  }
}

