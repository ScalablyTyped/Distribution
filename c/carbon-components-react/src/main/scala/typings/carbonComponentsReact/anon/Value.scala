package typings.carbonComponentsReact.anon

import typings.carbonComponentsReact.numberInputNumberInputMod.NumberInputArrowDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var direction: NumberInputArrowDirection
  
  var value: String | Double
}
object Value {
  
  inline def apply(direction: NumberInputArrowDirection, value: String | Double): Value = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setDirection(value: NumberInputArrowDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
