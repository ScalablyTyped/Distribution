package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.srcViewElementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var element: default
  
  var isDirectHost: js.UndefOr[Boolean] = js.undefined
  
  var keepOnFocus: js.UndefOr[Boolean] = js.undefined
  
  var text: String
  
  var view: typings.ckeditorCkeditor5Engine.srcViewViewMod.View
}
object Element {
  
  inline def apply(element: default, text: String, view: typings.ckeditorCkeditor5Engine.srcViewViewMod.View): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def setElement(value: default): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setIsDirectHost(value: Boolean): Self = StObject.set(x, "isDirectHost", value.asInstanceOf[js.Any])
    
    inline def setIsDirectHostUndefined: Self = StObject.set(x, "isDirectHost", js.undefined)
    
    inline def setKeepOnFocus(value: Boolean): Self = StObject.set(x, "keepOnFocus", value.asInstanceOf[js.Any])
    
    inline def setKeepOnFocusUndefined: Self = StObject.set(x, "keepOnFocus", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setView(value: typings.ckeditorCkeditor5Engine.srcViewViewMod.View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
