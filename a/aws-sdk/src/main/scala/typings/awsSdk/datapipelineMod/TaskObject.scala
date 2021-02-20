package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskObject extends StObject {
  
  /**
    * The ID of the pipeline task attempt object. AWS Data Pipeline uses this value to track how many times a task is attempted.
    */
  var attemptId: js.UndefOr[id] = js.native
  
  /**
    * Connection information for the location where the task runner will publish the output of the task.
    */
  var objects: js.UndefOr[PipelineObjectMap] = js.native
  
  /**
    * The ID of the pipeline that provided the task.
    */
  var pipelineId: js.UndefOr[id] = js.native
  
  /**
    * An internal identifier for the task. This ID is passed to the SetTaskStatus and ReportTaskProgress actions.
    */
  var taskId: js.UndefOr[typings.awsSdk.datapipelineMod.taskId] = js.native
}
object TaskObject {
  
  @scala.inline
  def apply(): TaskObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskObject]
  }
  
  @scala.inline
  implicit class TaskObjectMutableBuilder[Self <: TaskObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttemptId(value: id): Self = StObject.set(x, "attemptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttemptIdUndefined: Self = StObject.set(x, "attemptId", js.undefined)
    
    @scala.inline
    def setObjects(value: PipelineObjectMap): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
    
    @scala.inline
    def setPipelineId(value: id): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineIdUndefined: Self = StObject.set(x, "pipelineId", js.undefined)
    
    @scala.inline
    def setTaskId(value: taskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
  }
}
