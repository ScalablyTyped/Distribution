package typings.carbonElements.anon

import typings.carbonElements.carbonElementsDoubles.`1.25`
import typings.carbonElements.carbonElementsStrings.`1Dot25rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var fontSize: `1Dot25rem`
  
  var lineHeight: `1.25`
}
object `6` {
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal(fontSize = "1.25rem", lineHeight = 1.25d)
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setFontSize(value: `1Dot25rem`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: `1.25`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
