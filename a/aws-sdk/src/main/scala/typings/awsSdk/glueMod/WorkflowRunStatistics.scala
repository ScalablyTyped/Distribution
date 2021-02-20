package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowRunStatistics extends StObject {
  
  /**
    * Total number of Actions that have failed.
    */
  var FailedActions: js.UndefOr[IntegerValue] = js.native
  
  /**
    * Total number Actions in running state.
    */
  var RunningActions: js.UndefOr[IntegerValue] = js.native
  
  /**
    * Total number of Actions that have stopped.
    */
  var StoppedActions: js.UndefOr[IntegerValue] = js.native
  
  /**
    * Total number of Actions that have succeeded.
    */
  var SucceededActions: js.UndefOr[IntegerValue] = js.native
  
  /**
    * Total number of Actions that timed out.
    */
  var TimeoutActions: js.UndefOr[IntegerValue] = js.native
  
  /**
    * Total number of Actions in the workflow run.
    */
  var TotalActions: js.UndefOr[IntegerValue] = js.native
}
object WorkflowRunStatistics {
  
  @scala.inline
  def apply(): WorkflowRunStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowRunStatistics]
  }
  
  @scala.inline
  implicit class WorkflowRunStatisticsMutableBuilder[Self <: WorkflowRunStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedActions(value: IntegerValue): Self = StObject.set(x, "FailedActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedActionsUndefined: Self = StObject.set(x, "FailedActions", js.undefined)
    
    @scala.inline
    def setRunningActions(value: IntegerValue): Self = StObject.set(x, "RunningActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunningActionsUndefined: Self = StObject.set(x, "RunningActions", js.undefined)
    
    @scala.inline
    def setStoppedActions(value: IntegerValue): Self = StObject.set(x, "StoppedActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoppedActionsUndefined: Self = StObject.set(x, "StoppedActions", js.undefined)
    
    @scala.inline
    def setSucceededActions(value: IntegerValue): Self = StObject.set(x, "SucceededActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceededActionsUndefined: Self = StObject.set(x, "SucceededActions", js.undefined)
    
    @scala.inline
    def setTimeoutActions(value: IntegerValue): Self = StObject.set(x, "TimeoutActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutActionsUndefined: Self = StObject.set(x, "TimeoutActions", js.undefined)
    
    @scala.inline
    def setTotalActions(value: IntegerValue): Self = StObject.set(x, "TotalActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalActionsUndefined: Self = StObject.set(x, "TotalActions", js.undefined)
  }
}
