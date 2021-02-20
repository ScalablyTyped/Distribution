package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskRun extends StObject {
  
  /**
    * The last point in time that the requested task run was completed.
    */
  var CompletedOn: js.UndefOr[Timestamp] = js.native
  
  /**
    * The list of error strings associated with this task run.
    */
  var ErrorString: js.UndefOr[GenericString] = js.native
  
  /**
    * The amount of time (in seconds) that the task run consumed resources.
    */
  var ExecutionTime: js.UndefOr[typings.awsSdk.glueMod.ExecutionTime] = js.native
  
  /**
    * The last point in time that the requested task run was updated.
    */
  var LastModifiedOn: js.UndefOr[Timestamp] = js.native
  
  /**
    * The names of the log group for secure logging, associated with this task run.
    */
  var LogGroupName: js.UndefOr[GenericString] = js.native
  
  /**
    * Specifies configuration properties associated with this task run.
    */
  var Properties: js.UndefOr[TaskRunProperties] = js.native
  
  /**
    * The date and time that this task run started.
    */
  var StartedOn: js.UndefOr[Timestamp] = js.native
  
  /**
    * The current status of the requested task run.
    */
  var Status: js.UndefOr[TaskStatusType] = js.native
  
  /**
    * The unique identifier for this task run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.native
  
  /**
    * The unique identifier for the transform.
    */
  var TransformId: js.UndefOr[HashString] = js.native
}
object TaskRun {
  
  @scala.inline
  def apply(): TaskRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskRun]
  }
  
  @scala.inline
  implicit class TaskRunMutableBuilder[Self <: TaskRun] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletedOn(value: Timestamp): Self = StObject.set(x, "CompletedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedOnUndefined: Self = StObject.set(x, "CompletedOn", js.undefined)
    
    @scala.inline
    def setErrorString(value: GenericString): Self = StObject.set(x, "ErrorString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorStringUndefined: Self = StObject.set(x, "ErrorString", js.undefined)
    
    @scala.inline
    def setExecutionTime(value: ExecutionTime): Self = StObject.set(x, "ExecutionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionTimeUndefined: Self = StObject.set(x, "ExecutionTime", js.undefined)
    
    @scala.inline
    def setLastModifiedOn(value: Timestamp): Self = StObject.set(x, "LastModifiedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedOnUndefined: Self = StObject.set(x, "LastModifiedOn", js.undefined)
    
    @scala.inline
    def setLogGroupName(value: GenericString): Self = StObject.set(x, "LogGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupNameUndefined: Self = StObject.set(x, "LogGroupName", js.undefined)
    
    @scala.inline
    def setProperties(value: TaskRunProperties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
    
    @scala.inline
    def setStartedOn(value: Timestamp): Self = StObject.set(x, "StartedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedOnUndefined: Self = StObject.set(x, "StartedOn", js.undefined)
    
    @scala.inline
    def setStatus(value: TaskStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTaskRunId(value: HashString): Self = StObject.set(x, "TaskRunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskRunIdUndefined: Self = StObject.set(x, "TaskRunId", js.undefined)
    
    @scala.inline
    def setTransformId(value: HashString): Self = StObject.set(x, "TransformId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformIdUndefined: Self = StObject.set(x, "TransformId", js.undefined)
  }
}
