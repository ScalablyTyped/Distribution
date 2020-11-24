package typings.babylonjs.gamepadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GamepadButtonChanges extends js.Object {
  
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
  implicit class GamepadButtonChangesOps[Self <: GamepadButtonChanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChanged(value: Boolean): Self = this.set("changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressChanged(value: Boolean): Self = this.set("pressChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchChanged(value: Boolean): Self = this.set("touchChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueChanged(value: Boolean): Self = this.set("valueChanged", value.asInstanceOf[js.Any])
  }
}
