package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceGroupProperties extends js.Object {
  /**
    * The provisioning state.
    */
  val provisioningState: js.UndefOr[String] = js.undefined
}

object ResourceGroupProperties {
  @scala.inline
  def apply(provisioningState: String = null): ResourceGroupProperties = {
    val __obj = js.Dynamic.literal()
    if (provisioningState != null) __obj.updateDynamic("provisioningState")(provisioningState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceGroupProperties]
  }
}

