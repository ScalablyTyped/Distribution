package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.334`
import typings.carbonElements.carbonElementsStrings.`1Dot5rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  var fontSize: `1Dot5rem`
  
  var lineHeight: `1.334`
}
object `13` {
  
  inline def apply(): `13` = {
    val __obj = js.Dynamic.literal(fontSize = "1.5rem", lineHeight = 1.334d)
    __obj.asInstanceOf[`13`]
  }
  
  extension [Self <: `13`](x: Self) {
    
    inline def setFontSize(value: `1Dot5rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.334`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
