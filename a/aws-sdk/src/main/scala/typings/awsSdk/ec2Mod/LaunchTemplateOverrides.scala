package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateOverrides extends js.Object {
  /**
    * The Availability Zone in which to launch the instances.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.ec2Mod.InstanceType] = js.native
  /**
    * The priority for the launch template override. If OnDemandAllocationStrategy is set to prioritized, Spot Fleet uses priority to determine which launch template override to use first in fulfilling On-Demand capacity. The highest priority is launched first. Valid values are whole numbers starting at 0. The lower the number, the higher the priority. If no number is set, the launch template override has the lowest priority.
    */
  var Priority: js.UndefOr[Double] = js.native
  /**
    * The maximum price per unit hour that you are willing to pay for a Spot Instance.
    */
  var SpotPrice: js.UndefOr[String] = js.native
  /**
    * The ID of the subnet in which to launch the instances.
    */
  var SubnetId: js.UndefOr[String] = js.native
  /**
    * The number of units provided by the specified instance type.
    */
  var WeightedCapacity: js.UndefOr[Double] = js.native
}

object LaunchTemplateOverrides {
  @scala.inline
  def apply(
    AvailabilityZone: String = null,
    InstanceType: InstanceType = null,
    Priority: js.UndefOr[Double] = js.undefined,
    SpotPrice: String = null,
    SubnetId: String = null,
    WeightedCapacity: js.UndefOr[Double] = js.undefined
  ): LaunchTemplateOverrides = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (!js.isUndefined(Priority)) __obj.updateDynamic("Priority")(Priority.get.asInstanceOf[js.Any])
    if (SpotPrice != null) __obj.updateDynamic("SpotPrice")(SpotPrice.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    if (!js.isUndefined(WeightedCapacity)) __obj.updateDynamic("WeightedCapacity")(WeightedCapacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateOverrides]
  }
}

