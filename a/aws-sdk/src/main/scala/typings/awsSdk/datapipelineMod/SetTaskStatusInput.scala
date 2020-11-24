package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(taskId: taskId, taskStatus: TaskStatus): SetTaskStatusInput = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any], taskStatus = taskStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTaskStatusInput]
  }
  
  @scala.inline
  implicit class SetTaskStatusInputOps[Self <: SetTaskStatusInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTaskId(value: taskId): Self = this.set("taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskStatus(value: TaskStatus): Self = this.set("taskStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorId(value: String): Self = this.set("errorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorId: Self = this.set("errorId", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: errorMessage): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setErrorStackTrace(value: String): Self = this.set("errorStackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorStackTrace: Self = this.set("errorStackTrace", js.undefined)
  }
}
