package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaximumCorner extends js.Object {
  var maximumCorner: Cartesian3 = js.native
  var minimumCorner: Cartesian3 = js.native
  var vertexFormat: js.UndefOr[VertexFormat] = js.native
}

object MaximumCorner {
  @scala.inline
  def apply(maximumCorner: Cartesian3, minimumCorner: Cartesian3): MaximumCorner = {
    val __obj = js.Dynamic.literal(maximumCorner = maximumCorner.asInstanceOf[js.Any], minimumCorner = minimumCorner.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumCorner]
  }
  @scala.inline
  implicit class MaximumCornerOps[Self <: MaximumCorner] (val x: Self) extends AnyVal {
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
    def setMaximumCorner(value: Cartesian3): Self = this.set("maximumCorner", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimumCorner(value: Cartesian3): Self = this.set("minimumCorner", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertexFormat(value: VertexFormat): Self = this.set("vertexFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertexFormat: Self = this.set("vertexFormat", js.undefined)
  }
  
}

