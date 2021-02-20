package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GamepadButtonChanges extends StObject {
  
  /**
    * Called when a gamepad has been changed
    */
  var changed: Boolean = js.native
  
  /**
    * Called when a gamepad press event has been triggered
    */
  var pressChanged: Boolean = js.native
  
  /**
    * Called when a touch event has been triggered
    */
  var touchChanged: Boolean = js.native
  
  /**
    * Called when a value has changed
    */
  var valueChanged: Boolean = js.native
}
object GamepadButtonChanges {
  
  @scala.inline
  def apply(changed: Boolean, pressChanged: Boolean, touchChanged: Boolean, valueChanged: Boolean): GamepadButtonChanges = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], pressChanged = pressChanged.asInstanceOf[js.Any], touchChanged = touchChanged.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadButtonChanges]
  }
  
  @scala.inline
  implicit class GamepadButtonChangesMutableBuilder[Self <: GamepadButtonChanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanged(value: Boolean): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressChanged(value: Boolean): Self = StObject.set(x, "pressChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchChanged(value: Boolean): Self = StObject.set(x, "touchChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueChanged(value: Boolean): Self = StObject.set(x, "valueChanged", value.asInstanceOf[js.Any])
  }
}
