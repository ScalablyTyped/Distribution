package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAutoScalingGroupRecommendationsResponse extends StObject {
  
  /**
    * An array of objects that describe Auto Scaling group recommendations.
    */
  var autoScalingGroupRecommendations: js.UndefOr[AutoScalingGroupRecommendations] = js.undefined
  
  /**
    * An array of objects that describe errors of the request. For example, an error is returned if you request recommendations for an unsupported Auto Scaling group.
    */
  var errors: js.UndefOr[GetRecommendationErrors] = js.undefined
  
  /**
    * The token to use to advance to the next page of Auto Scaling group recommendations. This value is null when there are no more pages of Auto Scaling group recommendations to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetAutoScalingGroupRecommendationsResponse {
  
  inline def apply(): GetAutoScalingGroupRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAutoScalingGroupRecommendationsResponse]
  }
  
  extension [Self <: GetAutoScalingGroupRecommendationsResponse](x: Self) {
    
    inline def setAutoScalingGroupRecommendations(value: AutoScalingGroupRecommendations): Self = StObject.set(x, "autoScalingGroupRecommendations", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingGroupRecommendationsUndefined: Self = StObject.set(x, "autoScalingGroupRecommendations", js.undefined)
    
    inline def setAutoScalingGroupRecommendationsVarargs(value: AutoScalingGroupRecommendation*): Self = StObject.set(x, "autoScalingGroupRecommendations", js.Array(value*))
    
    inline def setErrors(value: GetRecommendationErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: GetRecommendationError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
