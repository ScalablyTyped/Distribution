package typings.cesium.anon

import typings.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerPositionHeight extends js.Object {
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.native
  var extrudedHeight: js.UndefOr[Double] = js.native
  var granularity: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var perPositionHeight: js.UndefOr[Boolean] = js.native
  var polygonHierarchy: typings.cesium.mod.PolygonHierarchy = js.native
  var stRotation: js.UndefOr[Double] = js.native
  var vertexFormat: js.UndefOr[VertexFormat] = js.native
}

object PerPositionHeight {
  @scala.inline
  def apply(polygonHierarchy: typings.cesium.mod.PolygonHierarchy): PerPositionHeight = {
    val __obj = js.Dynamic.literal(polygonHierarchy = polygonHierarchy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerPositionHeight]
  }
  @scala.inline
  implicit class PerPositionHeightOps[Self <: PerPositionHeight] (val x: Self) extends AnyVal {
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
    def setPolygonHierarchy(value: typings.cesium.mod.PolygonHierarchy): Self = this.set("polygonHierarchy", value.asInstanceOf[js.Any])
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
    def setPerPositionHeight(value: Boolean): Self = this.set("perPositionHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerPositionHeight: Self = this.set("perPositionHeight", js.undefined)
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

