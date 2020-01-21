package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentExportResult extends js.Object {
  /**
    * The template content.
    */
  var template: js.UndefOr[js.Any] = js.undefined
}

object DeploymentExportResult {
  @scala.inline
  def apply(template: js.Any = null): DeploymentExportResult = {
    val __obj = js.Dynamic.literal()
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentExportResult]
  }
}

