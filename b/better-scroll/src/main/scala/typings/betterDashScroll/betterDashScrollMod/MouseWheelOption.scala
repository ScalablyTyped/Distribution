package typings.betterDashScroll.betterDashScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseWheelOption extends js.Object {
  var easeTime: Double
  var invert: Boolean
  var speed: Double
}

object MouseWheelOption {
  @scala.inline
  def apply(easeTime: Double, invert: Boolean, speed: Double): MouseWheelOption = {
    val __obj = js.Dynamic.literal(easeTime = easeTime, invert = invert, speed = speed)
  
    __obj.asInstanceOf[MouseWheelOption]
  }
}

