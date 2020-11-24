package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Template extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the template.
    */
  var TemplateArn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * An object that defines the values to use for message variables in the template. This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding value defines the value to use for that variable.
    */
  var TemplateData: js.UndefOr[EmailTemplateData] = js.native
  
  /**
    * The name of the template. You will refer to this name when you send email using the SendTemplatedEmail or SendBulkTemplatedEmail operations. 
    */
  var TemplateName: js.UndefOr[EmailTemplateName] = js.native
}
object Template {
  
  @scala.inline
  def apply(): Template = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Template]
  }
  
  @scala.inline
  implicit class TemplateOps[Self <: Template] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTemplateArn(value: AmazonResourceName): Self = this.set("TemplateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateArn: Self = this.set("TemplateArn", js.undefined)
    
    @scala.inline
    def setTemplateData(value: EmailTemplateData): Self = this.set("TemplateData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateData: Self = this.set("TemplateData", js.undefined)
    
    @scala.inline
    def setTemplateName(value: EmailTemplateName): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateName: Self = this.set("TemplateName", js.undefined)
  }
}
