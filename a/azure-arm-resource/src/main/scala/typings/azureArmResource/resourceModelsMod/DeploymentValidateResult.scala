package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentValidateResult extends js.Object {
  /**
    * Validation error.
    */
  var error: js.UndefOr[ResourceManagementErrorWithDetails] = js.native
  /**
    * The template deployment properties.
    */
  var properties: js.UndefOr[DeploymentPropertiesExtended] = js.native
}

object DeploymentValidateResult {
  @scala.inline
  def apply(): DeploymentValidateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentValidateResult]
  }
  @scala.inline
  implicit class DeploymentValidateResultOps[Self <: DeploymentValidateResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setError(value: ResourceManagementErrorWithDetails): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setProperties(value: DeploymentPropertiesExtended): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}

