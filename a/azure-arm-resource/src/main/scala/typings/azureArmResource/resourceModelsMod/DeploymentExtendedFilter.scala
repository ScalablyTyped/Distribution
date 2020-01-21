package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentExtendedFilter extends js.Object {
  /**
    * The provisioning state.
    */
  var provisioningState: js.UndefOr[String] = js.undefined
}

object DeploymentExtendedFilter {
  @scala.inline
  def apply(provisioningState: String = null): DeploymentExtendedFilter = {
    val __obj = js.Dynamic.literal()
    if (provisioningState != null) __obj.updateDynamic("provisioningState")(provisioningState.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentExtendedFilter]
  }
}

