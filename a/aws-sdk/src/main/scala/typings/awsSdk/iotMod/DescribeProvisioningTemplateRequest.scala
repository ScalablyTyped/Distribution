package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProvisioningTemplateRequest extends js.Object {
  /**
    * The name of the fleet provisioning template.
    */
  var templateName: TemplateName = js.native
}

object DescribeProvisioningTemplateRequest {
  @scala.inline
  def apply(templateName: TemplateName): DescribeProvisioningTemplateRequest = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeProvisioningTemplateRequest]
  }
}

