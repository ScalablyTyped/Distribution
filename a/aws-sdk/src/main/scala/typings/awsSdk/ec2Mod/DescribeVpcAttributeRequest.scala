package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcAttributeRequest extends js.Object {
  /**
    * The VPC attribute.
    */
  var Attribute: VpcAttributeName = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: String = js.native
}

object DescribeVpcAttributeRequest {
  @scala.inline
  def apply(Attribute: VpcAttributeName, VpcId: String, DryRun: js.UndefOr[scala.Boolean] = js.undefined): DescribeVpcAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcAttributeRequest]
  }
}

