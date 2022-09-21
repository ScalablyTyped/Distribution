package typings.baseui.themesTypesMod

import typings.baseui.baseuiNumbers.`0`
import typings.csstype.mod.Property.BorderColor
import typings.csstype.mod.Property.BorderLeftStyle
import typings.csstype.mod.Property.BorderWidth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Border extends StObject {
  
  var borderColor: js.UndefOr[BorderColor] = js.undefined
  
  var borderStyle: js.UndefOr[BorderLeftStyle] = js.undefined
  
  var borderWidth: js.UndefOr[BorderWidth[String | `0`]] = js.undefined
}
object Border {
  
  inline def apply(): Border = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Border]
  }
  
  extension [Self <: Border](x: Self) {
    
    inline def setBorderColor(value: BorderColor): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderStyle(value: BorderLeftStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    inline def setBorderWidth(value: BorderWidth[String | `0`]): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
  }
}
