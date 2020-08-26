package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceFleetStatus extends js.Object {
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
  implicit class InstanceFleetStatusOps[Self <: InstanceFleetStatus] (val x: Self) extends AnyVal {
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
    def setState(value: InstanceFleetState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setStateChangeReason(value: InstanceFleetStateChangeReason): Self = this.set("StateChangeReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateChangeReason: Self = this.set("StateChangeReason", js.undefined)
    @scala.inline
    def setTimeline(value: InstanceFleetTimeline): Self = this.set("Timeline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeline: Self = this.set("Timeline", js.undefined)
  }
  
}

