package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGrip extends js.Object {
  var grip: String
  var menu: String
  var thumbstick: String
  var trackpad: String
  var trigger: String
}

object AnonGrip {
  @scala.inline
  def apply(grip: String, menu: String, thumbstick: String, trackpad: String, trigger: String): AnonGrip = {
    val __obj = js.Dynamic.literal(grip = grip.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], thumbstick = thumbstick.asInstanceOf[js.Any], trackpad = trackpad.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGrip]
  }
}

