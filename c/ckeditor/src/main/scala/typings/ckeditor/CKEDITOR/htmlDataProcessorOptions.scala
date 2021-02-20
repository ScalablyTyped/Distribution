package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait htmlDataProcessorOptions extends StObject {
  
  var context: js.UndefOr[String] = js.native
  
  var dontFilter: js.UndefOr[Boolean] = js.native
  
  var enterMode: js.UndefOr[Double] = js.native
  
  var filter: js.UndefOr[typings.ckeditor.CKEDITOR.filter] = js.native
  
  var fixForBody: js.UndefOr[Boolean] = js.native
  
  var protectedWhitespaces: js.UndefOr[Boolean] = js.native
}
object htmlDataProcessorOptions {
  
  @scala.inline
  def apply(): htmlDataProcessorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[htmlDataProcessorOptions]
  }
  
  @scala.inline
  implicit class htmlDataProcessorOptionsMutableBuilder[Self <: htmlDataProcessorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDontFilter(value: Boolean): Self = StObject.set(x, "dontFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDontFilterUndefined: Self = StObject.set(x, "dontFilter", js.undefined)
    
    @scala.inline
    def setEnterMode(value: Double): Self = StObject.set(x, "enterMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterModeUndefined: Self = StObject.set(x, "enterMode", js.undefined)
    
    @scala.inline
    def setFilter(value: filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFixForBody(value: Boolean): Self = StObject.set(x, "fixForBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixForBodyUndefined: Self = StObject.set(x, "fixForBody", js.undefined)
    
    @scala.inline
    def setProtectedWhitespaces(value: Boolean): Self = StObject.set(x, "protectedWhitespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedWhitespacesUndefined: Self = StObject.set(x, "protectedWhitespaces", js.undefined)
  }
}
