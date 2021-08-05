package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringStoppingCondition extends StObject {
  
  /**
    * The maximum runtime allowed in seconds.
    */
  var MaxRuntimeInSeconds: MonitoringMaxRuntimeInSeconds
}
object MonitoringStoppingCondition {
  
  inline def apply(MaxRuntimeInSeconds: MonitoringMaxRuntimeInSeconds): MonitoringStoppingCondition = {
    val __obj = js.Dynamic.literal(MaxRuntimeInSeconds = MaxRuntimeInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringStoppingCondition]
  }
  
  extension [Self <: MonitoringStoppingCondition](x: Self) {
    
    inline def setMaxRuntimeInSeconds(value: MonitoringMaxRuntimeInSeconds): Self = StObject.set(x, "MaxRuntimeInSeconds", value.asInstanceOf[js.Any])
  }
}
