package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProvisioningTemplateVersionRequest extends js.Object {
  /**
    * The template name.
    */
  var templateName: TemplateName = js.native
  /**
    * The fleet provisioning template version ID.
    */
  var versionId: TemplateVersionId = js.native
}

object DescribeProvisioningTemplateVersionRequest {
  @scala.inline
  def apply(templateName: TemplateName, versionId: TemplateVersionId): DescribeProvisioningTemplateVersionRequest = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeProvisioningTemplateVersionRequest]
  }
}

