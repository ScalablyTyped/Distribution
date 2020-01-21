package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSecurityGroupRequest extends js.Object {
  /**
    * A description for the security group. This is informational only. Constraints: Up to 255 characters in length Constraints for EC2-Classic: ASCII characters Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$*
    */
  var Description: String = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The name of the security group. Constraints: Up to 255 characters in length. Cannot start with sg-. Constraints for EC2-Classic: ASCII characters Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$*
    */
  var GroupName: String = js.native
  /**
    * [EC2-VPC] The ID of the VPC. Required for EC2-VPC.
    */
  var VpcId: js.UndefOr[typings.awsSdk.ec2Mod.VpcId] = js.native
}

object CreateSecurityGroupRequest {
  @scala.inline
  def apply(
    Description: String,
    GroupName: String,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    VpcId: VpcId = null
  ): CreateSecurityGroupRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], GroupName = GroupName.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSecurityGroupRequest]
  }
}

