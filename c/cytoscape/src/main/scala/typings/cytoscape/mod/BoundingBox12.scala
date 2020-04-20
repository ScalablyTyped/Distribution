package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundingBox12 extends js.Object {
  var x1: Double
  var x2: Double
  var y1: Double
  var y2: Double
}

object BoundingBox12 {
  @scala.inline
  def apply(x1: Double, x2: Double, y1: Double, y2: Double): BoundingBox12 = {
    val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingBox12]
  }
}

