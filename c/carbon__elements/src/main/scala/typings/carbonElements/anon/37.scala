package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.25`
import typings.carbonElements.carbonElementsInts.`400`
import typings.carbonElements.carbonElementsStrings.`2rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `37` extends StObject {
  
  var fontSize: `2rem`
  
  var fontWeight: `400`
  
  var letterSpacing: typings.carbonElements.carbonElementsInts.`0`
  
  var lineHeight: `1.25`
}
object `37` {
  
  inline def apply(): `37` = {
    val __obj = js.Dynamic.literal(fontSize = "2rem", fontWeight = 400, letterSpacing = 0, lineHeight = 1.25d)
    __obj.asInstanceOf[`37`]
  }
  
  extension [Self <: `37`](x: Self) {
    
    inline def setFontSize(value: `2rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: `400`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: typings.carbonElements.carbonElementsInts.`0`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.25`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
