package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyRecommendationsReceivedError extends StObject {
  
  /**
    * A recommendation is causing an error.
    */
  var message: js.UndefOr[NotifyRecommendationsReceivedErrorMessage] = js.undefined
  
  /**
    * The identifier of the recommendation that is in error.
    */
  var recommendationId: js.UndefOr[String] = js.undefined
}
object NotifyRecommendationsReceivedError {
  
  inline def apply(): NotifyRecommendationsReceivedError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyRecommendationsReceivedError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotifyRecommendationsReceivedError] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: NotifyRecommendationsReceivedErrorMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setRecommendationId(value: String): Self = StObject.set(x, "recommendationId", value.asInstanceOf[js.Any])
    
    inline def setRecommendationIdUndefined: Self = StObject.set(x, "recommendationId", js.undefined)
  }
}
