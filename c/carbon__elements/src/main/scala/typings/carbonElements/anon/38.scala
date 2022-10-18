package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.22`
import typings.carbonElements.carbonElementsStrings.`2Dot25rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `38` extends StObject {
  
  var fontSize: `2Dot25rem`
  
  var lineHeight: `1.22`
}
object `38` {
  
  inline def apply(): `38` = {
    val __obj = js.Dynamic.literal(fontSize = "2.25rem", lineHeight = 1.22d)
    __obj.asInstanceOf[`38`]
  }
  
  extension [Self <: `38`](x: Self) {
    
    inline def setFontSize(value: `2Dot25rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.22`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
