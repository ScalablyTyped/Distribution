package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvideAnomalyFeedbackResponse extends StObject {
  
  /**
    * The ID of the modified cost anomaly. 
    */
  var AnomalyId: GenericString
}
object ProvideAnomalyFeedbackResponse {
  
  inline def apply(AnomalyId: GenericString): ProvideAnomalyFeedbackResponse = {
    val __obj = js.Dynamic.literal(AnomalyId = AnomalyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvideAnomalyFeedbackResponse]
  }
  
  extension [Self <: ProvideAnomalyFeedbackResponse](x: Self) {
    
    inline def setAnomalyId(value: GenericString): Self = StObject.set(x, "AnomalyId", value.asInstanceOf[js.Any])
  }
}
