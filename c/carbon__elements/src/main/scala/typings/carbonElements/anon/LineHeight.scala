package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.17`
import typings.carbonElements.carbonElementsStrings.`3Dot75rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineHeight extends StObject {
  
  var fontSize: `3Dot75rem`
  
  var lineHeight: `1.17`
}
object LineHeight {
  
  inline def apply(): LineHeight = {
    val __obj = js.Dynamic.literal(fontSize = "3.75rem", lineHeight = 1.17d)
    __obj.asInstanceOf[LineHeight]
  }
  
  extension [Self <: LineHeight](x: Self) {
    
    inline def setFontSize(value: `3Dot75rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.17`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
