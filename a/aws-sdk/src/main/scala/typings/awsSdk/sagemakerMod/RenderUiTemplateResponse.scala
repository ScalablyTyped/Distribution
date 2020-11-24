package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderUiTemplateResponse extends js.Object {
  
  /**
    * A list of one or more RenderingError objects if any were encountered while rendering the template. If there were no errors, the list is empty.
    */
  var Errors: RenderingErrorList = js.native
  
  /**
    * A Liquid template that renders the HTML for the worker UI.
    */
  var RenderedContent: String = js.native
}
object RenderUiTemplateResponse {
  
  @scala.inline
  def apply(Errors: RenderingErrorList, RenderedContent: String): RenderUiTemplateResponse = {
    val __obj = js.Dynamic.literal(Errors = Errors.asInstanceOf[js.Any], RenderedContent = RenderedContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderUiTemplateResponse]
  }
  
  @scala.inline
  implicit class RenderUiTemplateResponseOps[Self <: RenderUiTemplateResponse] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: RenderingError*): Self = this.set("Errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: RenderingErrorList): Self = this.set("Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderedContent(value: String): Self = this.set("RenderedContent", value.asInstanceOf[js.Any])
  }
}
