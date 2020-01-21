package typings.bizcharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItems extends js.Object {
  var items: js.Any
  var tooltip: js.Any
  var x: Double
  var y: Double
}

object AnonItems {
  @scala.inline
  def apply(items: js.Any, tooltip: js.Any, x: Double, y: Double): AnonItems = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItems]
  }
}

