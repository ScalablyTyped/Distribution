package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`2rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSizeFontWeight extends StObject {
  
  var fontSize: `2rem`
  
  var fontWeight: typings.carbonElements.carbonElementsInts.`300`
}
object FontSizeFontWeight {
  
  inline def apply(): FontSizeFontWeight = {
    val __obj = js.Dynamic.literal(fontSize = "2rem", fontWeight = 300)
    __obj.asInstanceOf[FontSizeFontWeight]
  }
  
  extension [Self <: FontSizeFontWeight](x: Self) {
    
    inline def setFontSize(value: `2rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: typings.carbonElements.carbonElementsInts.`300`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
  }
}
