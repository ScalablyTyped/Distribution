package typings.azureDashArmDashResource.libResourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentValidateResult extends js.Object {
  /**
    * Validation error.
    */
  var error: js.UndefOr[ResourceManagementErrorWithDetails] = js.undefined
  /**
    * The template deployment properties.
    */
  var properties: js.UndefOr[DeploymentPropertiesExtended] = js.undefined
}

object DeploymentValidateResult {
  @scala.inline
  def apply(error: ResourceManagementErrorWithDetails = null, properties: DeploymentPropertiesExtended = null): DeploymentValidateResult = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[DeploymentValidateResult]
  }
}

