package typings.bizcharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTooltip extends js.Object {
  var tooltip: js.Any
  var x: Double
  var y: Double
}

object AnonTooltip {
  @scala.inline
  def apply(tooltip: js.Any, x: Double, y: Double): AnonTooltip = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTooltip]
  }
}

