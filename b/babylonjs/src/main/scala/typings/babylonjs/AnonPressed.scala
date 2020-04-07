package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPressed extends js.Object {
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

object AnonPressed {
  @scala.inline
  def apply(pressed: Boolean, touched: Boolean, value: Double): AnonPressed = {
    val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPressed]
  }
}

