package typings.carbonComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewValue extends StObject {
  
  var left: Double
  
  var newValue: Double
}
object NewValue {
  
  inline def apply(left: Double, newValue: Double): NewValue = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValue]
  }
  
  extension [Self <: NewValue](x: Self) {
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: Double): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
  }
}
