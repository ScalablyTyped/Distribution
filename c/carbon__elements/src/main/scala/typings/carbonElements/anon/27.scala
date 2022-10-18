package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.375`
import typings.carbonElements.carbonElementsInts.`600`
import typings.carbonElements.carbonElementsStrings.`1rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `27` extends StObject {
  
  var fontSize: `1rem`
  
  var fontWeight: `600`
  
  var letterSpacing: typings.carbonElements.carbonElementsInts.`0`
  
  var lineHeight: `1.375`
}
object `27` {
  
  inline def apply(): `27` = {
    val __obj = js.Dynamic.literal(fontSize = "1rem", fontWeight = 600, letterSpacing = 0, lineHeight = 1.375d)
    __obj.asInstanceOf[`27`]
  }
  
  extension [Self <: `27`](x: Self) {
    
    inline def setFontSize(value: `1rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: `600`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: typings.carbonElements.carbonElementsInts.`0`): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.375`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
