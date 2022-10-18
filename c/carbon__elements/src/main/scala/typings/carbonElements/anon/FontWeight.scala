package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.25`
import typings.carbonElements.carbonElementsStrings.`2rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontWeight extends StObject {
  
  var fontSize: `2rem`
  
  var fontWeight: typings.carbonElements.carbonElementsInts.`300`
  
  var lineHeight: `1.25`
}
object FontWeight {
  
  inline def apply(): FontWeight = {
    val __obj = js.Dynamic.literal(fontSize = "2rem", fontWeight = 300, lineHeight = 1.25d)
    __obj.asInstanceOf[FontWeight]
  }
  
  extension [Self <: FontWeight](x: Self) {
    
    inline def setFontSize(value: `2rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: typings.carbonElements.carbonElementsInts.`300`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.25`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
