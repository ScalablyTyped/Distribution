package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

