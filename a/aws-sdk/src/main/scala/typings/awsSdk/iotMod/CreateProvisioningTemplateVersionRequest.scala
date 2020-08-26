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
  def apply(templateBody: TemplateBody, templateName: TemplateName): CreateProvisioningTemplateVersionRequest = {
    val __obj = js.Dynamic.literal(templateBody = templateBody.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProvisioningTemplateVersionRequest]
  }
  @scala.inline
  implicit class CreateProvisioningTemplateVersionRequestOps[Self <: CreateProvisioningTemplateVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTemplateBody(value: TemplateBody): Self = this.set("templateBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplateName(value: TemplateName): Self = this.set("templateName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetAsDefault(value: SetAsDefault): Self = this.set("setAsDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetAsDefault: Self = this.set("setAsDefault", js.undefined)
  }
  
}

