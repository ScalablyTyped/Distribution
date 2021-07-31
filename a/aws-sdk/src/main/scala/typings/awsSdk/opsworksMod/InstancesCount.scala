package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancesCount extends StObject {
  
  /**
    * The number of instances in the Assigning state.
    */
  var Assigning: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with booting status.
    */
  var Booting: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with connection_lost status.
    */
  var ConnectionLost: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances in the Deregistering state.
    */
  var Deregistering: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with online status.
    */
  var Online: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with pending status.
    */
  var Pending: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with rebooting status.
    */
  var Rebooting: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances in the Registered state.
    */
  var Registered: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances in the Registering state.
    */
  var Registering: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with requested status.
    */
  var Requested: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with running_setup status.
    */
  var RunningSetup: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with setup_failed status.
    */
  var SetupFailed: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with shutting_down status.
    */
  var ShuttingDown: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with start_failed status.
    */
  var StartFailed: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with stop_failed status.
    */
  var StopFailed: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with stopped status.
    */
  var Stopped: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with stopping status.
    */
  var Stopping: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with terminated status.
    */
  var Terminated: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with terminating status.
    */
  var Terminating: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances in the Unassigning state.
    */
  var Unassigning: js.UndefOr[Integer] = js.undefined
}
object InstancesCount {
  
  @scala.inline
  def apply(): InstancesCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesCount]
  }
  
  @scala.inline
  implicit class InstancesCountMutableBuilder[Self <: InstancesCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssigning(value: Integer): Self = StObject.set(x, "Assigning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssigningUndefined: Self = StObject.set(x, "Assigning", js.undefined)
    
    @scala.inline
    def setBooting(value: Integer): Self = StObject.set(x, "Booting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootingUndefined: Self = StObject.set(x, "Booting", js.undefined)
    
    @scala.inline
    def setConnectionLost(value: Integer): Self = StObject.set(x, "ConnectionLost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionLostUndefined: Self = StObject.set(x, "ConnectionLost", js.undefined)
    
    @scala.inline
    def setDeregistering(value: Integer): Self = StObject.set(x, "Deregistering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeregisteringUndefined: Self = StObject.set(x, "Deregistering", js.undefined)
    
    @scala.inline
    def setOnline(value: Integer): Self = StObject.set(x, "Online", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlineUndefined: Self = StObject.set(x, "Online", js.undefined)
    
    @scala.inline
    def setPending(value: Integer): Self = StObject.set(x, "Pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingUndefined: Self = StObject.set(x, "Pending", js.undefined)
    
    @scala.inline
    def setRebooting(value: Integer): Self = StObject.set(x, "Rebooting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRebootingUndefined: Self = StObject.set(x, "Rebooting", js.undefined)
    
    @scala.inline
    def setRegistered(value: Integer): Self = StObject.set(x, "Registered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredUndefined: Self = StObject.set(x, "Registered", js.undefined)
    
    @scala.inline
    def setRegistering(value: Integer): Self = StObject.set(x, "Registering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteringUndefined: Self = StObject.set(x, "Registering", js.undefined)
    
    @scala.inline
    def setRequested(value: Integer): Self = StObject.set(x, "Requested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedUndefined: Self = StObject.set(x, "Requested", js.undefined)
    
    @scala.inline
    def setRunningSetup(value: Integer): Self = StObject.set(x, "RunningSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunningSetupUndefined: Self = StObject.set(x, "RunningSetup", js.undefined)
    
    @scala.inline
    def setSetupFailed(value: Integer): Self = StObject.set(x, "SetupFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetupFailedUndefined: Self = StObject.set(x, "SetupFailed", js.undefined)
    
    @scala.inline
    def setShuttingDown(value: Integer): Self = StObject.set(x, "ShuttingDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShuttingDownUndefined: Self = StObject.set(x, "ShuttingDown", js.undefined)
    
    @scala.inline
    def setStartFailed(value: Integer): Self = StObject.set(x, "StartFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartFailedUndefined: Self = StObject.set(x, "StartFailed", js.undefined)
    
    @scala.inline
    def setStopFailed(value: Integer): Self = StObject.set(x, "StopFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopFailedUndefined: Self = StObject.set(x, "StopFailed", js.undefined)
    
    @scala.inline
    def setStopped(value: Integer): Self = StObject.set(x, "Stopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoppedUndefined: Self = StObject.set(x, "Stopped", js.undefined)
    
    @scala.inline
    def setStopping(value: Integer): Self = StObject.set(x, "Stopping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoppingUndefined: Self = StObject.set(x, "Stopping", js.undefined)
    
    @scala.inline
    def setTerminated(value: Integer): Self = StObject.set(x, "Terminated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminatedUndefined: Self = StObject.set(x, "Terminated", js.undefined)
    
    @scala.inline
    def setTerminating(value: Integer): Self = StObject.set(x, "Terminating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminatingUndefined: Self = StObject.set(x, "Terminating", js.undefined)
    
    @scala.inline
    def setUnassigning(value: Integer): Self = StObject.set(x, "Unassigning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnassigningUndefined: Self = StObject.set(x, "Unassigning", js.undefined)
  }
}
