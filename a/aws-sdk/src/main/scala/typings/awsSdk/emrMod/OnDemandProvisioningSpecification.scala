package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDemandProvisioningSpecification extends StObject {
  
  /**
    *  Specifies the strategy to use in launching On-Demand instance fleets. Currently, the only option is lowest-price (the default), which launches the lowest price first. 
    */
  var AllocationStrategy: OnDemandProvisioningAllocationStrategy
}
object OnDemandProvisioningSpecification {
  
  @scala.inline
  def apply(AllocationStrategy: OnDemandProvisioningAllocationStrategy): OnDemandProvisioningSpecification = {
    val __obj = js.Dynamic.literal(AllocationStrategy = AllocationStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDemandProvisioningSpecification]
  }
  
  @scala.inline
  implicit class OnDemandProvisioningSpecificationMutableBuilder[Self <: OnDemandProvisioningSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocationStrategy(value: OnDemandProvisioningAllocationStrategy): Self = StObject.set(x, "AllocationStrategy", value.asInstanceOf[js.Any])
  }
}
