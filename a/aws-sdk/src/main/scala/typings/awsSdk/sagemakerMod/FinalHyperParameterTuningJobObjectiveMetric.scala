package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinalHyperParameterTuningJobObjectiveMetric extends js.Object {
  
  /**
    * The name of the objective metric.
    */
  var MetricName: typings.awsSdk.sagemakerMod.MetricName = js.native
  
  /**
    * Whether to minimize or maximize the objective metric. Valid values are Minimize and Maximize.
    */
  var Type: js.UndefOr[HyperParameterTuningJobObjectiveType] = js.native
  
  /**
    * The value of the objective metric.
    */
  var Value: MetricValue = js.native
}
object FinalHyperParameterTuningJobObjectiveMetric {
  
  @scala.inline
  def apply(MetricName: MetricName, Value: MetricValue): FinalHyperParameterTuningJobObjectiveMetric = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalHyperParameterTuningJobObjectiveMetric]
  }
  
  @scala.inline
  implicit class FinalHyperParameterTuningJobObjectiveMetricOps[Self <: FinalHyperParameterTuningJobObjectiveMetric] (val x: Self) extends AnyVal {
    
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
    def setMetricName(value: MetricName): Self = this.set("MetricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: MetricValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: HyperParameterTuningJobObjectiveType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
