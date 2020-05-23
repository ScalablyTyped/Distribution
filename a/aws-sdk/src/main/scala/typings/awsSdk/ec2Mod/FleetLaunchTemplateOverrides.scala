package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetLaunchTemplateOverrides extends js.Object {
  /**
    * The Availability Zone in which to launch the instances.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.ec2Mod.InstanceType] = js.native
  /**
    * The maximum price per unit hour that you are willing to pay for a Spot Instance.
    */
  var MaxPrice: js.UndefOr[String] = js.native
  /**
    * The location where the instance launched, if applicable.
    */
  var Placement: js.UndefOr[PlacementResponse] = js.native
  /**
    * The priority for the launch template override. If AllocationStrategy is set to prioritized, EC2 Fleet uses priority to determine which launch template override to use first in fulfilling On-Demand capacity. The highest priority is launched first. Valid values are whole numbers starting at 0. The lower the number, the higher the priority. If no number is set, the override has the lowest priority.
    */
  var Priority: js.UndefOr[Double] = js.native
  /**
    * The ID of the subnet in which to launch the instances.
    */
  var SubnetId: js.UndefOr[String] = js.native
  /**
    * The number of units provided by the specified instance type.
    */
  var WeightedCapacity: js.UndefOr[Double] = js.native
}

object FleetLaunchTemplateOverrides {
  @scala.inline
  def apply(
    AvailabilityZone: String = null,
    InstanceType: InstanceType = null,
    MaxPrice: String = null,
    Placement: PlacementResponse = null,
    Priority: js.UndefOr[Double] = js.undefined,
    SubnetId: String = null,
    WeightedCapacity: js.UndefOr[Double] = js.undefined
  ): FleetLaunchTemplateOverrides = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (MaxPrice != null) __obj.updateDynamic("MaxPrice")(MaxPrice.asInstanceOf[js.Any])
    if (Placement != null) __obj.updateDynamic("Placement")(Placement.asInstanceOf[js.Any])
    if (!js.isUndefined(Priority)) __obj.updateDynamic("Priority")(Priority.get.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    if (!js.isUndefined(WeightedCapacity)) __obj.updateDynamic("WeightedCapacity")(WeightedCapacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetLaunchTemplateOverrides]
  }
}

