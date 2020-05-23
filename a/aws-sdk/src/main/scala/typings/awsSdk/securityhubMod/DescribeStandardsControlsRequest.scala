package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStandardsControlsRequest extends js.Object {
  /**
    * The maximum number of security standard controls to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.securityhubMod.MaxResults] = js.native
  /**
    * The token that is required for pagination. On your first call to the DescribeStandardsControls operation, set the value of this parameter to NULL. For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value returned from the previous response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
  /**
    * The ARN of a resource that represents your subscription to a supported standard.
    */
  var StandardsSubscriptionArn: NonEmptyString = js.native
}

object DescribeStandardsControlsRequest {
  @scala.inline
  def apply(
    StandardsSubscriptionArn: NonEmptyString,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): DescribeStandardsControlsRequest = {
    val __obj = js.Dynamic.literal(StandardsSubscriptionArn = StandardsSubscriptionArn.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStandardsControlsRequest]
  }
}

