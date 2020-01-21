package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnDemandOptionsRequest extends js.Object {
  /**
    * The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify lowest-price, EC2 Fleet uses price to determine the order, launching the lowest price first. If you specify prioritized, EC2 Fleet uses the priority that you assigned to each launch template override, launching the highest priority first. If you do not specify a value, EC2 Fleet defaults to lowest-price.
    */
  var AllocationStrategy: js.UndefOr[FleetOnDemandAllocationStrategy] = js.native
  /**
    * The strategy for using unused Capacity Reservations for fulfilling On-Demand capacity. Supported only for fleets of type instant.
    */
  var CapacityReservationOptions: js.UndefOr[CapacityReservationOptionsRequest] = js.native
  /**
    * The maximum amount per hour for On-Demand Instances that you're willing to pay.
    */
  var MaxTotalPrice: js.UndefOr[String] = js.native
  /**
    * The minimum target capacity for On-Demand Instances in the fleet. If the minimum target capacity is not reached, the fleet launches no instances.
    */
  var MinTargetCapacity: js.UndefOr[Integer] = js.native
  /**
    * Indicates that the fleet launches all On-Demand Instances into a single Availability Zone. Supported only for fleets of type instant.
    */
  var SingleAvailabilityZone: js.UndefOr[Boolean] = js.native
  /**
    * Indicates that the fleet uses a single instance type to launch all On-Demand Instances in the fleet. Supported only for fleets of type instant.
    */
  var SingleInstanceType: js.UndefOr[Boolean] = js.native
}

object OnDemandOptionsRequest {
  @scala.inline
  def apply(
    AllocationStrategy: FleetOnDemandAllocationStrategy = null,
    CapacityReservationOptions: CapacityReservationOptionsRequest = null,
    MaxTotalPrice: String = null,
    MinTargetCapacity: Int | scala.Double = null,
    SingleAvailabilityZone: js.UndefOr[scala.Boolean] = js.undefined,
    SingleInstanceType: js.UndefOr[scala.Boolean] = js.undefined
  ): OnDemandOptionsRequest = {
    val __obj = js.Dynamic.literal()
    if (AllocationStrategy != null) __obj.updateDynamic("AllocationStrategy")(AllocationStrategy.asInstanceOf[js.Any])
    if (CapacityReservationOptions != null) __obj.updateDynamic("CapacityReservationOptions")(CapacityReservationOptions.asInstanceOf[js.Any])
    if (MaxTotalPrice != null) __obj.updateDynamic("MaxTotalPrice")(MaxTotalPrice.asInstanceOf[js.Any])
    if (MinTargetCapacity != null) __obj.updateDynamic("MinTargetCapacity")(MinTargetCapacity.asInstanceOf[js.Any])
    if (!js.isUndefined(SingleAvailabilityZone)) __obj.updateDynamic("SingleAvailabilityZone")(SingleAvailabilityZone.asInstanceOf[js.Any])
    if (!js.isUndefined(SingleInstanceType)) __obj.updateDynamic("SingleInstanceType")(SingleInstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDemandOptionsRequest]
  }
}

