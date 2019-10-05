package typings.cytoscape.cytoscapeMod

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
    val __obj = js.Dynamic.literal(h = h, w = w, x1 = x1, y1 = y1)
  
    __obj.asInstanceOf[BoundingBoxWH]
  }
}

