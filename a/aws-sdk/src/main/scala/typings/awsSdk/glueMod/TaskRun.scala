package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskRun extends StObject {
  
  /**
    * The last point in time that the requested task run was completed.
    */
  var CompletedOn: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The list of error strings associated with this task run.
    */
  var ErrorString: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The amount of time (in seconds) that the task run consumed resources.
    */
  var ExecutionTime: js.UndefOr[typings.awsSdk.glueMod.ExecutionTime] = js.undefined
  
  /**
    * The last point in time that the requested task run was updated.
    */
  var LastModifiedOn: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The names of the log group for secure logging, associated with this task run.
    */
  var LogGroupName: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Specifies configuration properties associated with this task run.
    */
  var Properties: js.UndefOr[TaskRunProperties] = js.undefined
  
  /**
    * The date and time that this task run started.
    */
  var StartedOn: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The current status of the requested task run.
    */
  var Status: js.UndefOr[TaskStatusType] = js.undefined
  
  /**
    * The unique identifier for this task run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.undefined
  
  /**
    * The unique identifier for the transform.
    */
  var TransformId: js.UndefOr[HashString] = js.undefined
}
object TaskRun {
  
  inline def apply(): TaskRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskRun]
  }
  
  extension [Self <: TaskRun](x: Self) {
    
    inline def setCompletedOn(value: Timestamp): Self = StObject.set(x, "CompletedOn", value.asInstanceOf[js.Any])
    
    inline def setCompletedOnUndefined: Self = StObject.set(x, "CompletedOn", js.undefined)
    
    inline def setErrorString(value: GenericString): Self = StObject.set(x, "ErrorString", value.asInstanceOf[js.Any])
    
    inline def setErrorStringUndefined: Self = StObject.set(x, "ErrorString", js.undefined)
    
    inline def setExecutionTime(value: ExecutionTime): Self = StObject.set(x, "ExecutionTime", value.asInstanceOf[js.Any])
    
    inline def setExecutionTimeUndefined: Self = StObject.set(x, "ExecutionTime", js.undefined)
    
    inline def setLastModifiedOn(value: Timestamp): Self = StObject.set(x, "LastModifiedOn", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedOnUndefined: Self = StObject.set(x, "LastModifiedOn", js.undefined)
    
    inline def setLogGroupName(value: GenericString): Self = StObject.set(x, "LogGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNameUndefined: Self = StObject.set(x, "LogGroupName", js.undefined)
    
    inline def setProperties(value: TaskRunProperties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
    
    inline def setStartedOn(value: Timestamp): Self = StObject.set(x, "StartedOn", value.asInstanceOf[js.Any])
    
    inline def setStartedOnUndefined: Self = StObject.set(x, "StartedOn", js.undefined)
    
    inline def setStatus(value: TaskStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTaskRunId(value: HashString): Self = StObject.set(x, "TaskRunId", value.asInstanceOf[js.Any])
    
    inline def setTaskRunIdUndefined: Self = StObject.set(x, "TaskRunId", js.undefined)
    
    inline def setTransformId(value: HashString): Self = StObject.set(x, "TransformId", value.asInstanceOf[js.Any])
    
    inline def setTransformIdUndefined: Self = StObject.set(x, "TransformId", js.undefined)
  }
}
