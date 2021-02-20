package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceFleetStatus extends StObject {
  
  /**
    * A code representing the instance fleet status.    PROVISIONING—The instance fleet is provisioning EC2 resources and is not yet ready to run jobs.    BOOTSTRAPPING—EC2 instances and other resources have been provisioned and the bootstrap actions specified for the instances are underway.    RUNNING—EC2 instances and other resources are running. They are either executing jobs or waiting to execute jobs.    RESIZING—A resize operation is underway. EC2 instances are either being added or removed.    SUSPENDED—A resize operation could not complete. Existing EC2 instances are running, but instances can't be added or removed.    TERMINATING—The instance fleet is terminating EC2 instances.    TERMINATED—The instance fleet is no longer active, and all EC2 instances have been terminated.  
    */
  var State: js.UndefOr[InstanceFleetState] = js.native
  
  /**
    * Provides status change reason details for the instance fleet.
    */
  var StateChangeReason: js.UndefOr[InstanceFleetStateChangeReason] = js.native
  
  /**
    * Provides historical timestamps for the instance fleet, including the time of creation, the time it became ready to run jobs, and the time of termination.
    */
  var Timeline: js.UndefOr[InstanceFleetTimeline] = js.native
}
object InstanceFleetStatus {
  
  @scala.inline
  def apply(): InstanceFleetStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceFleetStatus]
  }
  
  @scala.inline
  implicit class InstanceFleetStatusMutableBuilder[Self <: InstanceFleetStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: InstanceFleetState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateChangeReason(value: InstanceFleetStateChangeReason): Self = StObject.set(x, "StateChangeReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateChangeReasonUndefined: Self = StObject.set(x, "StateChangeReason", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTimeline(value: InstanceFleetTimeline): Self = StObject.set(x, "Timeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelineUndefined: Self = StObject.set(x, "Timeline", js.undefined)
  }
}
