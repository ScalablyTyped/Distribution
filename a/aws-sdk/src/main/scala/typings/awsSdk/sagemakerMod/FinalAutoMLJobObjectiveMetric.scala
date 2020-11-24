package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinalAutoMLJobObjectiveMetric extends js.Object {
  
  /**
    * The name of the metric with the best result. For a description of the possible objective metrics, see AutoMLJobObjective$MetricName.
    */
  var MetricName: AutoMLMetricEnum = js.native
  
  /**
    * The type of metric with the best result.
    */
  var Type: js.UndefOr[AutoMLJobObjectiveType] = js.native
  
  /**
    * The value of the metric with the best result.
    */
  var Value: MetricValue = js.native
}
object FinalAutoMLJobObjectiveMetric {
  
  @scala.inline
  def apply(MetricName: AutoMLMetricEnum, Value: MetricValue): FinalAutoMLJobObjectiveMetric = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalAutoMLJobObjectiveMetric]
  }
  
  @scala.inline
  implicit class FinalAutoMLJobObjectiveMetricOps[Self <: FinalAutoMLJobObjectiveMetric] (val x: Self) extends AnyVal {
    
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
    def setMetricName(value: AutoMLMetricEnum): Self = this.set("MetricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: MetricValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AutoMLJobObjectiveType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
