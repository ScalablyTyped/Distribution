package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskProgressInfo extends StObject {
  
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
  implicit class TaskProgressInfoMutableBuilder[Self <: TaskProgressInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    @scala.inline
    def setStatus(value: TaskStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
