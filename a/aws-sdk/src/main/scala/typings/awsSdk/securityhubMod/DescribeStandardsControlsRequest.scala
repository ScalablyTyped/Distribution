package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStandardsControlsRequest extends js.Object {
  /**
    * The maximum number of compliance standard controls to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.securityhubMod.MaxResults] = js.native
  /**
    * For requests to get the next page of results, the pagination token that was returned with the previous set of results. The initial request does not include a pagination token.
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
    MaxResults: Int | scala.Double = null,
    NextToken: NextToken = null
  ): DescribeStandardsControlsRequest = {
    val __obj = js.Dynamic.literal(StandardsSubscriptionArn = StandardsSubscriptionArn.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStandardsControlsRequest]
  }
}

