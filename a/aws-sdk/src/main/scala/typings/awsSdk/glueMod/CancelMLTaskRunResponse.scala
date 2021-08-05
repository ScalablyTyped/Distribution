package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelMLTaskRunResponse extends StObject {
  
  /**
    * The status for this run.
    */
  var Status: js.UndefOr[TaskStatusType] = js.undefined
  
  /**
    * The unique identifier for the task run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.undefined
  
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: js.UndefOr[HashString] = js.undefined
}
object CancelMLTaskRunResponse {
  
  inline def apply(): CancelMLTaskRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelMLTaskRunResponse]
  }
  
  extension [Self <: CancelMLTaskRunResponse](x: Self) {
    
    inline def setStatus(value: TaskStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTaskRunId(value: HashString): Self = StObject.set(x, "TaskRunId", value.asInstanceOf[js.Any])
    
    inline def setTaskRunIdUndefined: Self = StObject.set(x, "TaskRunId", js.undefined)
    
    inline def setTransformId(value: HashString): Self = StObject.set(x, "TransformId", value.asInstanceOf[js.Any])
    
    inline def setTransformIdUndefined: Self = StObject.set(x, "TransformId", js.undefined)
  }
}
