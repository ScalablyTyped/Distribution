package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.13`
import typings.carbonElements.carbonElementsStrings.`4Dot75rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSizeLineHeight extends StObject {
  
  var fontSize: `4Dot75rem`
  
  var lineHeight: `1.13`
}
object FontSizeLineHeight {
  
  inline def apply(): FontSizeLineHeight = {
    val __obj = js.Dynamic.literal(fontSize = "4.75rem", lineHeight = 1.13d)
    __obj.asInstanceOf[FontSizeLineHeight]
  }
  
  extension [Self <: FontSizeLineHeight](x: Self) {
    
    inline def setFontSize(value: `4Dot75rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.13`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
