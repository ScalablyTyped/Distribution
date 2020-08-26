package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopExecutionTrigger extends js.Object {
  /**
    * The user-specified reason the pipeline was stopped.
    */
  var reason: js.UndefOr[StopPipelineExecutionReason] = js.native
}

object StopExecutionTrigger {
  @scala.inline
  def apply(): StopExecutionTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopExecutionTrigger]
  }
  @scala.inline
  implicit class StopExecutionTriggerOps[Self <: StopExecutionTrigger] (val x: Self) extends AnyVal {
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
    def setReason(value: StopPipelineExecutionReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
  
}

