package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProvisioningTemplateVersionResponse extends js.Object {
  /**
    * True if the fleet provisioning template version is the default version, otherwise false.
    */
  var isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.native
  /**
    * The ARN that identifies the provisioning template.
    */
  var templateArn: js.UndefOr[TemplateArn] = js.native
  /**
    * The name of the fleet provisioning template.
    */
  var templateName: js.UndefOr[TemplateName] = js.native
  /**
    * The version of the fleet provisioning template.
    */
  var versionId: js.UndefOr[TemplateVersionId] = js.native
}

object CreateProvisioningTemplateVersionResponse {
  @scala.inline
  def apply(): CreateProvisioningTemplateVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProvisioningTemplateVersionResponse]
  }
  @scala.inline
  implicit class CreateProvisioningTemplateVersionResponseOps[Self <: CreateProvisioningTemplateVersionResponse] (val x: Self) extends AnyVal {
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
    def setIsDefaultVersion(value: IsDefaultVersion): Self = this.set("isDefaultVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDefaultVersion: Self = this.set("isDefaultVersion", js.undefined)
    @scala.inline
    def setTemplateArn(value: TemplateArn): Self = this.set("templateArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateArn: Self = this.set("templateArn", js.undefined)
    @scala.inline
    def setTemplateName(value: TemplateName): Self = this.set("templateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateName: Self = this.set("templateName", js.undefined)
    @scala.inline
    def setVersionId(value: TemplateVersionId): Self = this.set("versionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("versionId", js.undefined)
  }
  
}

