package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyRecommendationsReceivedResponse extends StObject {
  
  /**
    * The identifiers of recommendations that are causing errors.
    */
  var errors: js.UndefOr[NotifyRecommendationsReceivedErrorList] = js.undefined
  
  /**
    * The identifiers of the recommendations.
    */
  var recommendationIds: js.UndefOr[RecommendationIdList] = js.undefined
}
object NotifyRecommendationsReceivedResponse {
  
  inline def apply(): NotifyRecommendationsReceivedResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyRecommendationsReceivedResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotifyRecommendationsReceivedResponse] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: NotifyRecommendationsReceivedErrorList): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: NotifyRecommendationsReceivedError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setRecommendationIds(value: RecommendationIdList): Self = StObject.set(x, "recommendationIds", value.asInstanceOf[js.Any])
    
    inline def setRecommendationIdsUndefined: Self = StObject.set(x, "recommendationIds", js.undefined)
    
    inline def setRecommendationIdsVarargs(value: String*): Self = StObject.set(x, "recommendationIds", js.Array(value*))
  }
}
