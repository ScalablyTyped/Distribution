package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Template extends StObject {
  
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
  implicit class TemplateMutableBuilder[Self <: Template] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplateArn(value: AmazonResourceName): Self = StObject.set(x, "TemplateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateArnUndefined: Self = StObject.set(x, "TemplateArn", js.undefined)
    
    @scala.inline
    def setTemplateData(value: EmailTemplateData): Self = StObject.set(x, "TemplateData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateDataUndefined: Self = StObject.set(x, "TemplateData", js.undefined)
    
    @scala.inline
    def setTemplateName(value: EmailTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateNameUndefined: Self = StObject.set(x, "TemplateName", js.undefined)
  }
}
