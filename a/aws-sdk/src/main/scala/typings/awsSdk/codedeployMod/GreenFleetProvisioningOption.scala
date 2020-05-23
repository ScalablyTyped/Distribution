package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GreenFleetProvisioningOption extends js.Object {
  /**
    * The method used to add instances to a replacement environment.    DISCOVER_EXISTING: Use instances that already exist or will be created manually.    COPY_AUTO_SCALING_GROUP: Use settings from a specified Auto Scaling group to define and create instances in a new Auto Scaling group.  
    */
  var action: js.UndefOr[GreenFleetProvisioningAction] = js.native
}

object GreenFleetProvisioningOption {
  @scala.inline
  def apply(action: GreenFleetProvisioningAction = null): GreenFleetProvisioningOption = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.asInstanceOf[GreenFleetProvisioningOption]
  }
}

