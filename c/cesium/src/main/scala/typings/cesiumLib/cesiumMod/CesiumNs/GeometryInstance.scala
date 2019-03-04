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
    val __obj = js.Dynamic.literal(attributes = attributes, geometry = geometry, id = id, modelMatrix = modelMatrix)
  
    __obj.asInstanceOf[GeometryInstance]
  }
}

