package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TuningJobCompletionCriteria extends js.Object {
  
  /**
    * The value of the objective metric.
    */
  var TargetObjectiveMetricValue: typings.awsSdk.sagemakerMod.TargetObjectiveMetricValue = js.native
}
object TuningJobCompletionCriteria {
  
  @scala.inline
  def apply(TargetObjectiveMetricValue: TargetObjectiveMetricValue): TuningJobCompletionCriteria = {
    val __obj = js.Dynamic.literal(TargetObjectiveMetricValue = TargetObjectiveMetricValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TuningJobCompletionCriteria]
  }
  
  @scala.inline
  implicit class TuningJobCompletionCriteriaOps[Self <: TuningJobCompletionCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTargetObjectiveMetricValue(value: TargetObjectiveMetricValue): Self = this.set("TargetObjectiveMetricValue", value.asInstanceOf[js.Any])
  }
}
