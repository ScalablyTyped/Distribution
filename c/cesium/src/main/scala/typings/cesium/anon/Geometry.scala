package typings.cesium.anon

import typings.cesium.mod.Matrix4
import typings.cesium.mod.PolygonGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geometry extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.undefined
  var geometry: typings.cesium.mod.Geometry | PolygonGeometry
  var id: js.UndefOr[js.Any] = js.undefined
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
}

object Geometry {
  @scala.inline
  def apply(
    geometry: typings.cesium.mod.Geometry | PolygonGeometry,
    attributes: js.Any = null,
    id: js.Any = null,
    modelMatrix: Matrix4 = null
  ): Geometry = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
}

