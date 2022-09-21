package typings.awsSdk.resiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTestRecommendationsResponse extends StObject {
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The test recommendations for the Resilience Hub application.
    */
  var testRecommendations: TestRecommendationList
}
object ListTestRecommendationsResponse {
  
  inline def apply(testRecommendations: TestRecommendationList): ListTestRecommendationsResponse = {
    val __obj = js.Dynamic.literal(testRecommendations = testRecommendations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTestRecommendationsResponse]
  }
  
  extension [Self <: ListTestRecommendationsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTestRecommendations(value: TestRecommendationList): Self = StObject.set(x, "testRecommendations", value.asInstanceOf[js.Any])
    
    inline def setTestRecommendationsVarargs(value: TestRecommendation*): Self = StObject.set(x, "testRecommendations", js.Array(value*))
  }
}
