package typings.cesium

import typings.cesium.cesiumMod.Geometry
import typings.cesium.cesiumMod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributesGeometry extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.undefined
  var geometry: Geometry
  var id: js.UndefOr[js.Any] = js.undefined
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
}

object Anon_AttributesGeometry {
  @scala.inline
  def apply(geometry: Geometry, attributes: js.Any = null, id: js.Any = null, modelMatrix: Matrix4 = null): Anon_AttributesGeometry = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AttributesGeometry]
  }
}

