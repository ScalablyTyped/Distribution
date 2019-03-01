package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface which manages callbacks for gamepad button changes
  */
trait GamepadButtonChanges extends js.Object {
  /**
    * Called when a gamepad has been changed
    */
  var changed: scala.Boolean
  /**
    * Called when a gamepad press event has been triggered
    */
  var pressChanged: scala.Boolean
  /**
    * Called when a touch event has been triggered
    */
  var touchChanged: scala.Boolean
  /**
    * Called when a value has changed
    */
  var valueChanged: scala.Boolean
}

object GamepadButtonChanges {
  @scala.inline
  def apply(
    changed: scala.Boolean,
    pressChanged: scala.Boolean,
    touchChanged: scala.Boolean,
    valueChanged: scala.Boolean
  ): GamepadButtonChanges = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changed")(changed)
    __obj.updateDynamic("pressChanged")(pressChanged)
    __obj.updateDynamic("touchChanged")(touchChanged)
    __obj.updateDynamic("valueChanged")(valueChanged)
    __obj.asInstanceOf[GamepadButtonChanges]
  }
}

