package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinalHyperParameterTuningJobObjectiveMetric extends StObject {
  
  /**
    * The name of the objective metric.
    */
  var MetricName: typings.awsSdk.sagemakerMod.MetricName
  
  /**
    * Whether to minimize or maximize the objective metric. Valid values are Minimize and Maximize.
    */
  var Type: js.UndefOr[HyperParameterTuningJobObjectiveType] = js.undefined
  
  /**
    * The value of the objective metric.
    */
  var Value: MetricValue
}
object FinalHyperParameterTuningJobObjectiveMetric {
  
  @scala.inline
  def apply(MetricName: MetricName, Value: MetricValue): FinalHyperParameterTuningJobObjectiveMetric = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalHyperParameterTuningJobObjectiveMetric]
  }
  
  @scala.inline
  implicit class FinalHyperParameterTuningJobObjectiveMetricMutableBuilder[Self <: FinalHyperParameterTuningJobObjectiveMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: HyperParameterTuningJobObjectiveType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setValue(value: MetricValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
