package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskExecutionListEntry extends js.Object {
  
  /**
    * The status of a task execution.
    */
  var Status: js.UndefOr[TaskExecutionStatus] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the task that was executed.
    */
  var TaskExecutionArn: js.UndefOr[typings.awsSdk.datasyncMod.TaskExecutionArn] = js.native
}
object TaskExecutionListEntry {
  
  @scala.inline
  def apply(): TaskExecutionListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskExecutionListEntry]
  }
  
  @scala.inline
  implicit class TaskExecutionListEntryOps[Self <: TaskExecutionListEntry] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: TaskExecutionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTaskExecutionArn(value: TaskExecutionArn): Self = this.set("TaskExecutionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskExecutionArn: Self = this.set("TaskExecutionArn", js.undefined)
  }
}
