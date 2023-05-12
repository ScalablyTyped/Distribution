package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolNetworkOperationTaskDetails extends StObject {
  
  /**
    * Context for the network operation task.
    */
  var taskContext: js.UndefOr[StringMap] = js.undefined
  
  /**
    * Task end time.
    */
  var taskEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Task error details.
    */
  var taskErrorDetails: js.UndefOr[ErrorInfo] = js.undefined
  
  /**
    * Task name.
    */
  var taskName: js.UndefOr[String] = js.undefined
  
  /**
    * Task start time.
    */
  var taskStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Task status.
    */
  var taskStatus: js.UndefOr[TaskStatus] = js.undefined
}
object GetSolNetworkOperationTaskDetails {
  
  inline def apply(): GetSolNetworkOperationTaskDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSolNetworkOperationTaskDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolNetworkOperationTaskDetails] (val x: Self) extends AnyVal {
    
    inline def setTaskContext(value: StringMap): Self = StObject.set(x, "taskContext", value.asInstanceOf[js.Any])
    
    inline def setTaskContextUndefined: Self = StObject.set(x, "taskContext", js.undefined)
    
    inline def setTaskEndTime(value: js.Date): Self = StObject.set(x, "taskEndTime", value.asInstanceOf[js.Any])
    
    inline def setTaskEndTimeUndefined: Self = StObject.set(x, "taskEndTime", js.undefined)
    
    inline def setTaskErrorDetails(value: ErrorInfo): Self = StObject.set(x, "taskErrorDetails", value.asInstanceOf[js.Any])
    
    inline def setTaskErrorDetailsUndefined: Self = StObject.set(x, "taskErrorDetails", js.undefined)
    
    inline def setTaskName(value: String): Self = StObject.set(x, "taskName", value.asInstanceOf[js.Any])
    
    inline def setTaskNameUndefined: Self = StObject.set(x, "taskName", js.undefined)
    
    inline def setTaskStartTime(value: js.Date): Self = StObject.set(x, "taskStartTime", value.asInstanceOf[js.Any])
    
    inline def setTaskStartTimeUndefined: Self = StObject.set(x, "taskStartTime", js.undefined)
    
    inline def setTaskStatus(value: TaskStatus): Self = StObject.set(x, "taskStatus", value.asInstanceOf[js.Any])
    
    inline def setTaskStatusUndefined: Self = StObject.set(x, "taskStatus", js.undefined)
  }
}
