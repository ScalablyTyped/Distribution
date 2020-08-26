package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Center extends js.Object {
  var center: Cartesian3 = js.native
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.native
  var extrudedHeight: js.UndefOr[Double] = js.native
  var granularity: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var radius: Double = js.native
  var stRotation: js.UndefOr[Double] = js.native
  var vertexFormat: js.UndefOr[VertexFormat] = js.native
}

object Center {
  @scala.inline
  def apply(center: Cartesian3, radius: Double): Center = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[Center]
  }
  @scala.inline
  implicit class CenterOps[Self <: Center] (val x: Self) extends AnyVal {
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
    def setCenter(value: Cartesian3): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = this.set("ellipsoid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsoid: Self = this.set("ellipsoid", js.undefined)
    @scala.inline
    def setExtrudedHeight(value: Double): Self = this.set("extrudedHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtrudedHeight: Self = this.set("extrudedHeight", js.undefined)
    @scala.inline
    def setGranularity(value: Double): Self = this.set("granularity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGranularity: Self = this.set("granularity", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setStRotation(value: Double): Self = this.set("stRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStRotation: Self = this.set("stRotation", js.undefined)
    @scala.inline
    def setVertexFormat(value: VertexFormat): Self = this.set("vertexFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertexFormat: Self = this.set("vertexFormat", js.undefined)
  }
  
}

