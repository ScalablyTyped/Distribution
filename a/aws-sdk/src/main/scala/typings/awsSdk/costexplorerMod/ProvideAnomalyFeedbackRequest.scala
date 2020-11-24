package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvideAnomalyFeedbackRequest extends js.Object {
  
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
  implicit class ProvideAnomalyFeedbackRequestOps[Self <: ProvideAnomalyFeedbackRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnomalyId(value: GenericString): Self = this.set("AnomalyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedback(value: AnomalyFeedbackType): Self = this.set("Feedback", value.asInstanceOf[js.Any])
  }
}
