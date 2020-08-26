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
  def apply(): ListRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecommendationsResponse]
  }
  @scala.inline
  implicit class ListRecommendationsResponseOps[Self <: ListRecommendationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setRecommendationSummariesVarargs(value: RecommendationSummary*): Self = this.set("RecommendationSummaries", js.Array(value :_*))
    @scala.inline
    def setRecommendationSummaries(value: RecommendationSummaries): Self = this.set("RecommendationSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecommendationSummaries: Self = this.set("RecommendationSummaries", js.undefined)
  }
  
}

