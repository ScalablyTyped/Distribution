package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HyperParameterTuningJobObjective extends StObject {
  
  /**
    * The name of the metric to use for the objective metric.
    */
  var MetricName: typings.awsSdk.sagemakerMod.MetricName
  
  /**
    * Whether to minimize or maximize the objective metric.
    */
  var Type: HyperParameterTuningJobObjectiveType
}
object HyperParameterTuningJobObjective {
  
  @scala.inline
  def apply(MetricName: MetricName, Type: HyperParameterTuningJobObjectiveType): HyperParameterTuningJobObjective = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterTuningJobObjective]
  }
  
  @scala.inline
  implicit class HyperParameterTuningJobObjectiveMutableBuilder[Self <: HyperParameterTuningJobObjective] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: HyperParameterTuningJobObjectiveType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
