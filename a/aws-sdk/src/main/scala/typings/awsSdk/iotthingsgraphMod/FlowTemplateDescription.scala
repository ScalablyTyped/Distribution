package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowTemplateDescription extends js.Object {
  /**
    * A workflow's definition document.
    */
  var definition: js.UndefOr[DefinitionDocument] = js.native
  /**
    * An object that contains summary information about a workflow.
    */
  var summary: js.UndefOr[FlowTemplateSummary] = js.native
  /**
    * The version of the user's namespace against which the workflow was validated. Use this value in your system instance.
    */
  var validatedNamespaceVersion: js.UndefOr[Version] = js.native
}

object FlowTemplateDescription {
  @scala.inline
  def apply(
    definition: DefinitionDocument = null,
    summary: FlowTemplateSummary = null,
    validatedNamespaceVersion: js.UndefOr[Version] = js.undefined
  ): FlowTemplateDescription = {
    val __obj = js.Dynamic.literal()
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (!js.isUndefined(validatedNamespaceVersion)) __obj.updateDynamic("validatedNamespaceVersion")(validatedNamespaceVersion.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowTemplateDescription]
  }
}

