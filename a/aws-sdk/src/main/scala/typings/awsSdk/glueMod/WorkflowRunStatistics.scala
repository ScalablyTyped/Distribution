package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowRunStatistics extends StObject {
  
  /**
    * Total number of Actions that have failed.
    */
  var FailedActions: js.UndefOr[IntegerValue] = js.undefined
  
  /**
    * Total number Actions in running state.
    */
  var RunningActions: js.UndefOr[IntegerValue] = js.undefined
  
  /**
    * Total number of Actions that have stopped.
    */
  var StoppedActions: js.UndefOr[IntegerValue] = js.undefined
  
  /**
    * Total number of Actions that have succeeded.
    */
  var SucceededActions: js.UndefOr[IntegerValue] = js.undefined
  
  /**
    * Total number of Actions that timed out.
    */
  var TimeoutActions: js.UndefOr[IntegerValue] = js.undefined
  
  /**
    * Total number of Actions in the workflow run.
    */
  var TotalActions: js.UndefOr[IntegerValue] = js.undefined
}
object WorkflowRunStatistics {
  
  inline def apply(): WorkflowRunStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowRunStatistics]
  }
  
  extension [Self <: WorkflowRunStatistics](x: Self) {
    
    inline def setFailedActions(value: IntegerValue): Self = StObject.set(x, "FailedActions", value.asInstanceOf[js.Any])
    
    inline def setFailedActionsUndefined: Self = StObject.set(x, "FailedActions", js.undefined)
    
    inline def setRunningActions(value: IntegerValue): Self = StObject.set(x, "RunningActions", value.asInstanceOf[js.Any])
    
    inline def setRunningActionsUndefined: Self = StObject.set(x, "RunningActions", js.undefined)
    
    inline def setStoppedActions(value: IntegerValue): Self = StObject.set(x, "StoppedActions", value.asInstanceOf[js.Any])
    
    inline def setStoppedActionsUndefined: Self = StObject.set(x, "StoppedActions", js.undefined)
    
    inline def setSucceededActions(value: IntegerValue): Self = StObject.set(x, "SucceededActions", value.asInstanceOf[js.Any])
    
    inline def setSucceededActionsUndefined: Self = StObject.set(x, "SucceededActions", js.undefined)
    
    inline def setTimeoutActions(value: IntegerValue): Self = StObject.set(x, "TimeoutActions", value.asInstanceOf[js.Any])
    
    inline def setTimeoutActionsUndefined: Self = StObject.set(x, "TimeoutActions", js.undefined)
    
    inline def setTotalActions(value: IntegerValue): Self = StObject.set(x, "TotalActions", value.asInstanceOf[js.Any])
    
    inline def setTotalActionsUndefined: Self = StObject.set(x, "TotalActions", js.undefined)
  }
}
