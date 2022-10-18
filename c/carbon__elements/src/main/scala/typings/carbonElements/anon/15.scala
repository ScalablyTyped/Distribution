package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.25`
import typings.carbonElements.carbonElementsStrings.`2rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `15` extends StObject {
  
  var fontSize: `2rem`
  
  var lineHeight: `1.25`
}
object `15` {
  
  inline def apply(): `15` = {
    val __obj = js.Dynamic.literal(fontSize = "2rem", lineHeight = 1.25d)
    __obj.asInstanceOf[`15`]
  }
  
  extension [Self <: `15`](x: Self) {
    
    inline def setFontSize(value: `2rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.25`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
