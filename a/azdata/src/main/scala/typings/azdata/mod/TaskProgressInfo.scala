package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskProgressInfo extends js.Object {
  
  var message: String = js.native
  
  var script: js.UndefOr[String] = js.native
  
  var status: TaskStatus = js.native
  
  var taskId: String = js.native
}
object TaskProgressInfo {
  
  @scala.inline
  def apply(message: String, status: TaskStatus, taskId: String): TaskProgressInfo = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskProgressInfo]
  }
  
  @scala.inline
  implicit class TaskProgressInfoOps[Self <: TaskProgressInfo] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: TaskStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskId(value: String): Self = this.set("taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript(value: String): Self = this.set("script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScript: Self = this.set("script", js.undefined)
  }
}
