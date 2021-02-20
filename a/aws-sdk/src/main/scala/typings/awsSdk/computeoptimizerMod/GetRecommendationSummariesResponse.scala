package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRecommendationSummariesResponse extends StObject {
  
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
  implicit class GetRecommendationSummariesResponseMutableBuilder[Self <: GetRecommendationSummariesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setRecommendationSummaries(value: RecommendationSummaries): Self = StObject.set(x, "recommendationSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationSummariesUndefined: Self = StObject.set(x, "recommendationSummaries", js.undefined)
    
    @scala.inline
    def setRecommendationSummariesVarargs(value: RecommendationSummary*): Self = StObject.set(x, "recommendationSummaries", js.Array(value :_*))
  }
}
