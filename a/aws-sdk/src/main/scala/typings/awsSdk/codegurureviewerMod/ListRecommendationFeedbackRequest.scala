package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRecommendationFeedbackRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) that identifies the code review. 
    */
  var CodeReviewArn: Arn = js.native
  /**
    *  The maximum number of results that are returned per call. The default is 100. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.codegurureviewerMod.MaxResults] = js.native
  /**
    *  If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.codegurureviewerMod.NextToken] = js.native
  /**
    *  Filter on recommendationIds that need to be applied before displaying the result. This can be used to query all the recommendation feedback for a given recommendation. 
    */
  var RecommendationIds: js.UndefOr[typings.awsSdk.codegurureviewerMod.RecommendationIds] = js.native
  /**
    *  Filter on userIds that need to be applied before displaying the result. This can be used to query all the recommendation feedback for a code review from a given user. 
    */
  var UserIds: js.UndefOr[typings.awsSdk.codegurureviewerMod.UserIds] = js.native
}

object ListRecommendationFeedbackRequest {
  @scala.inline
  def apply(
    CodeReviewArn: Arn,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    RecommendationIds: RecommendationIds = null,
    UserIds: UserIds = null
  ): ListRecommendationFeedbackRequest = {
    val __obj = js.Dynamic.literal(CodeReviewArn = CodeReviewArn.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RecommendationIds != null) __obj.updateDynamic("RecommendationIds")(RecommendationIds.asInstanceOf[js.Any])
    if (UserIds != null) __obj.updateDynamic("UserIds")(UserIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRecommendationFeedbackRequest]
  }
}

