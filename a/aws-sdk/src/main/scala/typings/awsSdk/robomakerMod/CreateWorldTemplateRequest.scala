package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateWorldTemplateRequest extends StObject {
  
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
  implicit class CreateWorldTemplateRequestMutableBuilder[Self <: CreateWorldTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    @scala.inline
    def setName(value: TemplateName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
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
