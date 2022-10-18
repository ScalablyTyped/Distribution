package typings.carbonElements.anon

import typings.carbonElements.carbonElementsInts.`400`
import typings.carbonElements.carbonElementsStrings.`1Dot25rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `35` extends StObject {
  
  var fontSize: `1Dot25rem`
  
  var fontWeight: `400`
  
  var letterSpacing: typings.carbonElements.carbonElementsInts.`0`
}
object `35` {
  
  inline def apply(): `35` = {
    val __obj = js.Dynamic.literal(fontSize = "1.25rem", fontWeight = 400, letterSpacing = 0)
    __obj.asInstanceOf[`35`]
  }
  
  extension [Self <: `35`](x: Self) {
    
    inline def setFontSize(value: `1Dot25rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: `400`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: typings.carbonElements.carbonElementsInts.`0`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
  }
}
