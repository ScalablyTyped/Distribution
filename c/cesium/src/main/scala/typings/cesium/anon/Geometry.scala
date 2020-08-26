package typings.cesium.anon

import typings.cesium.mod.Matrix4
import typings.cesium.mod.PolygonGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geometry extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.native
  var geometry: typings.cesium.mod.Geometry | PolygonGeometry = js.native
  var id: js.UndefOr[js.Any] = js.native
  var modelMatrix: js.UndefOr[Matrix4] = js.native
}

object Geometry {
  @scala.inline
  def apply(geometry: typings.cesium.mod.Geometry | PolygonGeometry): Geometry = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  implicit class GeometryOps[Self <: Geometry] (val x: Self) extends AnyVal {
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
    def setGeometry(value: typings.cesium.mod.Geometry | PolygonGeometry): Self = this.set("geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: js.Any): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setModelMatrix(value: Matrix4): Self = this.set("modelMatrix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelMatrix: Self = this.set("modelMatrix", js.undefined)
  }
  
}

