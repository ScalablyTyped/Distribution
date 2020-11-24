package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowRunStatistics extends js.Object {
  
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
  implicit class WorkflowRunStatisticsOps[Self <: WorkflowRunStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFailedActions(value: IntegerValue): Self = this.set("FailedActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedActions: Self = this.set("FailedActions", js.undefined)
    
    @scala.inline
    def setRunningActions(value: IntegerValue): Self = this.set("RunningActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunningActions: Self = this.set("RunningActions", js.undefined)
    
    @scala.inline
    def setStoppedActions(value: IntegerValue): Self = this.set("StoppedActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoppedActions: Self = this.set("StoppedActions", js.undefined)
    
    @scala.inline
    def setSucceededActions(value: IntegerValue): Self = this.set("SucceededActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSucceededActions: Self = this.set("SucceededActions", js.undefined)
    
    @scala.inline
    def setTimeoutActions(value: IntegerValue): Self = this.set("TimeoutActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutActions: Self = this.set("TimeoutActions", js.undefined)
    
    @scala.inline
    def setTotalActions(value: IntegerValue): Self = this.set("TotalActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalActions: Self = this.set("TotalActions", js.undefined)
  }
}
