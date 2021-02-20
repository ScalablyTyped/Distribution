package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskRunFilterCriteria extends StObject {
  
  /**
    * Filter on task runs started after this date.
    */
  var StartedAfter: js.UndefOr[Timestamp] = js.native
  
  /**
    * Filter on task runs started before this date.
    */
  var StartedBefore: js.UndefOr[Timestamp] = js.native
  
  /**
    * The current status of the task run.
    */
  var Status: js.UndefOr[TaskStatusType] = js.native
  
  /**
    * The type of task run.
    */
  var TaskRunType: js.UndefOr[TaskType] = js.native
}
object TaskRunFilterCriteria {
  
  @scala.inline
  def apply(): TaskRunFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskRunFilterCriteria]
  }
  
  @scala.inline
  implicit class TaskRunFilterCriteriaMutableBuilder[Self <: TaskRunFilterCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStartedAfter(value: Timestamp): Self = StObject.set(x, "StartedAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedAfterUndefined: Self = StObject.set(x, "StartedAfter", js.undefined)
    
    @scala.inline
    def setStartedBefore(value: Timestamp): Self = StObject.set(x, "StartedBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedBeforeUndefined: Self = StObject.set(x, "StartedBefore", js.undefined)
    
    @scala.inline
    def setStatus(value: TaskStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTaskRunType(value: TaskType): Self = StObject.set(x, "TaskRunType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskRunTypeUndefined: Self = StObject.set(x, "TaskRunType", js.undefined)
  }
}
