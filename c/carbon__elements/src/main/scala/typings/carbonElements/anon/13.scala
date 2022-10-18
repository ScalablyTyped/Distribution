package typings.carbonElements.anon

import typings.carbonElements.carbonElementsInts.`600`
import typings.carbonElements.carbonElementsStrings.`3Dot75rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  var fontSize: `3Dot75rem`
  
  var fontWeight: `600`
  
  var letterSpacing: typings.carbonElements.carbonElementsInts.`0`
}
object `13` {
  
  inline def apply(): `13` = {
    val __obj = js.Dynamic.literal(fontSize = "3.75rem", fontWeight = 600, letterSpacing = 0)
    __obj.asInstanceOf[`13`]
  }
  
  extension [Self <: `13`](x: Self) {
    
    inline def setFontSize(value: `3Dot75rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: `600`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: typings.carbonElements.carbonElementsInts.`0`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
  }
}
