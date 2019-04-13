package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributesGeometry extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.undefined
  var geometry: cesiumLib.cesiumMod.Geometry
  var id: js.UndefOr[js.Any] = js.undefined
  var modelMatrix: js.UndefOr[cesiumLib.cesiumMod.Matrix4] = js.undefined
}

object Anon_AttributesGeometry {
  @scala.inline
  def apply(
    geometry: cesiumLib.cesiumMod.Geometry,
    attributes: js.Any = null,
    id: js.Any = null,
    modelMatrix: cesiumLib.cesiumMod.Matrix4 = null
  ): Anon_AttributesGeometry = {
    val __obj = js.Dynamic.literal(geometry = geometry)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix)
    __obj.asInstanceOf[Anon_AttributesGeometry]
  }
}

