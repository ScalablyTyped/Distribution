package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.28572`
import typings.carbonElements.carbonElementsStrings.`0Dot16px`
import typings.carbonElements.carbonElementsStrings.`0Dot875rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LetterSpacingLineHeight extends StObject {
  
  var fontSize: `0Dot875rem`
  
  var letterSpacing: `0Dot16px`
  
  var lineHeight: `1.28572`
}
object LetterSpacingLineHeight {
  
  inline def apply(): LetterSpacingLineHeight = {
    val __obj = js.Dynamic.literal(fontSize = "0.875rem", letterSpacing = "0.16px", lineHeight = 1.28572d)
    __obj.asInstanceOf[LetterSpacingLineHeight]
  }
  
  extension [Self <: LetterSpacingLineHeight](x: Self) {
    
    inline def setFontSize(value: `0Dot875rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: `0Dot16px`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.28572`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
