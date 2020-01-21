package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceFleetProvisioningSpecifications extends js.Object {
  /**
    * The launch specification for Spot instances in the fleet, which determines the defined duration and provisioning timeout behavior.
    */
  var SpotSpecification: SpotProvisioningSpecification = js.native
}

object InstanceFleetProvisioningSpecifications {
  @scala.inline
  def apply(SpotSpecification: SpotProvisioningSpecification): InstanceFleetProvisioningSpecifications = {
    val __obj = js.Dynamic.literal(SpotSpecification = SpotSpecification.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InstanceFleetProvisioningSpecifications]
  }
}

