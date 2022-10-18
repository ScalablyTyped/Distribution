package typings.carbonType.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSizeFontWeight extends StObject {
  
  var fontFamily: String
  
  var fontSize: String
  
  var fontWeight: Double
  
  var letterSpacing: String
  
  var lineHeight: String
}
object FontSizeFontWeight {
  
  inline def apply(
    fontFamily: String,
    fontSize: String,
    fontWeight: Double,
    letterSpacing: String,
    lineHeight: String
  ): FontSizeFontWeight = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizeFontWeight]
  }
  
  extension [Self <: FontSizeFontWeight](x: Self) {
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
