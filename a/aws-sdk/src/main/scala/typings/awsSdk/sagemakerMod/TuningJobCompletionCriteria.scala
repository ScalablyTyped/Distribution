package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TuningJobCompletionCriteria extends StObject {
  
  /**
    * The value of the objective metric.
    */
  var TargetObjectiveMetricValue: typings.awsSdk.sagemakerMod.TargetObjectiveMetricValue
}
object TuningJobCompletionCriteria {
  
  inline def apply(TargetObjectiveMetricValue: TargetObjectiveMetricValue): TuningJobCompletionCriteria = {
    val __obj = js.Dynamic.literal(TargetObjectiveMetricValue = TargetObjectiveMetricValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TuningJobCompletionCriteria]
  }
  
  extension [Self <: TuningJobCompletionCriteria](x: Self) {
    
    inline def setTargetObjectiveMetricValue(value: TargetObjectiveMetricValue): Self = StObject.set(x, "TargetObjectiveMetricValue", value.asInstanceOf[js.Any])
  }
}
