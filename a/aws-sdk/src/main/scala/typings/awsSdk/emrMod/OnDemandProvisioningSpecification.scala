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
  @scala.inline
  implicit class OnDemandProvisioningSpecificationOps[Self <: OnDemandProvisioningSpecification] (val x: Self) extends AnyVal {
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
    def setAllocationStrategy(value: OnDemandProvisioningAllocationStrategy): Self = this.set("AllocationStrategy", value.asInstanceOf[js.Any])
  }
  
}

