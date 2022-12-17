package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.5`
import typings.carbonElements.carbonElementsInts.`400`
import typings.carbonElements.carbonElementsStrings.`1rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontWeightLetterSpacingLineHeight extends StObject {
  
  var fontSize: `1rem`
  
  var fontWeight: `400`
  
  var letterSpacing: typings.carbonElements.carbonElementsInts.`0`
  
  var lineHeight: `1.5`
}
object FontWeightLetterSpacingLineHeight {
  
  inline def apply(): FontWeightLetterSpacingLineHeight = {
    val __obj = js.Dynamic.literal(fontSize = "1rem", fontWeight = 400, letterSpacing = 0, lineHeight = 1.5d)
    __obj.asInstanceOf[FontWeightLetterSpacingLineHeight]
  }
  
  extension [Self <: FontWeightLetterSpacingLineHeight](x: Self) {
    
    inline def setFontSize(value: `1rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: `400`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: typings.carbonElements.carbonElementsInts.`0`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.5`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
