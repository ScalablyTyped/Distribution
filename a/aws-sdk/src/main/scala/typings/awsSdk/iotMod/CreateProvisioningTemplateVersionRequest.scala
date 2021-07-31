package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProvisioningTemplateVersionRequest extends StObject {
  
  /**
    * Sets a fleet provision template version as the default version.
    */
  var setAsDefault: js.UndefOr[SetAsDefault] = js.undefined
  
  /**
    * The JSON formatted contents of the fleet provisioning template.
    */
  var templateBody: TemplateBody
  
  /**
    * The name of the fleet provisioning template.
    */
  var templateName: TemplateName
}
object CreateProvisioningTemplateVersionRequest {
  
  @scala.inline
  def apply(templateBody: TemplateBody, templateName: TemplateName): CreateProvisioningTemplateVersionRequest = {
    val __obj = js.Dynamic.literal(templateBody = templateBody.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProvisioningTemplateVersionRequest]
  }
  
  @scala.inline
  implicit class CreateProvisioningTemplateVersionRequestMutableBuilder[Self <: CreateProvisioningTemplateVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetAsDefault(value: SetAsDefault): Self = StObject.set(x, "setAsDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAsDefaultUndefined: Self = StObject.set(x, "setAsDefault", js.undefined)
    
    @scala.inline
    def setTemplateBody(value: TemplateBody): Self = StObject.set(x, "templateBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateName(value: TemplateName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
