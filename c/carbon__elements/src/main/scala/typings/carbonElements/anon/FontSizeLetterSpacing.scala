package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.33333`
import typings.carbonElements.carbonElementsStrings.`0Dot32px`
import typings.carbonElements.carbonElementsStrings.`0Dot75rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSizeLetterSpacing extends StObject {
  
  var fontSize: `0Dot75rem`
  
  var letterSpacing: `0Dot32px`
  
  var lineHeight: `1.33333`
}
object FontSizeLetterSpacing {
  
  inline def apply(): FontSizeLetterSpacing = {
    val __obj = js.Dynamic.literal(fontSize = "0.75rem", letterSpacing = "0.32px", lineHeight = 1.33333d)
    __obj.asInstanceOf[FontSizeLetterSpacing]
  }
  
  extension [Self <: FontSizeLetterSpacing](x: Self) {
    
    inline def setFontSize(value: `0Dot75rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: `0Dot32px`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.33333`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
