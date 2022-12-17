package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.33333`
import typings.carbonElements.carbonElementsInts.`400`
import typings.carbonElements.carbonElementsStrings.`0Dot32px`
import typings.carbonElements.carbonElementsStrings.`0Dot75rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LetterSpacing extends StObject {
  
  var fontSize: `0Dot75rem`
  
  var fontWeight: `400`
  
  var letterSpacing: `0Dot32px`
  
  var lineHeight: `1.33333`
}
object LetterSpacing {
  
  inline def apply(): LetterSpacing = {
    val __obj = js.Dynamic.literal(fontSize = "0.75rem", fontWeight = 400, letterSpacing = "0.32px", lineHeight = 1.33333d)
    __obj.asInstanceOf[LetterSpacing]
  }
  
  extension [Self <: LetterSpacing](x: Self) {
    
    inline def setFontSize(value: `0Dot75rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: `400`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: `0Dot32px`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.33333`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
