package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWorldTemplateBodyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (arn) of the world generator job.
    */
  var generationJob: js.UndefOr[Arn] = js.native
  
  /**
    * The Amazon Resource Name (arn) of the world template.
    */
  var template: js.UndefOr[Arn] = js.native
}
object GetWorldTemplateBodyRequest {
  
  @scala.inline
  def apply(): GetWorldTemplateBodyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorldTemplateBodyRequest]
  }
  
  @scala.inline
  implicit class GetWorldTemplateBodyRequestMutableBuilder[Self <: GetWorldTemplateBodyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGenerationJob(value: Arn): Self = StObject.set(x, "generationJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerationJobUndefined: Self = StObject.set(x, "generationJob", js.undefined)
    
    @scala.inline
    def setTemplate(value: Arn): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
