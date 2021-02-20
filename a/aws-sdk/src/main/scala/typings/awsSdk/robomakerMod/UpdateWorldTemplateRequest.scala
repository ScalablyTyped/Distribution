package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateWorldTemplateRequest extends StObject {
  
  /**
    * The name of the template.
    */
  var name: js.UndefOr[TemplateName] = js.native
  
  /**
    * The Amazon Resource Name (arn) of the world template to update.
    */
  var template: Arn = js.native
  
  /**
    * The world template body.
    */
  var templateBody: js.UndefOr[Json] = js.native
  
  /**
    * The location of the world template.
    */
  var templateLocation: js.UndefOr[TemplateLocation] = js.native
}
object UpdateWorldTemplateRequest {
  
  @scala.inline
  def apply(template: Arn): UpdateWorldTemplateRequest = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorldTemplateRequest]
  }
  
  @scala.inline
  implicit class UpdateWorldTemplateRequestMutableBuilder[Self <: UpdateWorldTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: TemplateName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTemplate(value: Arn): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateBody(value: Json): Self = StObject.set(x, "templateBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateBodyUndefined: Self = StObject.set(x, "templateBody", js.undefined)
    
    @scala.inline
    def setTemplateLocation(value: TemplateLocation): Self = StObject.set(x, "templateLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateLocationUndefined: Self = StObject.set(x, "templateLocation", js.undefined)
  }
}
