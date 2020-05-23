package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisioningTemplateVersionSummary extends js.Object {
  /**
    * The date when the fleet provisioning template version was created
    */
  var creationDate: js.UndefOr[DateType] = js.native
  /**
    * True if the fleet provisioning template version is the default version, otherwise false.
    */
  var isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.native
  /**
    * The ID of the fleet privisioning template version.
    */
  var versionId: js.UndefOr[TemplateVersionId] = js.native
}

object ProvisioningTemplateVersionSummary {
  @scala.inline
  def apply(
    creationDate: DateType = null,
    isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.undefined,
    versionId: js.UndefOr[TemplateVersionId] = js.undefined
  ): ProvisioningTemplateVersionSummary = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefaultVersion)) __obj.updateDynamic("isDefaultVersion")(isDefaultVersion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(versionId)) __obj.updateDynamic("versionId")(versionId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisioningTemplateVersionSummary]
  }
}

