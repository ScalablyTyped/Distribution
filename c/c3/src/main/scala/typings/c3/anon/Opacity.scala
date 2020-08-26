package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Opacity extends js.Object {
  /** Class to apply to the region. */
  var `class`: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Double] = js.native
  /** Points should be added in counter-clockwise direction  to close the polygon. */
  var points: js.Array[X] = js.native
  var text: js.UndefOr[String] = js.native
}

object Opacity {
  @scala.inline
  def apply(points: js.Array[X]): Opacity = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opacity]
  }
  @scala.inline
  implicit class OpacityOps[Self <: Opacity] (val x: Self) extends AnyVal {
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
    def setPointsVarargs(value: X*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[X]): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

