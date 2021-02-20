package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvideAnomalyFeedbackRequest extends StObject {
  
  /**
    *  A cost anomaly ID. 
    */
  var AnomalyId: GenericString = js.native
  
  /**
    * Describes whether the cost anomaly was a planned activity or you considered it an anomaly. 
    */
  var Feedback: AnomalyFeedbackType = js.native
}
object ProvideAnomalyFeedbackRequest {
  
  @scala.inline
  def apply(AnomalyId: GenericString, Feedback: AnomalyFeedbackType): ProvideAnomalyFeedbackRequest = {
    val __obj = js.Dynamic.literal(AnomalyId = AnomalyId.asInstanceOf[js.Any], Feedback = Feedback.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvideAnomalyFeedbackRequest]
  }
  
  @scala.inline
  implicit class ProvideAnomalyFeedbackRequestMutableBuilder[Self <: ProvideAnomalyFeedbackRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnomalyId(value: GenericString): Self = StObject.set(x, "AnomalyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedback(value: AnomalyFeedbackType): Self = StObject.set(x, "Feedback", value.asInstanceOf[js.Any])
  }
}
