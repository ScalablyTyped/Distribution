package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the ExtendedGamepadButton interface for a gamepad button which includes state provided by a pose controller
  * @hidden
  */
trait ExtendedGamepadButton
  extends stdLib.GamepadButton

object ExtendedGamepadButton {
  @scala.inline
  def apply(pressed: scala.Boolean, touched: scala.Boolean, value: scala.Double): ExtendedGamepadButton = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pressed")(pressed)
    __obj.updateDynamic("touched")(touched)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ExtendedGamepadButton]
  }
}

