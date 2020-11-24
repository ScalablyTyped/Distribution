package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestRenderTemplateResponse extends js.Object {
  
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
  implicit class TestRenderTemplateResponseOps[Self <: TestRenderTemplateResponse] (val x: Self) extends AnyVal {
    
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
    def setRenderedTemplate(value: RenderedTemplate): Self = this.set("RenderedTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderedTemplate: Self = this.set("RenderedTemplate", js.undefined)
  }
}
