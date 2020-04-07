package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamepadButtonChanges extends js.Object {
  /**
    * Called when a gamepad has been changed
    */
  var changed: Boolean
  /**
    * Called when a gamepad press event has been triggered
    */
  var pressChanged: Boolean
  /**
    * Called when a touch event has been triggered
    */
  var touchChanged: Boolean
  /**
    * Called when a value has changed
    */
  var valueChanged: Boolean
}

object GamepadButtonChanges {
  @scala.inline
  def apply(changed: Boolean, pressChanged: Boolean, touchChanged: Boolean, valueChanged: Boolean): GamepadButtonChanges = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], pressChanged = pressChanged.asInstanceOf[js.Any], touchChanged = touchChanged.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GamepadButtonChanges]
  }
}

