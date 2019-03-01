package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the MutableGamepadButton interface for the state of a gamepad button
  */
trait MutableGamepadButton extends js.Object {
  /**
    * If the button/trigger is currently pressed
    */
  var pressed: scala.Boolean
  /**
    * If the button/trigger is currently touched
    */
  var touched: scala.Boolean
  /**
    * Value of the button/trigger
    */
  var value: scala.Double
}

object MutableGamepadButton {
  @scala.inline
  def apply(pressed: scala.Boolean, touched: scala.Boolean, value: scala.Double): MutableGamepadButton = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pressed")(pressed)
    __obj.updateDynamic("touched")(touched)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[MutableGamepadButton]
  }
}

