package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstanceAttributeRequest extends js.Object {
  /**
    * The instance attribute. Note: The enaSupport attribute is not supported at this time.
    */
  var Attribute: InstanceAttributeName = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: typings.awsSdk.ec2Mod.InstanceId = js.native
}

object DescribeInstanceAttributeRequest {
  @scala.inline
  def apply(
    Attribute: InstanceAttributeName,
    InstanceId: InstanceId,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): DescribeInstanceAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstanceAttributeRequest]
  }
}

