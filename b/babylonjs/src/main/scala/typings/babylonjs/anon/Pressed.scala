package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pressed extends js.Object {
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

object Pressed {
  @scala.inline
  def apply(pressed: Boolean, touched: Boolean, value: Double): Pressed = {
    val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pressed]
  }
}

