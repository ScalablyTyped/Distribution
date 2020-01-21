package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetTaskStatusInput extends js.Object {
  /**
    * If an error occurred during the task, this value specifies the error code. This value is set on the physical attempt object. It is used to display error information to the user. It should not start with string "Service_" which is reserved by the system.
    */
  var errorId: js.UndefOr[String] = js.native
  /**
    * If an error occurred during the task, this value specifies a text description of the error. This value is set on the physical attempt object. It is used to display error information to the user. The web service does not parse this value.
    */
  var errorMessage: js.UndefOr[typings.awsSdk.datapipelineMod.errorMessage] = js.native
  /**
    * If an error occurred during the task, this value specifies the stack trace associated with the error. This value is set on the physical attempt object. It is used to display error information to the user. The web service does not parse this value.
    */
  var errorStackTrace: js.UndefOr[String] = js.native
  /**
    * The ID of the task assigned to the task runner. This value is provided in the response for PollForTask.
    */
  var taskId: typings.awsSdk.datapipelineMod.taskId = js.native
  /**
    * If FINISHED, the task successfully completed. If FAILED, the task ended unsuccessfully. Preconditions use false.
    */
  var taskStatus: TaskStatus = js.native
}

object SetTaskStatusInput {
  @scala.inline
  def apply(
    taskId: taskId,
    taskStatus: TaskStatus,
    errorId: String = null,
    errorMessage: errorMessage = null,
    errorStackTrace: String = null
  ): SetTaskStatusInput = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any], taskStatus = taskStatus.asInstanceOf[js.Any])
    if (errorId != null) __obj.updateDynamic("errorId")(errorId.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (errorStackTrace != null) __obj.updateDynamic("errorStackTrace")(errorStackTrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTaskStatusInput]
  }
}

