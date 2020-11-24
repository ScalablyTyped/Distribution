package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): GetRecommendationSummariesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRecommendationSummariesResponse]
  }
  
  @scala.inline
  implicit class GetRecommendationSummariesResponseOps[Self <: GetRecommendationSummariesResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setRecommendationSummariesVarargs(value: RecommendationSummary*): Self = this.set("recommendationSummaries", js.Array(value :_*))
    
    @scala.inline
    def setRecommendationSummaries(value: RecommendationSummaries): Self = this.set("recommendationSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendationSummaries: Self = this.set("recommendationSummaries", js.undefined)
  }
}
