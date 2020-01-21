package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTaskExecutionRequest extends js.Object {
  /**
    * A list of filter rules that determines which files to include when running a task. The pattern should contain a single filter string that consists of the patterns to include. The patterns are delimited by "|" (that is, a pipe). For example: "/folder1|/folder2"   
    */
  var Includes: js.UndefOr[FilterList] = js.native
  var OverrideOptions: js.UndefOr[Options] = js.native
  /**
    * The Amazon Resource Name (ARN) of the task to start.
    */
  var TaskArn: typings.awsSdk.datasyncMod.TaskArn = js.native
}

object StartTaskExecutionRequest {
  @scala.inline
  def apply(TaskArn: TaskArn, Includes: FilterList = null, OverrideOptions: Options = null): StartTaskExecutionRequest = {
    val __obj = js.Dynamic.literal(TaskArn = TaskArn.asInstanceOf[js.Any])
    if (Includes != null) __obj.updateDynamic("Includes")(Includes.asInstanceOf[js.Any])
    if (OverrideOptions != null) __obj.updateDynamic("OverrideOptions")(OverrideOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTaskExecutionRequest]
  }
}

