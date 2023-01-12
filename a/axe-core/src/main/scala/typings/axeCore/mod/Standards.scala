package typings.axeCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Standards extends StObject {
  
  var ariaAttrs: js.UndefOr[StringDictionary[AriaAttrs]] = js.undefined
  
  var ariaRoles: js.UndefOr[StringDictionary[AriaRoles]] = js.undefined
  
  var cssColors: js.UndefOr[StringDictionary[js.Array[Double]]] = js.undefined
  
  var htmlElms: js.UndefOr[StringDictionary[HtmlElms]] = js.undefined
}
object Standards {
  
  inline def apply(): Standards = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Standards]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Standards] (val x: Self) extends AnyVal {
    
    inline def setAriaAttrs(value: StringDictionary[AriaAttrs]): Self = StObject.set(x, "ariaAttrs", value.asInstanceOf[js.Any])
    
    inline def setAriaAttrsUndefined: Self = StObject.set(x, "ariaAttrs", js.undefined)
    
    inline def setAriaRoles(value: StringDictionary[AriaRoles]): Self = StObject.set(x, "ariaRoles", value.asInstanceOf[js.Any])
    
    inline def setAriaRolesUndefined: Self = StObject.set(x, "ariaRoles", js.undefined)
    
    inline def setCssColors(value: StringDictionary[js.Array[Double]]): Self = StObject.set(x, "cssColors", value.asInstanceOf[js.Any])
    
    inline def setCssColorsUndefined: Self = StObject.set(x, "cssColors", js.undefined)
    
    inline def setHtmlElms(value: StringDictionary[HtmlElms]): Self = StObject.set(x, "htmlElms", value.asInstanceOf[js.Any])
    
    inline def setHtmlElmsUndefined: Self = StObject.set(x, "htmlElms", js.undefined)
  }
}
