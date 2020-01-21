package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccountAttributesRequest extends js.Object {
  /**
    * The account attribute names.
    */
  var AttributeNames: js.UndefOr[AccountAttributeNameStringList] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
}

object DescribeAccountAttributesRequest {
  @scala.inline
  def apply(
    AttributeNames: AccountAttributeNameStringList = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): DescribeAccountAttributesRequest = {
    val __obj = js.Dynamic.literal()
    if (AttributeNames != null) __obj.updateDynamic("AttributeNames")(AttributeNames.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountAttributesRequest]
  }
}

