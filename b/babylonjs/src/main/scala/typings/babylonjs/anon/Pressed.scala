package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pressed extends StObject {
  
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
object Pressed {
  
  @scala.inline
  def apply(pressed: Boolean, touched: Boolean, value: Double): Pressed = {
    val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pressed]
  }
  
  @scala.inline
  implicit class PressedMutableBuilder[Self <: Pressed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPressed(value: Boolean): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouched(value: Boolean): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
