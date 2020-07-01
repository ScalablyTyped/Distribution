package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRecommendationFeedbackResponse extends js.Object {
  /**
    *  If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.codegurureviewerMod.NextToken] = js.native
  /**
    *  Recommendation feedback summaries corresponding to the code review ARN. 
    */
  var RecommendationFeedbackSummaries: js.UndefOr[typings.awsSdk.codegurureviewerMod.RecommendationFeedbackSummaries] = js.native
}

object ListRecommendationFeedbackResponse {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    RecommendationFeedbackSummaries: RecommendationFeedbackSummaries = null
  ): ListRecommendationFeedbackResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RecommendationFeedbackSummaries != null) __obj.updateDynamic("RecommendationFeedbackSummaries")(RecommendationFeedbackSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRecommendationFeedbackResponse]
  }
}

