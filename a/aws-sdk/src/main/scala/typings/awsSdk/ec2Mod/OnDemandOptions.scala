package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnDemandOptions extends js.Object {
  /**
    * The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify lowest-price, EC2 Fleet uses price to determine the order, launching the lowest price first. If you specify prioritized, EC2 Fleet uses the priority that you assigned to each launch template override, launching the highest priority first. If you do not specify a value, EC2 Fleet defaults to lowest-price.
    */
  var AllocationStrategy: js.UndefOr[FleetOnDemandAllocationStrategy] = js.native
  /**
    * The strategy for using unused Capacity Reservations for fulfilling On-Demand capacity. Supported only for fleets of type instant.
    */
  var CapacityReservationOptions: js.UndefOr[typings.awsSdk.ec2Mod.CapacityReservationOptions] = js.native
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

object OnDemandOptions {
  @scala.inline
  def apply(): OnDemandOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnDemandOptions]
  }
  @scala.inline
  implicit class OnDemandOptionsOps[Self <: OnDemandOptions] (val x: Self) extends AnyVal {
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
    def setAllocationStrategy(value: FleetOnDemandAllocationStrategy): Self = this.set("AllocationStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocationStrategy: Self = this.set("AllocationStrategy", js.undefined)
    @scala.inline
    def setCapacityReservationOptions(value: CapacityReservationOptions): Self = this.set("CapacityReservationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacityReservationOptions: Self = this.set("CapacityReservationOptions", js.undefined)
    @scala.inline
    def setMaxTotalPrice(value: String): Self = this.set("MaxTotalPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTotalPrice: Self = this.set("MaxTotalPrice", js.undefined)
    @scala.inline
    def setMinTargetCapacity(value: Integer): Self = this.set("MinTargetCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinTargetCapacity: Self = this.set("MinTargetCapacity", js.undefined)
    @scala.inline
    def setSingleAvailabilityZone(value: Boolean): Self = this.set("SingleAvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleAvailabilityZone: Self = this.set("SingleAvailabilityZone", js.undefined)
    @scala.inline
    def setSingleInstanceType(value: Boolean): Self = this.set("SingleInstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleInstanceType: Self = this.set("SingleInstanceType", js.undefined)
  }
  
}

