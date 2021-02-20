package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderUiTemplateResponse extends StObject {
  
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
  implicit class RenderUiTemplateResponseMutableBuilder[Self <: RenderUiTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: RenderingErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: RenderingError*): Self = StObject.set(x, "Errors", js.Array(value :_*))
    
    @scala.inline
    def setRenderedContent(value: String): Self = StObject.set(x, "RenderedContent", value.asInstanceOf[js.Any])
  }
}
