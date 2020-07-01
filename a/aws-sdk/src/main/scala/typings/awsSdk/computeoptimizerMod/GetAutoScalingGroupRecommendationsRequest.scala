package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAutoScalingGroupRecommendationsRequest extends js.Object {
  /**
    * The IDs of the AWS accounts for which to return Auto Scaling group recommendations. If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return Auto Scaling group recommendations. Only one account ID can be specified per request.
    */
  var accountIds: js.UndefOr[AccountIds] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Auto Scaling groups for which to return recommendations.
    */
  var autoScalingGroupArns: js.UndefOr[AutoScalingGroupArns] = js.native
  /**
    * An array of objects that describe a filter that returns a more specific list of Auto Scaling group recommendations.
    */
  var filters: js.UndefOr[Filters] = js.native
  /**
    * The maximum number of Auto Scaling group recommendations to return with a single request. To retrieve the remaining results, make another request with the returned NextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token to advance to the next page of Auto Scaling group recommendations.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetAutoScalingGroupRecommendationsRequest {
  @scala.inline
  def apply(
    accountIds: AccountIds = null,
    autoScalingGroupArns: AutoScalingGroupArns = null,
    filters: Filters = null,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null
  ): GetAutoScalingGroupRecommendationsRequest = {
    val __obj = js.Dynamic.literal()
    if (accountIds != null) __obj.updateDynamic("accountIds")(accountIds.asInstanceOf[js.Any])
    if (autoScalingGroupArns != null) __obj.updateDynamic("autoScalingGroupArns")(autoScalingGroupArns.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAutoScalingGroupRecommendationsRequest]
  }
}

