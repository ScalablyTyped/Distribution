package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotProvisioningSpecification extends js.Object {
  /**
    *  Specifies the strategy to use in launching Spot instance fleets. Currently, the only option is capacity-optimized (the default), which launches instances from Spot instance pools with optimal capacity for the number of instances that are launching. 
    */
  var AllocationStrategy: js.UndefOr[SpotProvisioningAllocationStrategy] = js.native
  /**
    * The defined duration for Spot instances (also known as Spot blocks) in minutes. When specified, the Spot instance does not terminate before the defined duration expires, and defined duration pricing for Spot instances applies. Valid values are 60, 120, 180, 240, 300, or 360. The duration period starts as soon as a Spot instance receives its instance ID. At the end of the duration, Amazon EC2 marks the Spot instance for termination and provides a Spot instance termination notice, which gives the instance a two-minute warning before it terminates. 
    */
  var BlockDurationMinutes: js.UndefOr[WholeNumber] = js.native
  /**
    * The action to take when TargetSpotCapacity has not been fulfilled when the TimeoutDurationMinutes has expired; that is, when all Spot instances could not be provisioned within the Spot provisioning timeout. Valid values are TERMINATE_CLUSTER and SWITCH_TO_ON_DEMAND. SWITCH_TO_ON_DEMAND specifies that if no Spot instances are available, On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
    */
  var TimeoutAction: SpotProvisioningTimeoutAction = js.native
  /**
    * The spot provisioning timeout period in minutes. If Spot instances are not provisioned within this time period, the TimeOutAction is taken. Minimum value is 5 and maximum value is 1440. The timeout applies only during initial provisioning, when the cluster is first created.
    */
  var TimeoutDurationMinutes: WholeNumber = js.native
}

object SpotProvisioningSpecification {
  @scala.inline
  def apply(TimeoutAction: SpotProvisioningTimeoutAction, TimeoutDurationMinutes: WholeNumber): SpotProvisioningSpecification = {
    val __obj = js.Dynamic.literal(TimeoutAction = TimeoutAction.asInstanceOf[js.Any], TimeoutDurationMinutes = TimeoutDurationMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotProvisioningSpecification]
  }
  @scala.inline
  implicit class SpotProvisioningSpecificationOps[Self <: SpotProvisioningSpecification] (val x: Self) extends AnyVal {
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
    def setTimeoutAction(value: SpotProvisioningTimeoutAction): Self = this.set("TimeoutAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeoutDurationMinutes(value: WholeNumber): Self = this.set("TimeoutDurationMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllocationStrategy(value: SpotProvisioningAllocationStrategy): Self = this.set("AllocationStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocationStrategy: Self = this.set("AllocationStrategy", js.undefined)
    @scala.inline
    def setBlockDurationMinutes(value: WholeNumber): Self = this.set("BlockDurationMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockDurationMinutes: Self = this.set("BlockDurationMinutes", js.undefined)
  }
  
}

