package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSystemTemplateRequest extends js.Object {
  /**
    * The namespace version in which the system is to be created. If no value is specified, the latest version is used by default.
    */
  var compatibleNamespaceVersion: js.UndefOr[Version] = js.native
  /**
    * The DefinitionDocument used to create the system.
    */
  var definition: DefinitionDocument = js.native
}

object CreateSystemTemplateRequest {
  @scala.inline
  def apply(definition: DefinitionDocument, compatibleNamespaceVersion: js.UndefOr[Version] = js.undefined): CreateSystemTemplateRequest = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any])
    if (!js.isUndefined(compatibleNamespaceVersion)) __obj.updateDynamic("compatibleNamespaceVersion")(compatibleNamespaceVersion.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSystemTemplateRequest]
  }
}

