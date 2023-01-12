package typings.baseui.themesTypesMod

import typings.baseui.baseuiStrings.bold
import typings.baseui.baseuiStrings.bolder
import typings.baseui.baseuiStrings.lighter
import typings.baseui.baseuiStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Font extends StObject {
  
  var fontFamily: String
  
  var fontSize: String
  
  var fontWeight: Globals | bold | normal | bolder | lighter | Double
  
  var lineHeight: String | Double
}
object Font {
  
  inline def apply(
    fontFamily: String,
    fontSize: String,
    fontWeight: Globals | bold | normal | bolder | lighter | Double,
    lineHeight: String | Double
  ): Font = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Font] (val x: Self) extends AnyVal {
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: Globals | bold | normal | bolder | lighter | Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: String | Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
