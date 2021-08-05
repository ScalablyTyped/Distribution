package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEC2InstanceRecommendationsResponse extends StObject {
  
  /**
    * An array of objects that describe errors of the request. For example, an error is returned if you request recommendations for an instance of an unsupported instance family.
    */
  var errors: js.UndefOr[GetRecommendationErrors] = js.undefined
  
  /**
    * An array of objects that describe instance recommendations.
    */
  var instanceRecommendations: js.UndefOr[InstanceRecommendations] = js.undefined
  
  /**
    * The token to use to advance to the next page of instance recommendations. This value is null when there are no more pages of instance recommendations to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetEC2InstanceRecommendationsResponse {
  
  inline def apply(): GetEC2InstanceRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEC2InstanceRecommendationsResponse]
  }
  
  extension [Self <: GetEC2InstanceRecommendationsResponse](x: Self) {
    
    inline def setErrors(value: GetRecommendationErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: GetRecommendationError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    inline def setInstanceRecommendations(value: InstanceRecommendations): Self = StObject.set(x, "instanceRecommendations", value.asInstanceOf[js.Any])
    
    inline def setInstanceRecommendationsUndefined: Self = StObject.set(x, "instanceRecommendations", js.undefined)
    
    inline def setInstanceRecommendationsVarargs(value: InstanceRecommendation*): Self = StObject.set(x, "instanceRecommendations", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
