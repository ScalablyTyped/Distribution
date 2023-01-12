package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.42857`
import typings.carbonElements.carbonElementsInts.`400`
import typings.carbonElements.carbonElementsStrings.`0Dot32px`
import typings.carbonElements.carbonElementsStrings.`0Dot875rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFamilyFontSizeFontWeight extends StObject {
  
  var fontFamily: /* 'IBM Plex Mono', 'Menlo', 'DejaVu Sans Mono', 'Bitstream Vera Sans Mono', Courier, monospace */ String
  
  var fontSize: `0Dot875rem`
  
  var fontWeight: `400`
  
  var letterSpacing: `0Dot32px`
  
  var lineHeight: `1.42857`
}
object FontFamilyFontSizeFontWeight {
  
  inline def apply(): FontFamilyFontSizeFontWeight = {
    val __obj = js.Dynamic.literal(fontFamily = "'IBM Plex Mono', 'Menlo', 'DejaVu Sans Mono', 'Bitstream Vera Sans Mono', Courier, monospace", fontSize = "0.875rem", fontWeight = 400, letterSpacing = "0.32px", lineHeight = 1.42857d)
    __obj.asInstanceOf[FontFamilyFontSizeFontWeight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontFamilyFontSizeFontWeight] (val x: Self) extends AnyVal {
    
    inline def setFontFamily(
      value: /* 'IBM Plex Mono', 'Menlo', 'DejaVu Sans Mono', 'Bitstream Vera Sans Mono', Courier, monospace */ String
    ): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: `0Dot875rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: `400`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: `0Dot32px`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.42857`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
