package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.17`
import typings.carbonElements.carbonElementsStrings.`3rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `16` extends StObject {
  
  var fontSize: `3rem`
  
  var letterSpacing: typings.carbonElements.carbonElementsInts.`0`
  
  var lineHeight: `1.17`
}
object `16` {
  
  inline def apply(): `16` = {
    val __obj = js.Dynamic.literal(fontSize = "3rem", letterSpacing = 0, lineHeight = 1.17d)
    __obj.asInstanceOf[`16`]
  }
  
  extension [Self <: `16`](x: Self) {
    
    inline def setFontSize(value: `3rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: typings.carbonElements.carbonElementsInts.`0`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.17`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
