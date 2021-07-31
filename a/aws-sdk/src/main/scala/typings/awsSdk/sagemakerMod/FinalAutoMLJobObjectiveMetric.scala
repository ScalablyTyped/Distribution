package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinalAutoMLJobObjectiveMetric extends StObject {
  
  /**
    * The name of the metric with the best result. For a description of the possible objective metrics, see AutoMLJobObjective$MetricName.
    */
  var MetricName: AutoMLMetricEnum
  
  /**
    * The type of metric with the best result.
    */
  var Type: js.UndefOr[AutoMLJobObjectiveType] = js.undefined
  
  /**
    * The value of the metric with the best result.
    */
  var Value: MetricValue
}
object FinalAutoMLJobObjectiveMetric {
  
  @scala.inline
  def apply(MetricName: AutoMLMetricEnum, Value: MetricValue): FinalAutoMLJobObjectiveMetric = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalAutoMLJobObjectiveMetric]
  }
  
  @scala.inline
  implicit class FinalAutoMLJobObjectiveMetricMutableBuilder[Self <: FinalAutoMLJobObjectiveMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricName(value: AutoMLMetricEnum): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AutoMLJobObjectiveType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setValue(value: MetricValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
