package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecommendationFeedbackResponse extends StObject {
  
  /**
    *  If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.codegurureviewerMod.NextToken] = js.undefined
  
  /**
    *  Recommendation feedback summaries corresponding to the code review ARN. 
    */
  var RecommendationFeedbackSummaries: js.UndefOr[typings.awsSdk.codegurureviewerMod.RecommendationFeedbackSummaries] = js.undefined
}
object ListRecommendationFeedbackResponse {
  
  @scala.inline
  def apply(): ListRecommendationFeedbackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecommendationFeedbackResponse]
  }
  
  @scala.inline
  implicit class ListRecommendationFeedbackResponseMutableBuilder[Self <: ListRecommendationFeedbackResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRecommendationFeedbackSummaries(value: RecommendationFeedbackSummaries): Self = StObject.set(x, "RecommendationFeedbackSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationFeedbackSummariesUndefined: Self = StObject.set(x, "RecommendationFeedbackSummaries", js.undefined)
    
    @scala.inline
    def setRecommendationFeedbackSummariesVarargs(value: RecommendationFeedbackSummary*): Self = StObject.set(x, "RecommendationFeedbackSummaries", js.Array(value :_*))
  }
}
