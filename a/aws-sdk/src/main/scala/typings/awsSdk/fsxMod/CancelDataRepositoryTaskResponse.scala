package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelDataRepositoryTaskResponse extends js.Object {
  /**
    * The lifecycle status of the data repository task, as follows:    PENDING - Amazon FSx has not started the task.    EXECUTING - Amazon FSx is processing the task.    FAILED - Amazon FSx was not able to complete the task. For example, there may be files the task failed to process. The DataRepositoryTaskFailureDetails property provides more information about task failures.    SUCCEEDED - FSx completed the task successfully.    CANCELED - Amazon FSx canceled the task and it did not complete.    CANCELING - FSx is in process of canceling the task.  
    */
  var Lifecycle: js.UndefOr[DataRepositoryTaskLifecycle] = js.native
  /**
    * The ID of the task being canceled.
    */
  var TaskId: js.UndefOr[typings.awsSdk.fsxMod.TaskId] = js.native
}

object CancelDataRepositoryTaskResponse {
  @scala.inline
  def apply(Lifecycle: DataRepositoryTaskLifecycle = null, TaskId: TaskId = null): CancelDataRepositoryTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (Lifecycle != null) __obj.updateDynamic("Lifecycle")(Lifecycle.asInstanceOf[js.Any])
    if (TaskId != null) __obj.updateDynamic("TaskId")(TaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelDataRepositoryTaskResponse]
  }
}

