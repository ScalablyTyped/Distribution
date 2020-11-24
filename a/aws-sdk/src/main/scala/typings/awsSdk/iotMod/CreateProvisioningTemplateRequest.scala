package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProvisioningTemplateRequest extends js.Object {
  
  /**
    * The description of the fleet provisioning template.
    */
  var description: js.UndefOr[TemplateDescription] = js.native
  
  /**
    * True to enable the fleet provisioning template, otherwise false.
    */
  var enabled: js.UndefOr[Enabled] = js.native
  
  /**
    * Creates a pre-provisioning hook template.
    */
  var preProvisioningHook: js.UndefOr[ProvisioningHook] = js.native
  
  /**
    * The role ARN for the role associated with the fleet provisioning template. This IoT role grants permission to provision a device.
    */
  var provisioningRoleArn: RoleArn = js.native
  
  /**
    * Metadata which can be used to manage the fleet provisioning template.  For URI Request parameters use format: ...key1=value1&amp;key2=value2... For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..." For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..." 
    */
  var tags: js.UndefOr[TagList] = js.native
  
  /**
    * The JSON formatted contents of the fleet provisioning template.
    */
  var templateBody: TemplateBody = js.native
  
  /**
    * The name of the fleet provisioning template.
    */
  var templateName: TemplateName = js.native
}
object CreateProvisioningTemplateRequest {
  
  @scala.inline
  def apply(provisioningRoleArn: RoleArn, templateBody: TemplateBody, templateName: TemplateName): CreateProvisioningTemplateRequest = {
    val __obj = js.Dynamic.literal(provisioningRoleArn = provisioningRoleArn.asInstanceOf[js.Any], templateBody = templateBody.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProvisioningTemplateRequest]
  }
  
  @scala.inline
  implicit class CreateProvisioningTemplateRequestOps[Self <: CreateProvisioningTemplateRequest] (val x: Self) extends AnyVal {
    
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
    def setProvisioningRoleArn(value: RoleArn): Self = this.set("provisioningRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateBody(value: TemplateBody): Self = this.set("templateBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateName(value: TemplateName): Self = this.set("templateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: TemplateDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEnabled(value: Enabled): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setPreProvisioningHook(value: ProvisioningHook): Self = this.set("preProvisioningHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreProvisioningHook: Self = this.set("preProvisioningHook", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
