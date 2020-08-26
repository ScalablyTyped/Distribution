package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifySpotFleetRequestRequest extends js.Object {
  /**
    * Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet request is decreased below the current size of the Spot Fleet.
    */
  var ExcessCapacityTerminationPolicy: js.UndefOr[typings.awsSdk.ec2Mod.ExcessCapacityTerminationPolicy] = js.native
  /**
    * The number of On-Demand Instances in the fleet.
    */
  var OnDemandTargetCapacity: js.UndefOr[Integer] = js.native
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: typings.awsSdk.ec2Mod.SpotFleetRequestId = js.native
  /**
    * The size of the fleet.
    */
  var TargetCapacity: js.UndefOr[Integer] = js.native
}

object ModifySpotFleetRequestRequest {
  @scala.inline
  def apply(SpotFleetRequestId: SpotFleetRequestId): ModifySpotFleetRequestRequest = {
    val __obj = js.Dynamic.literal(SpotFleetRequestId = SpotFleetRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifySpotFleetRequestRequest]
  }
  @scala.inline
  implicit class ModifySpotFleetRequestRequestOps[Self <: ModifySpotFleetRequestRequest] (val x: Self) extends AnyVal {
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
    def setSpotFleetRequestId(value: SpotFleetRequestId): Self = this.set("SpotFleetRequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcessCapacityTerminationPolicy(value: ExcessCapacityTerminationPolicy): Self = this.set("ExcessCapacityTerminationPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcessCapacityTerminationPolicy: Self = this.set("ExcessCapacityTerminationPolicy", js.undefined)
    @scala.inline
    def setOnDemandTargetCapacity(value: Integer): Self = this.set("OnDemandTargetCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDemandTargetCapacity: Self = this.set("OnDemandTargetCapacity", js.undefined)
    @scala.inline
    def setTargetCapacity(value: Integer): Self = this.set("TargetCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetCapacity: Self = this.set("TargetCapacity", js.undefined)
  }
  
}

