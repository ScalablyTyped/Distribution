package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessingStoppingCondition extends js.Object {
  /**
    * Specifies the maximum runtime in seconds.
    */
  var MaxRuntimeInSeconds: ProcessingMaxRuntimeInSeconds = js.native
}

object ProcessingStoppingCondition {
  @scala.inline
  def apply(MaxRuntimeInSeconds: ProcessingMaxRuntimeInSeconds): ProcessingStoppingCondition = {
    val __obj = js.Dynamic.literal(MaxRuntimeInSeconds = MaxRuntimeInSeconds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProcessingStoppingCondition]
  }
}

