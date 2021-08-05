package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait htmlDataProcessorOptions extends StObject {
  
  var context: js.UndefOr[String] = js.undefined
  
  var dontFilter: js.UndefOr[Boolean] = js.undefined
  
  var enterMode: js.UndefOr[Double] = js.undefined
  
  var filter: js.UndefOr[typings.ckeditor.CKEDITOR.filter] = js.undefined
  
  var fixForBody: js.UndefOr[Boolean] = js.undefined
  
  var protectedWhitespaces: js.UndefOr[Boolean] = js.undefined
}
object htmlDataProcessorOptions {
  
  inline def apply(): htmlDataProcessorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[htmlDataProcessorOptions]
  }
  
  extension [Self <: htmlDataProcessorOptions](x: Self) {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDontFilter(value: Boolean): Self = StObject.set(x, "dontFilter", value.asInstanceOf[js.Any])
    
    inline def setDontFilterUndefined: Self = StObject.set(x, "dontFilter", js.undefined)
    
    inline def setEnterMode(value: Double): Self = StObject.set(x, "enterMode", value.asInstanceOf[js.Any])
    
    inline def setEnterModeUndefined: Self = StObject.set(x, "enterMode", js.undefined)
    
    inline def setFilter(value: filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFixForBody(value: Boolean): Self = StObject.set(x, "fixForBody", value.asInstanceOf[js.Any])
    
    inline def setFixForBodyUndefined: Self = StObject.set(x, "fixForBody", js.undefined)
    
    inline def setProtectedWhitespaces(value: Boolean): Self = StObject.set(x, "protectedWhitespaces", value.asInstanceOf[js.Any])
    
    inline def setProtectedWhitespacesUndefined: Self = StObject.set(x, "protectedWhitespaces", js.undefined)
  }
}
