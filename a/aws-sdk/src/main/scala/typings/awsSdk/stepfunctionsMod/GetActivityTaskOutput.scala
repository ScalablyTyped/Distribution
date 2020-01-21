package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetActivityTaskOutput extends js.Object {
  /**
    * The string that contains the JSON input data for the task.
    */
  var input: js.UndefOr[SensitiveDataJobInput] = js.native
  /**
    * A token that identifies the scheduled task. This token must be copied and included in subsequent calls to SendTaskHeartbeat, SendTaskSuccess or SendTaskFailure in order to report the progress or completion of the task.
    */
  var taskToken: js.UndefOr[TaskToken] = js.native
}

object GetActivityTaskOutput {
  @scala.inline
  def apply(input: SensitiveDataJobInput = null, taskToken: TaskToken = null): GetActivityTaskOutput = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (taskToken != null) __obj.updateDynamic("taskToken")(taskToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetActivityTaskOutput]
  }
}

