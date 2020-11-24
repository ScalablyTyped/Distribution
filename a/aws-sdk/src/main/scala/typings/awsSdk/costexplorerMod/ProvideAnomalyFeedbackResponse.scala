package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvideAnomalyFeedbackResponse extends js.Object {
  
  /**
    *  The ID of the modified cost anomaly. 
    */
  var AnomalyId: GenericString = js.native
}
object ProvideAnomalyFeedbackResponse {
  
  @scala.inline
  def apply(AnomalyId: GenericString): ProvideAnomalyFeedbackResponse = {
    val __obj = js.Dynamic.literal(AnomalyId = AnomalyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvideAnomalyFeedbackResponse]
  }
  
  @scala.inline
  implicit class ProvideAnomalyFeedbackResponseOps[Self <: ProvideAnomalyFeedbackResponse] (val x: Self) extends AnyVal {
    
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
  }
}
