package typings
package betterDashScrollLib.betterDashScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomOption extends js.Object {
  var max: scala.Double
  var min: scala.Double
  var start: scala.Double
}

object ZoomOption {
  @scala.inline
  def apply(max: scala.Double, min: scala.Double, start: scala.Double): ZoomOption = {
    val __obj = js.Dynamic.literal(max = max, min = min, start = start)
  
    __obj.asInstanceOf[ZoomOption]
  }
}

