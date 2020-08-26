package typings.croppie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Orientation extends js.Object {
  var orientation: js.UndefOr[Double] = js.native
  var points: js.UndefOr[js.Array[Double]] = js.native
  var url: String = js.native
  var useCanvas: js.UndefOr[Boolean] = js.native
  var zoom: js.UndefOr[Double] = js.native
}

object Orientation {
  @scala.inline
  def apply(url: String): Orientation = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Orientation]
  }
  @scala.inline
  implicit class OrientationOps[Self <: Orientation] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientation(value: Double): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setPointsVarargs(value: Double*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[Double]): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    @scala.inline
    def setUseCanvas(value: Boolean): Self = this.set("useCanvas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCanvas: Self = this.set("useCanvas", js.undefined)
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

