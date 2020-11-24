package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProvisioningTemplateResponse extends js.Object {
  
  /**
    * The default version of the fleet provisioning template.
    */
  var defaultVersionId: js.UndefOr[TemplateVersionId] = js.native
  
  /**
    * The ARN that identifies the provisioning template.
    */
  var templateArn: js.UndefOr[TemplateArn] = js.native
  
  /**
    * The name of the fleet provisioning template.
    */
  var templateName: js.UndefOr[TemplateName] = js.native
}
object CreateProvisioningTemplateResponse {
  
  @scala.inline
  def apply(): CreateProvisioningTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProvisioningTemplateResponse]
  }
  
  @scala.inline
  implicit class CreateProvisioningTemplateResponseOps[Self <: CreateProvisioningTemplateResponse] (val x: Self) extends AnyVal {
    
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
    def setDefaultVersionId(value: TemplateVersionId): Self = this.set("defaultVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultVersionId: Self = this.set("defaultVersionId", js.undefined)
    
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
