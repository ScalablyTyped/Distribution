package typings.ckeditor.anon

import typings.ckeditor.CKEDITOR.filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context extends StObject {
  
  var context: js.UndefOr[String] = js.undefined
  
  var enterMode: js.UndefOr[Double] = js.undefined
  
  var filter: js.UndefOr[typings.ckeditor.CKEDITOR.filter] = js.undefined
}
object Context {
  
  inline def apply(): Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Context]
  }
  
  extension [Self <: Context](x: Self) {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setEnterMode(value: Double): Self = StObject.set(x, "enterMode", value.asInstanceOf[js.Any])
    
    inline def setEnterModeUndefined: Self = StObject.set(x, "enterMode", js.undefined)
    
    inline def setFilter(value: filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
