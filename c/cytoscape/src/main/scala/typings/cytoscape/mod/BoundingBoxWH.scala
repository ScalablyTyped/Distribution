package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoundingBoxWH extends js.Object {
  var h: Double = js.native
  var w: Double = js.native
  var x1: Double = js.native
  var y1: Double = js.native
}

object BoundingBoxWH {
  @scala.inline
  def apply(h: Double, w: Double, x1: Double, y1: Double): BoundingBoxWH = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingBoxWH]
  }
  @scala.inline
  implicit class BoundingBoxWHOps[Self <: BoundingBoxWH] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setH(value: Double): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
    @scala.inline
    def setX1(value: Double): Self = this.set("x1", value.asInstanceOf[js.Any])
    @scala.inline
    def setY1(value: Double): Self = this.set("y1", value.asInstanceOf[js.Any])
  }
  
}

