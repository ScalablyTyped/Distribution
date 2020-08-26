package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkRRect extends js.Object {
  var rect: SkRect = js.native
  var rx1: Double = js.native
  var rx2: Double = js.native
  var rx3: Double = js.native
  var rx4: Double = js.native
  var ry1: Double = js.native
  var ry2: Double = js.native
  var ry3: Double = js.native
  var ry4: Double = js.native
}

object SkRRect {
  @scala.inline
  def apply(
    rect: SkRect,
    rx1: Double,
    rx2: Double,
    rx3: Double,
    rx4: Double,
    ry1: Double,
    ry2: Double,
    ry3: Double,
    ry4: Double
  ): SkRRect = {
    val __obj = js.Dynamic.literal(rect = rect.asInstanceOf[js.Any], rx1 = rx1.asInstanceOf[js.Any], rx2 = rx2.asInstanceOf[js.Any], rx3 = rx3.asInstanceOf[js.Any], rx4 = rx4.asInstanceOf[js.Any], ry1 = ry1.asInstanceOf[js.Any], ry2 = ry2.asInstanceOf[js.Any], ry3 = ry3.asInstanceOf[js.Any], ry4 = ry4.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkRRect]
  }
  @scala.inline
  implicit class SkRRectOps[Self <: SkRRect] (val x: Self) extends AnyVal {
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
    def setRect(value: SkRect): Self = this.set("rect", value.asInstanceOf[js.Any])
    @scala.inline
    def setRx1(value: Double): Self = this.set("rx1", value.asInstanceOf[js.Any])
    @scala.inline
    def setRx2(value: Double): Self = this.set("rx2", value.asInstanceOf[js.Any])
    @scala.inline
    def setRx3(value: Double): Self = this.set("rx3", value.asInstanceOf[js.Any])
    @scala.inline
    def setRx4(value: Double): Self = this.set("rx4", value.asInstanceOf[js.Any])
    @scala.inline
    def setRy1(value: Double): Self = this.set("ry1", value.asInstanceOf[js.Any])
    @scala.inline
    def setRy2(value: Double): Self = this.set("ry2", value.asInstanceOf[js.Any])
    @scala.inline
    def setRy3(value: Double): Self = this.set("ry3", value.asInstanceOf[js.Any])
    @scala.inline
    def setRy4(value: Double): Self = this.set("ry4", value.asInstanceOf[js.Any])
  }
  
}

