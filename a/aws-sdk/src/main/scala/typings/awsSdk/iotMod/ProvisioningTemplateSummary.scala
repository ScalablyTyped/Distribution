package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisioningTemplateSummary extends js.Object {
  /**
    * The date when the fleet provisioning template summary was created.
    */
  var creationDate: js.UndefOr[DateType] = js.native
  /**
    * The description of the fleet provisioning template.
    */
  var description: js.UndefOr[TemplateDescription] = js.native
  /**
    * True if the fleet provision template is enabled, otherwise false.
    */
  var enabled: js.UndefOr[Enabled] = js.native
  /**
    * The date when the fleet provisioning template summary was last modified.
    */
  var lastModifiedDate: js.UndefOr[DateType] = js.native
  /**
    * The ARN of the fleet provisioning template.
    */
  var templateArn: js.UndefOr[TemplateArn] = js.native
  /**
    * The name of the fleet provisioning template.
    */
  var templateName: js.UndefOr[TemplateName] = js.native
}

object ProvisioningTemplateSummary {
  @scala.inline
  def apply(
    creationDate: DateType = null,
    description: TemplateDescription = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    lastModifiedDate: DateType = null,
    templateArn: TemplateArn = null,
    templateName: TemplateName = null
  ): ProvisioningTemplateSummary = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate.asInstanceOf[js.Any])
    if (templateArn != null) __obj.updateDynamic("templateArn")(templateArn.asInstanceOf[js.Any])
    if (templateName != null) __obj.updateDynamic("templateName")(templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisioningTemplateSummary]
  }
}

