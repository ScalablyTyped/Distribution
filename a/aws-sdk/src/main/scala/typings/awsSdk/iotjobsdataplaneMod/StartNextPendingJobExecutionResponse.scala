package typings.awsSdk.iotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartNextPendingJobExecutionResponse extends js.Object {
  /**
    * A JobExecution object.
    */
  var execution: js.UndefOr[JobExecution] = js.native
}

object StartNextPendingJobExecutionResponse {
  @scala.inline
  def apply(execution: JobExecution = null): StartNextPendingJobExecutionResponse = {
    val __obj = js.Dynamic.literal()
    if (execution != null) __obj.updateDynamic("execution")(execution.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartNextPendingJobExecutionResponse]
  }
}

