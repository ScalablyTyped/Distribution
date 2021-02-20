package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEC2InstanceRecommendationsResponse extends StObject {
  
  /**
    * An array of objects that describe errors of the request. For example, an error is returned if you request recommendations for an instance of an unsupported instance family.
    */
  var errors: js.UndefOr[GetRecommendationErrors] = js.native
  
  /**
    * An array of objects that describe instance recommendations.
    */
  var instanceRecommendations: js.UndefOr[InstanceRecommendations] = js.native
  
  /**
    * The token to use to advance to the next page of instance recommendations. This value is null when there are no more pages of instance recommendations to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object GetEC2InstanceRecommendationsResponse {
  
  @scala.inline
  def apply(): GetEC2InstanceRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEC2InstanceRecommendationsResponse]
  }
  
  @scala.inline
  implicit class GetEC2InstanceRecommendationsResponseMutableBuilder[Self <: GetEC2InstanceRecommendationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: GetRecommendationErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: GetRecommendationError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setInstanceRecommendations(value: InstanceRecommendations): Self = StObject.set(x, "instanceRecommendations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceRecommendationsUndefined: Self = StObject.set(x, "instanceRecommendations", js.undefined)
    
    @scala.inline
    def setInstanceRecommendationsVarargs(value: InstanceRecommendation*): Self = StObject.set(x, "instanceRecommendations", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
