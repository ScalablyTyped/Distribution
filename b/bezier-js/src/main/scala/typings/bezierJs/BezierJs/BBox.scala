package typings.bezierJs.BezierJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BBox extends js.Object {
  var x: MinMax = js.native
  var y: MinMax = js.native
  var z: js.UndefOr[MinMax] = js.native
}

object BBox {
  @scala.inline
  def apply(x: MinMax, y: MinMax): BBox = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BBox]
  }
  @scala.inline
  implicit class BBoxOps[Self <: BBox] (val x: Self) extends AnyVal {
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
    def setX(value: MinMax): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: MinMax): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setZ(value: MinMax): Self = this.set("z", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
  }
  
}

