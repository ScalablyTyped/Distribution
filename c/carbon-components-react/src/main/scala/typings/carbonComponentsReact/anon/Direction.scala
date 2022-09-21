package typings.carbonComponentsReact.anon

import typings.carbonComponentsReact.numberInputNumberInputMod.NumberInputArrowDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction extends StObject {
  
  var direction: NumberInputArrowDirection
  
  var value: Double | String
}
object Direction {
  
  inline def apply(direction: NumberInputArrowDirection, value: Double | String): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  
  extension [Self <: Direction](x: Self) {
    
    inline def setDirection(value: NumberInputArrowDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
