package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeometryInstance extends js.Object {
  var attributes: js.Any
  var geometry: Geometry
  var id: js.Any
  var modelMatrix: Matrix4
}

object GeometryInstance {
  @scala.inline
  def apply(attributes: js.Any, geometry: Geometry, id: js.Any, modelMatrix: Matrix4): GeometryInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("geometry")(geometry)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("modelMatrix")(modelMatrix)
    __obj.asInstanceOf[GeometryInstance]
  }
}

