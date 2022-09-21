package typings.ckeditor4.CKEDITOR

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait sharedSpace extends StObject {
  
  var bottom: js.UndefOr[String | HTMLElement | Null] = js.undefined
  
  var top: js.UndefOr[String | HTMLElement | Null] = js.undefined
}
object sharedSpace {
  
  inline def apply(): sharedSpace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[sharedSpace]
  }
  
  extension [Self <: sharedSpace](x: Self) {
    
    inline def setBottom(value: String | HTMLElement): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomNull: Self = StObject.set(x, "bottom", null)
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setTop(value: String | HTMLElement): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopNull: Self = StObject.set(x, "top", null)
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
