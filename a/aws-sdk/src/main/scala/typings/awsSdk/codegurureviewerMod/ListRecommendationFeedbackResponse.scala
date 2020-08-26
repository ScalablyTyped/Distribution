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
  def apply(): ListRecommendationFeedbackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecommendationFeedbackResponse]
  }
  @scala.inline
  implicit class ListRecommendationFeedbackResponseOps[Self <: ListRecommendationFeedbackResponse] (val x: Self) extends AnyVal {
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
    def setRecommendationFeedbackSummariesVarargs(value: RecommendationFeedbackSummary*): Self = this.set("RecommendationFeedbackSummaries", js.Array(value :_*))
    @scala.inline
    def setRecommendationFeedbackSummaries(value: RecommendationFeedbackSummaries): Self = this.set("RecommendationFeedbackSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecommendationFeedbackSummaries: Self = this.set("RecommendationFeedbackSummaries", js.undefined)
  }
  
}

