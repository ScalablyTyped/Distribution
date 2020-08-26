package typings.cesium.anon

import typings.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BottomRadius extends js.Object {
  var bottomRadius: Double = js.native
  var length: Double = js.native
  var slices: js.UndefOr[Double] = js.native
  var topRadius: Double = js.native
  var vertexFormat: js.UndefOr[VertexFormat] = js.native
}

object BottomRadius {
  @scala.inline
  def apply(bottomRadius: Double, length: Double, topRadius: Double): BottomRadius = {
    val __obj = js.Dynamic.literal(bottomRadius = bottomRadius.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], topRadius = topRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomRadius]
  }
  @scala.inline
  implicit class BottomRadiusOps[Self <: BottomRadius] (val x: Self) extends AnyVal {
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
    def setSlices(value: Double): Self = this.set("slices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlices: Self = this.set("slices", js.undefined)
    @scala.inline
    def setVertexFormat(value: VertexFormat): Self = this.set("vertexFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertexFormat: Self = this.set("vertexFormat", js.undefined)
  }
  
}

