package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestRenderTemplateResponse extends StObject {
  
  /**
    * The complete MIME message rendered by applying the data in the TemplateData parameter to the template specified in the TemplateName parameter.
    */
  var RenderedTemplate: js.UndefOr[typings.awsSdk.sesMod.RenderedTemplate] = js.native
}
object TestRenderTemplateResponse {
  
  @scala.inline
  def apply(): TestRenderTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestRenderTemplateResponse]
  }
  
  @scala.inline
  implicit class TestRenderTemplateResponseMutableBuilder[Self <: TestRenderTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenderedTemplate(value: RenderedTemplate): Self = StObject.set(x, "RenderedTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderedTemplateUndefined: Self = StObject.set(x, "RenderedTemplate", js.undefined)
  }
}
