package typings.bizcharts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tooltip extends js.Object {
  var tooltip: js.Any
  var x: Double
  var y: Double
}

object Tooltip {
  @scala.inline
  def apply(tooltip: js.Any, x: Double, y: Double): Tooltip = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tooltip]
  }
}

