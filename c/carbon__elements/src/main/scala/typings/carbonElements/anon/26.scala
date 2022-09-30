package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.334`
import typings.carbonElements.carbonElementsInts.`400`
import typings.carbonElements.carbonElementsStrings.`1Dot5rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `26` extends StObject {
  
  var fontSize: `1Dot5rem`
  
  var fontWeight: `400`
  
  var letterSpacing: typings.carbonElements.carbonElementsInts.`0`
  
  var lineHeight: `1.334`
}
object `26` {
  
  inline def apply(): `26` = {
    val __obj = js.Dynamic.literal(fontSize = "1.5rem", fontWeight = 400, letterSpacing = 0, lineHeight = 1.334d)
    __obj.asInstanceOf[`26`]
  }
  
  extension [Self <: `26`](x: Self) {
    
    inline def setFontSize(value: `1Dot5rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: `400`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: typings.carbonElements.carbonElementsInts.`0`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.334`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
