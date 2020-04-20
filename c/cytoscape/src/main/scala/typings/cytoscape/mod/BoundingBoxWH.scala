package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundingBoxWH extends js.Object {
  var h: Double
  var w: Double
  var x1: Double
  var y1: Double
}

object BoundingBoxWH {
  @scala.inline
  def apply(h: Double, w: Double, x1: Double, y1: Double): BoundingBoxWH = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingBoxWH]
  }
}

