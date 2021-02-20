package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoringStoppingCondition extends StObject {
  
  /**
    * The maximum runtime allowed in seconds.
    */
  var MaxRuntimeInSeconds: MonitoringMaxRuntimeInSeconds = js.native
}
object MonitoringStoppingCondition {
  
  @scala.inline
  def apply(MaxRuntimeInSeconds: MonitoringMaxRuntimeInSeconds): MonitoringStoppingCondition = {
    val __obj = js.Dynamic.literal(MaxRuntimeInSeconds = MaxRuntimeInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringStoppingCondition]
  }
  
  @scala.inline
  implicit class MonitoringStoppingConditionMutableBuilder[Self <: MonitoringStoppingCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxRuntimeInSeconds(value: MonitoringMaxRuntimeInSeconds): Self = StObject.set(x, "MaxRuntimeInSeconds", value.asInstanceOf[js.Any])
  }
}
