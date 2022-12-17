package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`3Dot75rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17` extends StObject {
  
  var fontSize: `3Dot75rem`
  
  var letterSpacing: typings.carbonElements.carbonElementsInts.`0`
}
object `17` {
  
  inline def apply(): `17` = {
    val __obj = js.Dynamic.literal(fontSize = "3.75rem", letterSpacing = 0)
    __obj.asInstanceOf[`17`]
  }
  
  extension [Self <: `17`](x: Self) {
    
    inline def setFontSize(value: `3Dot75rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: typings.carbonElements.carbonElementsInts.`0`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
  }
}
