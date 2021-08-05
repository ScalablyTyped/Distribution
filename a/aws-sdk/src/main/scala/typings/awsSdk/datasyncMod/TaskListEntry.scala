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
  
  inline def apply(): TaskListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskListEntry]
  }
  
  extension [Self <: TaskListEntry](x: Self) {
    
    inline def setName(value: TagValue): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: TaskStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTaskArn(value: TaskArn): Self = StObject.set(x, "TaskArn", value.asInstanceOf[js.Any])
    
    inline def setTaskArnUndefined: Self = StObject.set(x, "TaskArn", js.undefined)
  }
}
