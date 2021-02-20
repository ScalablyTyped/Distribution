package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MutableGamepadButton extends StObject {
  
  /**
    * If the button/trigger is currently pressed
    */
  var pressed: Boolean = js.native
  
  /**
    * If the button/trigger is currently touched
    */
  var touched: Boolean = js.native
  
  /**
    * Value of the button/trigger
    */
  var value: Double = js.native
}
object MutableGamepadButton {
  
  @scala.inline
  def apply(pressed: Boolean, touched: Boolean, value: Double): MutableGamepadButton = {
    val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutableGamepadButton]
  }
  
  @scala.inline
  implicit class MutableGamepadButtonMutableBuilder[Self <: MutableGamepadButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPressed(value: Boolean): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouched(value: Boolean): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
