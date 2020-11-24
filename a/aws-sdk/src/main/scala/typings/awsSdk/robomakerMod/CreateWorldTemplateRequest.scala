package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateWorldTemplateRequest extends js.Object {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  
  /**
    * The name of the world template.
    */
  var name: js.UndefOr[TemplateName] = js.native
  
  /**
    * A map that contains tag keys and tag values that are attached to the world template.
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The world template body.
    */
  var templateBody: js.UndefOr[Json] = js.native
  
  /**
    * The location of the world template.
    */
  var templateLocation: js.UndefOr[TemplateLocation] = js.native
}
object CreateWorldTemplateRequest {
  
  @scala.inline
  def apply(): CreateWorldTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorldTemplateRequest]
  }
  
  @scala.inline
  implicit class CreateWorldTemplateRequestOps[Self <: CreateWorldTemplateRequest] (val x: Self) extends AnyVal {
    
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
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestToken: Self = this.set("clientRequestToken", js.undefined)
    
    @scala.inline
    def setName(value: TemplateName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
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
