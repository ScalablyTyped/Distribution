package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProvisioningTemplateVersionResponse extends js.Object {
  /**
    * The date when the fleet provisioning template version was created.
    */
  var creationDate: js.UndefOr[DateType] = js.native
  /**
    * True if the fleet provisioning template version is the default version.
    */
  var isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.native
  /**
    * The JSON formatted contents of the fleet provisioning template version.
    */
  var templateBody: js.UndefOr[TemplateBody] = js.native
  /**
    * The fleet provisioning template version ID.
    */
  var versionId: js.UndefOr[TemplateVersionId] = js.native
}

object DescribeProvisioningTemplateVersionResponse {
  @scala.inline
  def apply(
    creationDate: DateType = null,
    isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.undefined,
    templateBody: TemplateBody = null,
    versionId: js.UndefOr[TemplateVersionId] = js.undefined
  ): DescribeProvisioningTemplateVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefaultVersion)) __obj.updateDynamic("isDefaultVersion")(isDefaultVersion.get.asInstanceOf[js.Any])
    if (templateBody != null) __obj.updateDynamic("templateBody")(templateBody.asInstanceOf[js.Any])
    if (!js.isUndefined(versionId)) __obj.updateDynamic("versionId")(versionId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProvisioningTemplateVersionResponse]
  }
}

