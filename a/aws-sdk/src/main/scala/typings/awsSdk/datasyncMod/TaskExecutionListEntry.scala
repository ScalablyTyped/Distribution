package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskExecutionListEntry extends StObject {
  
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
  implicit class TaskExecutionListEntryMutableBuilder[Self <: TaskExecutionListEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: TaskExecutionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTaskExecutionArn(value: TaskExecutionArn): Self = StObject.set(x, "TaskExecutionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskExecutionArnUndefined: Self = StObject.set(x, "TaskExecutionArn", js.undefined)
  }
}
