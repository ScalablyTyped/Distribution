package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRecommendationsResponse extends StObject {
  
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
  implicit class ListRecommendationsResponseMutableBuilder[Self <: ListRecommendationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRecommendationSummaries(value: RecommendationSummaries): Self = StObject.set(x, "RecommendationSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationSummariesUndefined: Self = StObject.set(x, "RecommendationSummaries", js.undefined)
    
    @scala.inline
    def setRecommendationSummariesVarargs(value: RecommendationSummary*): Self = StObject.set(x, "RecommendationSummaries", js.Array(value :_*))
  }
}
