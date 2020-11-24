package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesCount extends js.Object {
  
  /**
    * The number of instances in the Assigning state.
    */
  var Assigning: js.UndefOr[Integer] = js.native
  
  /**
    * The number of instances with booting status.
    */
  var Booting: js.UndefOr[Integer] = js.native
  
  /**
    * The number of instances with connection_lost status.
    */
  var ConnectionLost: js.UndefOr[Integer] = js.native
  
  /**
    * The number of instances in the Deregistering state.
    */
  var Deregistering: js.UndefOr[Integer] = js.native
  
  /**
    * The number of instances with online status.
    */
  var Online: js.UndefOr[Integer] = js.native
  
  /**
    * The number of instances with pending status.
    */
  var Pending: js.UndefOr[Integer] = js.native
  
  /**
    * The number of instances with rebooting status.
    */
  var Rebooting: js.UndefOr[Integer] = js.native
  
  /**
    * The number of instances in the Registered state.
    */
  var Registered: js.UndefOr[Integer] = js.native
  
  /**
    * The number of instances in the Registering state.
    */
  var Registering: js.UndefOr[Integer] = js.native
  
  /**
    * The number of instances with requested status.
    */
  var Requested: js.UndefOr[Integer] = js.native
  
  /**
    * The number of instances with running_setup status.
    */
  var RunningSetup: js.UndefOr[Integer] = js.native
  
  /**
    * The number of instances with setup_failed status.
    */
  var SetupFailed: js.UndefOr[Integer] = js.native
  
  /**
    * The number of instances with shutting_down status.
    */
  var ShuttingDown: js.UndefOr[Integer] = js.native
  
  /**
    * The number of instances with start_failed status.
    */
  var StartFailed: js.UndefOr[Integer] = js.native
  
  /**
    * The number of instances with stop_failed status.
    */
  var StopFailed: js.UndefOr[Integer] = js.native
  
  /**
    * The number of instances with stopped status.
    */
  var Stopped: js.UndefOr[Integer] = js.native
  
  /**
    * The number of instances with stopping status.
    */
  var Stopping: js.UndefOr[Integer] = js.native
  
  /**
    * The number of instances with terminated status.
    */
  var Terminated: js.UndefOr[Integer] = js.native
  
  /**
    * The number of instances with terminating status.
    */
  var Terminating: js.UndefOr[Integer] = js.native
  
  /**
    * The number of instances in the Unassigning state.
    */
  var Unassigning: js.UndefOr[Integer] = js.native
}
object InstancesCount {
  
  @scala.inline
  def apply(): InstancesCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesCount]
  }
  
  @scala.inline
  implicit class InstancesCountOps[Self <: InstancesCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssigning(value: Integer): Self = this.set("Assigning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssigning: Self = this.set("Assigning", js.undefined)
    
    @scala.inline
    def setBooting(value: Integer): Self = this.set("Booting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBooting: Self = this.set("Booting", js.undefined)
    
    @scala.inline
    def setConnectionLost(value: Integer): Self = this.set("ConnectionLost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionLost: Self = this.set("ConnectionLost", js.undefined)
    
    @scala.inline
    def setDeregistering(value: Integer): Self = this.set("Deregistering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeregistering: Self = this.set("Deregistering", js.undefined)
    
    @scala.inline
    def setOnline(value: Integer): Self = this.set("Online", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnline: Self = this.set("Online", js.undefined)
    
    @scala.inline
    def setPending(value: Integer): Self = this.set("Pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePending: Self = this.set("Pending", js.undefined)
    
    @scala.inline
    def setRebooting(value: Integer): Self = this.set("Rebooting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRebooting: Self = this.set("Rebooting", js.undefined)
    
    @scala.inline
    def setRegistered(value: Integer): Self = this.set("Registered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistered: Self = this.set("Registered", js.undefined)
    
    @scala.inline
    def setRegistering(value: Integer): Self = this.set("Registering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistering: Self = this.set("Registering", js.undefined)
    
    @scala.inline
    def setRequested(value: Integer): Self = this.set("Requested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequested: Self = this.set("Requested", js.undefined)
    
    @scala.inline
    def setRunningSetup(value: Integer): Self = this.set("RunningSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunningSetup: Self = this.set("RunningSetup", js.undefined)
    
    @scala.inline
    def setSetupFailed(value: Integer): Self = this.set("SetupFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetupFailed: Self = this.set("SetupFailed", js.undefined)
    
    @scala.inline
    def setShuttingDown(value: Integer): Self = this.set("ShuttingDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShuttingDown: Self = this.set("ShuttingDown", js.undefined)
    
    @scala.inline
    def setStartFailed(value: Integer): Self = this.set("StartFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartFailed: Self = this.set("StartFailed", js.undefined)
    
    @scala.inline
    def setStopFailed(value: Integer): Self = this.set("StopFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopFailed: Self = this.set("StopFailed", js.undefined)
    
    @scala.inline
    def setStopped(value: Integer): Self = this.set("Stopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopped: Self = this.set("Stopped", js.undefined)
    
    @scala.inline
    def setStopping(value: Integer): Self = this.set("Stopping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopping: Self = this.set("Stopping", js.undefined)
    
    @scala.inline
    def setTerminated(value: Integer): Self = this.set("Terminated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminated: Self = this.set("Terminated", js.undefined)
    
    @scala.inline
    def setTerminating(value: Integer): Self = this.set("Terminating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminating: Self = this.set("Terminating", js.undefined)
    
    @scala.inline
    def setUnassigning(value: Integer): Self = this.set("Unassigning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnassigning: Self = this.set("Unassigning", js.undefined)
  }
}
