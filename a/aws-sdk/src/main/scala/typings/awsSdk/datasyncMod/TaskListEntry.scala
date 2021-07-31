package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskListEntry extends StObject {
  
  /**
    * The name of the task.
    */
  var Name: js.UndefOr[TagValue] = js.undefined
  
  /**
    * The status of the task.
    */
  var Status: js.UndefOr[TaskStatus] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the task.
    */
  var TaskArn: js.UndefOr[typings.awsSdk.datasyncMod.TaskArn] = js.undefined
}
object TaskListEntry {
  
  @scala.inline
  def apply(): TaskListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskListEntry]
  }
  
  @scala.inline
  implicit class TaskListEntryMutableBuilder[Self <: TaskListEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: TagValue): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setStatus(value: TaskStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTaskArn(value: TaskArn): Self = StObject.set(x, "TaskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskArnUndefined: Self = StObject.set(x, "TaskArn", js.undefined)
  }
}
