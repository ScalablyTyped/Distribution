package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDemandProvisioningSpecification extends StObject {
  
  /**
    * Specifies the strategy to use in launching On-Demand instance fleets. Currently, the only option is lowest-price (the default), which launches the lowest price first.
    */
  var AllocationStrategy: OnDemandProvisioningAllocationStrategy
  
  /**
    * The launch specification for On-Demand instances in the instance fleet, which determines the allocation strategy.
    */
  var CapacityReservationOptions: js.UndefOr[OnDemandCapacityReservationOptions] = js.undefined
}
object OnDemandProvisioningSpecification {
  
  inline def apply(AllocationStrategy: OnDemandProvisioningAllocationStrategy): OnDemandProvisioningSpecification = {
    val __obj = js.Dynamic.literal(AllocationStrategy = AllocationStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDemandProvisioningSpecification]
  }
  
  extension [Self <: OnDemandProvisioningSpecification](x: Self) {
    
    inline def setAllocationStrategy(value: OnDemandProvisioningAllocationStrategy): Self = StObject.set(x, "AllocationStrategy", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationOptions(value: OnDemandCapacityReservationOptions): Self = StObject.set(x, "CapacityReservationOptions", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationOptionsUndefined: Self = StObject.set(x, "CapacityReservationOptions", js.undefined)
  }
}
