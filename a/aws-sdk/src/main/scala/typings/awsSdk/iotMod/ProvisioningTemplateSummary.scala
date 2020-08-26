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
  def apply(): ProvisioningTemplateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningTemplateSummary]
  }
  @scala.inline
  implicit class ProvisioningTemplateSummaryOps[Self <: ProvisioningTemplateSummary] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: DateType): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setDescription(value: TemplateDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEnabled(value: Enabled): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: DateType): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("lastModifiedDate", js.undefined)
    @scala.inline
    def setTemplateArn(value: TemplateArn): Self = this.set("templateArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateArn: Self = this.set("templateArn", js.undefined)
    @scala.inline
    def setTemplateName(value: TemplateName): Self = this.set("templateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateName: Self = this.set("templateName", js.undefined)
  }
  
}

