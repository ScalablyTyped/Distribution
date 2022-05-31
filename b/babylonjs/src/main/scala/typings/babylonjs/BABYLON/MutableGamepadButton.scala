package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutableGamepadButton extends StObject {
  
  /**
    * If the button/trigger is currently pressed
    */
  var pressed: Boolean
  
  /**
    * If the button/trigger is currently touched
    */
  var touched: Boolean
  
  /**
    * Value of the button/trigger
    */
  var value: Double
}
object MutableGamepadButton {
  
  inline def apply(pressed: Boolean, touched: Boolean, value: Double): MutableGamepadButton = {
    val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutableGamepadButton]
  }
  
  extension [Self <: MutableGamepadButton](x: Self) {
    
    inline def setPressed(value: Boolean): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
    
    inline def setTouched(value: Boolean): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
