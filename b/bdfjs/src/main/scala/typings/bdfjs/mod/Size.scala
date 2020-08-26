package typings.bdfjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Size extends js.Object {
  var points: Double = js.native
  var resolutionX: Double = js.native
  var resolutionY: Double = js.native
}

object Size {
  @scala.inline
  def apply(points: Double, resolutionX: Double, resolutionY: Double): Size = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], resolutionX = resolutionX.asInstanceOf[js.Any], resolutionY = resolutionY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  @scala.inline
  implicit class SizeOps[Self <: Size] (val x: Self) extends AnyVal {
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
    def setPoints(value: Double): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolutionX(value: Double): Self = this.set("resolutionX", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolutionY(value: Double): Self = this.set("resolutionY", value.asInstanceOf[js.Any])
  }
  
}

