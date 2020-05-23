package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRecommendationsResponse extends js.Object {
  /**
    *  Pagination token. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.codegurureviewerMod.NextToken] = js.native
  /**
    *  List of recommendations for the requested code review. 
    */
  var RecommendationSummaries: js.UndefOr[typings.awsSdk.codegurureviewerMod.RecommendationSummaries] = js.native
}

object ListRecommendationsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, RecommendationSummaries: RecommendationSummaries = null): ListRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RecommendationSummaries != null) __obj.updateDynamic("RecommendationSummaries")(RecommendationSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRecommendationsResponse]
  }
}

