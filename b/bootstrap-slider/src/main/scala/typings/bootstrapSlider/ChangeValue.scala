package typings.bootstrapSlider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeValue extends StObject {
  
  var newValue: Double
  
  var oldValue: Double
}
object ChangeValue {
  
  inline def apply(newValue: Double, oldValue: Double): ChangeValue = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeValue]
  }
  
  extension [Self <: ChangeValue](x: Self) {
    
    inline def setNewValue(value: Double): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
  }
}
