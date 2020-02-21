package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEnabledStandardsRequest extends js.Object {
  /**
    * The maximum number of results to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.securityhubMod.MaxResults] = js.native
  /**
    * The token that is required for pagination. On your first call to the GetEnabledStandards operation, set the value of this parameter to NULL. For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value returned from the previous response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
  /**
    * The list of the standards subscription ARNs for the standards to retrieve.
    */
  var StandardsSubscriptionArns: js.UndefOr[typings.awsSdk.securityhubMod.StandardsSubscriptionArns] = js.native
}

object GetEnabledStandardsRequest {
  @scala.inline
  def apply(
    MaxResults: Int | scala.Double = null,
    NextToken: NextToken = null,
    StandardsSubscriptionArns: StandardsSubscriptionArns = null
  ): GetEnabledStandardsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StandardsSubscriptionArns != null) __obj.updateDynamic("StandardsSubscriptionArns")(StandardsSubscriptionArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEnabledStandardsRequest]
  }
}

