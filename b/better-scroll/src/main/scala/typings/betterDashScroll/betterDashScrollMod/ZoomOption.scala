package typings.betterDashScroll.betterDashScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomOption extends js.Object {
  var max: Double
  var min: Double
  var start: Double
}

object ZoomOption {
  @scala.inline
  def apply(max: Double, min: Double, start: Double): ZoomOption = {
    val __obj = js.Dynamic.literal(max = max, min = min, start = start)
  
    __obj.asInstanceOf[ZoomOption]
  }
}

