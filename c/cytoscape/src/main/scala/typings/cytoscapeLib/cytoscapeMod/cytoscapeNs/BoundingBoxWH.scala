package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundingBoxWH extends js.Object {
  var h: scala.Double
  var w: scala.Double
  var x1: scala.Double
  var y1: scala.Double
}

object BoundingBoxWH {
  @scala.inline
  def apply(h: scala.Double, w: scala.Double, x1: scala.Double, y1: scala.Double): BoundingBoxWH = {
    val __obj = js.Dynamic.literal(h = h, w = w, x1 = x1, y1 = y1)
  
    __obj.asInstanceOf[BoundingBoxWH]
  }
}

