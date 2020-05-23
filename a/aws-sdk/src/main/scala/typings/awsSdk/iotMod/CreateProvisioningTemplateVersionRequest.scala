package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProvisioningTemplateVersionRequest extends js.Object {
  /**
    * Sets a fleet provision template version as the default version.
    */
  var setAsDefault: js.UndefOr[SetAsDefault] = js.native
  /**
    * The JSON formatted contents of the fleet provisioning template.
    */
  var templateBody: TemplateBody = js.native
  /**
    * The name of the fleet provisioning template.
    */
  var templateName: TemplateName = js.native
}

object CreateProvisioningTemplateVersionRequest {
  @scala.inline
  def apply(
    templateBody: TemplateBody,
    templateName: TemplateName,
    setAsDefault: js.UndefOr[SetAsDefault] = js.undefined
  ): CreateProvisioningTemplateVersionRequest = {
    val __obj = js.Dynamic.literal(templateBody = templateBody.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    if (!js.isUndefined(setAsDefault)) __obj.updateDynamic("setAsDefault")(setAsDefault.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProvisioningTemplateVersionRequest]
  }
}

