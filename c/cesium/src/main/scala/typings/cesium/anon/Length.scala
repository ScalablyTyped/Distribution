package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Length extends js.Object {
  var bottomRadius: Double = js.native
  var length: Double = js.native
  var numberOfVerticalLines: js.UndefOr[Double] = js.native
  var slices: js.UndefOr[Double] = js.native
  var topRadius: Double = js.native
}

object Length {
  @scala.inline
  def apply(bottomRadius: Double, length: Double, topRadius: Double): Length = {
    val __obj = js.Dynamic.literal(bottomRadius = bottomRadius.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], topRadius = topRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
  @scala.inline
  implicit class LengthOps[Self <: Length] (val x: Self) extends AnyVal {
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
    def setBottomRadius(value: Double): Self = this.set("bottomRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopRadius(value: Double): Self = this.set("topRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfVerticalLines(value: Double): Self = this.set("numberOfVerticalLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfVerticalLines: Self = this.set("numberOfVerticalLines", js.undefined)
    @scala.inline
    def setSlices(value: Double): Self = this.set("slices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlices: Self = this.set("slices", js.undefined)
  }
  
}

