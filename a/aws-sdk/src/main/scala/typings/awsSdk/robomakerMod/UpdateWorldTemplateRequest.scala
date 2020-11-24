package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateWorldTemplateRequest extends js.Object {
  
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
  implicit class UpdateWorldTemplateRequestOps[Self <: UpdateWorldTemplateRequest] (val x: Self) extends AnyVal {
    
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
    def setTemplate(value: Arn): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: TemplateName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTemplateBody(value: Json): Self = this.set("templateBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateBody: Self = this.set("templateBody", js.undefined)
    
    @scala.inline
    def setTemplateLocation(value: TemplateLocation): Self = this.set("templateLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateLocation: Self = this.set("templateLocation", js.undefined)
  }
}
