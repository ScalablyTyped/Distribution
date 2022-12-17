package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.28572`
import typings.carbonElements.carbonElementsInts.`400`
import typings.carbonElements.carbonElementsStrings.`0Dot32px`
import typings.carbonElements.carbonElementsStrings.`0Dot875rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineHeight extends StObject {
  
  var fontSize: `0Dot875rem`
  
  var fontWeight: `400`
  
  var letterSpacing: `0Dot32px`
  
  var lineHeight: `1.28572`
}
object LineHeight {
  
  inline def apply(): LineHeight = {
    val __obj = js.Dynamic.literal(fontSize = "0.875rem", fontWeight = 400, letterSpacing = "0.32px", lineHeight = 1.28572d)
    __obj.asInstanceOf[LineHeight]
  }
  
  extension [Self <: LineHeight](x: Self) {
    
    inline def setFontSize(value: `0Dot875rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: `400`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: `0Dot32px`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.28572`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
