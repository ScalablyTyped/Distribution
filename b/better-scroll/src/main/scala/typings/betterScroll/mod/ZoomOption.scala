package typings.betterScroll.mod

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
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ZoomOption]
  }
}

