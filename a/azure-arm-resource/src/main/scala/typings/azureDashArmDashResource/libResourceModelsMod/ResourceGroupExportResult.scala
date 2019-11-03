package typings.azureDashArmDashResource.libResourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceGroupExportResult extends js.Object {
  /**
    * The error.
    */
  var error: js.UndefOr[ResourceManagementErrorWithDetails] = js.undefined
  /**
    * The template content.
    */
  var template: js.UndefOr[js.Any] = js.undefined
}

object ResourceGroupExportResult {
  @scala.inline
  def apply(error: ResourceManagementErrorWithDetails = null, template: js.Any = null): ResourceGroupExportResult = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[ResourceGroupExportResult]
  }
}

