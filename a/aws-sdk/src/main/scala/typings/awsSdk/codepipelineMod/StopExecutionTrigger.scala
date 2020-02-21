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
  def apply(reason: StopPipelineExecutionReason = null): StopExecutionTrigger = {
    val __obj = js.Dynamic.literal()
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopExecutionTrigger]
  }
}

