package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRecommendationSummariesResponse extends js.Object {
  /**
    * The token to use to advance to the next page of recommendation summaries. This value is null when there are no more pages of recommendation summaries to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * An array of objects that summarize a recommendation.
    */
  var recommendationSummaries: js.UndefOr[RecommendationSummaries] = js.native
}

object GetRecommendationSummariesResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, recommendationSummaries: RecommendationSummaries = null): GetRecommendationSummariesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (recommendationSummaries != null) __obj.updateDynamic("recommendationSummaries")(recommendationSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecommendationSummariesResponse]
  }
}

