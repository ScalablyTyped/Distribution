package typings.awsSdk.route53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetArchitectureRecommendationsResponse extends StObject {
  
  /**
    * The time that a recovery group was last assessed for recommendations, in UTC ISO-8601 format.
    */
  var LastAuditTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The token that identifies which batch of results you want to see.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * A list of the recommendations for the customer's application.
    */
  var Recommendations: js.UndefOr[listOfRecommendation] = js.undefined
}
object GetArchitectureRecommendationsResponse {
  
  inline def apply(): GetArchitectureRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetArchitectureRecommendationsResponse]
  }
  
  extension [Self <: GetArchitectureRecommendationsResponse](x: Self) {
    
    inline def setLastAuditTimestamp(value: js.Date): Self = StObject.set(x, "LastAuditTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastAuditTimestampUndefined: Self = StObject.set(x, "LastAuditTimestamp", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRecommendations(value: listOfRecommendation): Self = StObject.set(x, "Recommendations", value.asInstanceOf[js.Any])
    
    inline def setRecommendationsUndefined: Self = StObject.set(x, "Recommendations", js.undefined)
    
    inline def setRecommendationsVarargs(value: Recommendation*): Self = StObject.set(x, "Recommendations", js.Array(value*))
  }
}
