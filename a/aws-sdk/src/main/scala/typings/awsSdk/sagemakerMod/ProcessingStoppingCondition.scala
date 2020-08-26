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
  @scala.inline
  implicit class ProcessingStoppingConditionOps[Self <: ProcessingStoppingCondition] (val x: Self) extends AnyVal {
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
    def setMaxRuntimeInSeconds(value: ProcessingMaxRuntimeInSeconds): Self = this.set("MaxRuntimeInSeconds", value.asInstanceOf[js.Any])
  }
  
}

