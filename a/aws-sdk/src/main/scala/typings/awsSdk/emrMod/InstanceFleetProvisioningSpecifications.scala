package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceFleetProvisioningSpecifications extends js.Object {
  /**
    *  The launch specification for On-Demand instances in the instance fleet, which determines the allocation strategy.   The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. On-Demand instances allocation strategy is available in Amazon EMR version 5.12.1 and later. 
    */
  var OnDemandSpecification: js.UndefOr[OnDemandProvisioningSpecification] = js.native
  /**
    * The launch specification for Spot instances in the fleet, which determines the defined duration, provisioning timeout behavior, and allocation strategy.
    */
  var SpotSpecification: js.UndefOr[SpotProvisioningSpecification] = js.native
}

object InstanceFleetProvisioningSpecifications {
  @scala.inline
  def apply(
    OnDemandSpecification: OnDemandProvisioningSpecification = null,
    SpotSpecification: SpotProvisioningSpecification = null
  ): InstanceFleetProvisioningSpecifications = {
    val __obj = js.Dynamic.literal()
    if (OnDemandSpecification != null) __obj.updateDynamic("OnDemandSpecification")(OnDemandSpecification.asInstanceOf[js.Any])
    if (SpotSpecification != null) __obj.updateDynamic("SpotSpecification")(SpotSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceFleetProvisioningSpecifications]
  }
}

