package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDemandOptionsRequest extends StObject {
  
  /**
    * The strategy that determines the order of the launch template overrides to use in fulfilling On-Demand capacity.  lowest-price - EC2 Fleet uses price to determine the order, launching the lowest price first.  prioritized - EC2 Fleet uses the priority that you assigned to each launch template override, launching the highest priority first. Default: lowest-price 
    */
  var AllocationStrategy: js.UndefOr[FleetOnDemandAllocationStrategy] = js.undefined
  
  /**
    * The strategy for using unused Capacity Reservations for fulfilling On-Demand capacity. Supported only for fleets of type instant.
    */
  var CapacityReservationOptions: js.UndefOr[CapacityReservationOptionsRequest] = js.undefined
  
  /**
    * The maximum amount per hour for On-Demand Instances that you're willing to pay.
    */
  var MaxTotalPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The minimum target capacity for On-Demand Instances in the fleet. If the minimum target capacity is not reached, the fleet launches no instances. Supported only for fleets of type instant. At least one of the following must be specified: SingleAvailabilityZone | SingleInstanceType 
    */
  var MinTargetCapacity: js.UndefOr[Integer] = js.undefined
  
  /**
    * Indicates that the fleet launches all On-Demand Instances into a single Availability Zone. Supported only for fleets of type instant.
    */
  var SingleAvailabilityZone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates that the fleet uses a single instance type to launch all On-Demand Instances in the fleet. Supported only for fleets of type instant.
    */
  var SingleInstanceType: js.UndefOr[Boolean] = js.undefined
}
object OnDemandOptionsRequest {
  
  inline def apply(): OnDemandOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnDemandOptionsRequest]
  }
  
  extension [Self <: OnDemandOptionsRequest](x: Self) {
    
    inline def setAllocationStrategy(value: FleetOnDemandAllocationStrategy): Self = StObject.set(x, "AllocationStrategy", value.asInstanceOf[js.Any])
    
    inline def setAllocationStrategyUndefined: Self = StObject.set(x, "AllocationStrategy", js.undefined)
    
    inline def setCapacityReservationOptions(value: CapacityReservationOptionsRequest): Self = StObject.set(x, "CapacityReservationOptions", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationOptionsUndefined: Self = StObject.set(x, "CapacityReservationOptions", js.undefined)
    
    inline def setMaxTotalPrice(value: String): Self = StObject.set(x, "MaxTotalPrice", value.asInstanceOf[js.Any])
    
    inline def setMaxTotalPriceUndefined: Self = StObject.set(x, "MaxTotalPrice", js.undefined)
    
    inline def setMinTargetCapacity(value: Integer): Self = StObject.set(x, "MinTargetCapacity", value.asInstanceOf[js.Any])
    
    inline def setMinTargetCapacityUndefined: Self = StObject.set(x, "MinTargetCapacity", js.undefined)
    
    inline def setSingleAvailabilityZone(value: Boolean): Self = StObject.set(x, "SingleAvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setSingleAvailabilityZoneUndefined: Self = StObject.set(x, "SingleAvailabilityZone", js.undefined)
    
    inline def setSingleInstanceType(value: Boolean): Self = StObject.set(x, "SingleInstanceType", value.asInstanceOf[js.Any])
    
    inline def setSingleInstanceTypeUndefined: Self = StObject.set(x, "SingleInstanceType", js.undefined)
  }
}
