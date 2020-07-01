package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnDemandProvisioningSpecification extends js.Object {
  /**
    *  Specifies the strategy to use in launching On-Demand instance fleets. Currently, the only option is lowest-price (the default), which launches the lowest price first. 
    */
  var AllocationStrategy: OnDemandProvisioningAllocationStrategy = js.native
}

object OnDemandProvisioningSpecification {
  @scala.inline
  def apply(AllocationStrategy: OnDemandProvisioningAllocationStrategy): OnDemandProvisioningSpecification = {
    val __obj = js.Dynamic.literal(AllocationStrategy = AllocationStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDemandProvisioningSpecification]
  }
}

