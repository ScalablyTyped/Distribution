package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PollForTaskOutput extends js.Object {
  /**
    * The information needed to complete the task that is being assigned to the task runner. One of the fields returned in this object is taskId, which contains an identifier for the task being assigned. The calling task runner uses taskId in subsequent calls to ReportTaskProgress and SetTaskStatus.
    */
  var taskObject: js.UndefOr[TaskObject] = js.native
}

object PollForTaskOutput {
  @scala.inline
  def apply(taskObject: TaskObject = null): PollForTaskOutput = {
    val __obj = js.Dynamic.literal()
    if (taskObject != null) __obj.updateDynamic("taskObject")(taskObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollForTaskOutput]
  }
}

