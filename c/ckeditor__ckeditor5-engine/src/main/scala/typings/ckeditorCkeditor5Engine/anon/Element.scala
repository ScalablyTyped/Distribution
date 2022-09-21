package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.viewElementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var element: default
  
  var isDirectHost: js.UndefOr[Boolean] = js.undefined
  
  var keepOnFocus: js.UndefOr[Boolean] = js.undefined
  
  var text: String
  
  var view: /* Couldn't translate: 'key not found: IArray(TsIdentLibraryScoped(ckeditor,ckeditor5-engine), TsIdentModule(Some(ckeditor),List(ckeditor5-engine, src, view, view)))' */ Any
}
object Element {
  
  inline def apply(
    element: default,
    text: String,
    view: /* Couldn't translate: 'key not found: IArray(TsIdentLibraryScoped(ckeditor,ckeditor5-engine), TsIdentModule(Some(ckeditor),List(ckeditor5-engine, src, view, view)))' */ Any
  ): Element = {
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
    
    inline def setView(
      value: /* Couldn't translate: 'key not found: IArray(TsIdentLibraryScoped(ckeditor,ckeditor5-engine), TsIdentModule(Some(ckeditor),List(ckeditor5-engine, src, view, view)))' */ Any
    ): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
