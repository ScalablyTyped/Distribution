package typings.azureDashArmDashResource.libResourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportTemplateRequest extends js.Object {
  /**
    * The export template options. Supported values include 'IncludeParameterDefaultValue',
    * 'IncludeComments' or 'IncludeParameterDefaultValue, IncludeComments
    */
  var options: js.UndefOr[String] = js.undefined
  /**
    * The IDs of the resources. The only supported string currently is '*' (all resources). Future
    * updates will support exporting specific resources.
    */
  var resources: js.UndefOr[js.Array[String]] = js.undefined
}

object ExportTemplateRequest {
  @scala.inline
  def apply(options: String = null, resources: js.Array[String] = null): ExportTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportTemplateRequest]
  }
}

