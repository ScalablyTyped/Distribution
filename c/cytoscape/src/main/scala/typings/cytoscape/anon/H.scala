package typings.cytoscape.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait H extends js.Object {
  var h: Double
  var w: Double
  var x1: Double
  var x2: Double
  var y1: Double
  var y2: Double
}

object H {
  @scala.inline
  def apply(h: Double, w: Double, x1: Double, x2: Double, y1: Double, y2: Double): H = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[H]
  }
}

