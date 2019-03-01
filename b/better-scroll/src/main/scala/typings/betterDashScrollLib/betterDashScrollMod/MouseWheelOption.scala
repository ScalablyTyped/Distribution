package typings
package betterDashScrollLib.betterDashScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseWheelOption extends js.Object {
  var easeTime: scala.Double
  var invert: scala.Boolean
  var speed: scala.Double
}

object MouseWheelOption {
  @scala.inline
  def apply(easeTime: scala.Double, invert: scala.Boolean, speed: scala.Double): MouseWheelOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("easeTime")(easeTime)
    __obj.updateDynamic("invert")(invert)
    __obj.updateDynamic("speed")(speed)
    __obj.asInstanceOf[MouseWheelOption]
  }
}

