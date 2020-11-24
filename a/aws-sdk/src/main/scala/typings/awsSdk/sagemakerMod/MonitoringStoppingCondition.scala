package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoringStoppingCondition extends js.Object {
  
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
  implicit class MonitoringStoppingConditionOps[Self <: MonitoringStoppingCondition] (val x: Self) extends AnyVal {
    
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
    def setMaxRuntimeInSeconds(value: MonitoringMaxRuntimeInSeconds): Self = this.set("MaxRuntimeInSeconds", value.asInstanceOf[js.Any])
  }
}
