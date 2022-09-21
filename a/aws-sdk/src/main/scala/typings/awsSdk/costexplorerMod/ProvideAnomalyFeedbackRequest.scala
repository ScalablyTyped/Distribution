package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvideAnomalyFeedbackRequest extends StObject {
  
  /**
    * A cost anomaly ID. 
    */
  var AnomalyId: GenericString
  
  /**
    * Describes whether the cost anomaly was a planned activity or you considered it an anomaly. 
    */
  var Feedback: AnomalyFeedbackType
}
object ProvideAnomalyFeedbackRequest {
  
  inline def apply(AnomalyId: GenericString, Feedback: AnomalyFeedbackType): ProvideAnomalyFeedbackRequest = {
    val __obj = js.Dynamic.literal(AnomalyId = AnomalyId.asInstanceOf[js.Any], Feedback = Feedback.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvideAnomalyFeedbackRequest]
  }
  
  extension [Self <: ProvideAnomalyFeedbackRequest](x: Self) {
    
    inline def setAnomalyId(value: GenericString): Self = StObject.set(x, "AnomalyId", value.asInstanceOf[js.Any])
    
    inline def setFeedback(value: AnomalyFeedbackType): Self = StObject.set(x, "Feedback", value.asInstanceOf[js.Any])
  }
}
