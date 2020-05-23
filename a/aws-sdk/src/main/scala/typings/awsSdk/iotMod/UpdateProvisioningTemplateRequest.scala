package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProvisioningTemplateRequest extends js.Object {
  /**
    * The ID of the default provisioning template version.
    */
  var defaultVersionId: js.UndefOr[TemplateVersionId] = js.native
  /**
    * The description of the fleet provisioning template.
    */
  var description: js.UndefOr[TemplateDescription] = js.native
  /**
    * True to enable the fleet provisioning template, otherwise false.
    */
  var enabled: js.UndefOr[Enabled] = js.native
  /**
    * Updates the pre-provisioning hook template.
    */
  var preProvisioningHook: js.UndefOr[ProvisioningHook] = js.native
  /**
    * The ARN of the role associated with the provisioning template. This IoT role grants permission to provision a device.
    */
  var provisioningRoleArn: js.UndefOr[RoleArn] = js.native
  /**
    * Removes pre-provisioning hook template.
    */
  var removePreProvisioningHook: js.UndefOr[RemoveHook] = js.native
  /**
    * The name of the fleet provisioning template.
    */
  var templateName: TemplateName = js.native
}

object UpdateProvisioningTemplateRequest {
  @scala.inline
  def apply(
    templateName: TemplateName,
    defaultVersionId: js.UndefOr[TemplateVersionId] = js.undefined,
    description: TemplateDescription = null,
    enabled: js.UndefOr[Enabled] = js.undefined,
    preProvisioningHook: ProvisioningHook = null,
    provisioningRoleArn: RoleArn = null,
    removePreProvisioningHook: js.UndefOr[RemoveHook] = js.undefined
  ): UpdateProvisioningTemplateRequest = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultVersionId)) __obj.updateDynamic("defaultVersionId")(defaultVersionId.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (preProvisioningHook != null) __obj.updateDynamic("preProvisioningHook")(preProvisioningHook.asInstanceOf[js.Any])
    if (provisioningRoleArn != null) __obj.updateDynamic("provisioningRoleArn")(provisioningRoleArn.asInstanceOf[js.Any])
    if (!js.isUndefined(removePreProvisioningHook)) __obj.updateDynamic("removePreProvisioningHook")(removePreProvisioningHook.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProvisioningTemplateRequest]
  }
}

