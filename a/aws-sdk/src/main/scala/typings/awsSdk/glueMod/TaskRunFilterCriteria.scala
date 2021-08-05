package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskRunFilterCriteria extends StObject {
  
  /**
    * Filter on task runs started after this date.
    */
  var StartedAfter: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Filter on task runs started before this date.
    */
  var StartedBefore: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The current status of the task run.
    */
  var Status: js.UndefOr[TaskStatusType] = js.undefined
  
  /**
    * The type of task run.
    */
  var TaskRunType: js.UndefOr[TaskType] = js.undefined
}
object TaskRunFilterCriteria {
  
  inline def apply(): TaskRunFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskRunFilterCriteria]
  }
  
  extension [Self <: TaskRunFilterCriteria](x: Self) {
    
    inline def setStartedAfter(value: Timestamp): Self = StObject.set(x, "StartedAfter", value.asInstanceOf[js.Any])
    
    inline def setStartedAfterUndefined: Self = StObject.set(x, "StartedAfter", js.undefined)
    
    inline def setStartedBefore(value: Timestamp): Self = StObject.set(x, "StartedBefore", value.asInstanceOf[js.Any])
    
    inline def setStartedBeforeUndefined: Self = StObject.set(x, "StartedBefore", js.undefined)
    
    inline def setStatus(value: TaskStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTaskRunType(value: TaskType): Self = StObject.set(x, "TaskRunType", value.asInstanceOf[js.Any])
    
    inline def setTaskRunTypeUndefined: Self = StObject.set(x, "TaskRunType", js.undefined)
  }
}
