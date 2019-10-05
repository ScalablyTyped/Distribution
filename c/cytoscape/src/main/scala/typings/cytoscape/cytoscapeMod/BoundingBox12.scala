package typings.cytoscape.cytoscapeMod

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
    val __obj = js.Dynamic.literal(x1 = x1, x2 = x2, y1 = y1, y2 = y2)
  
    __obj.asInstanceOf[BoundingBox12]
  }
}

