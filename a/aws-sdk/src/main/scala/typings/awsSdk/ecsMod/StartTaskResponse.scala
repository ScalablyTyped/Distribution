package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTaskResponse extends js.Object {
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.native
  /**
    * A full description of the tasks that were started. Each task that was successfully placed on your container instances is described.
    */
  var tasks: js.UndefOr[Tasks] = js.native
}

object StartTaskResponse {
  @scala.inline
  def apply(failures: Failures = null, tasks: Tasks = null): StartTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (failures != null) __obj.updateDynamic("failures")(failures.asInstanceOf[js.Any])
    if (tasks != null) __obj.updateDynamic("tasks")(tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTaskResponse]
  }
}

