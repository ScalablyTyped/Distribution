package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeometryAttributes extends js.Object {
  var binormal: GeometryAttribute
  var color: GeometryAttribute
  var normal: GeometryAttribute
  var position: GeometryAttribute
  var st: GeometryAttribute
  var tangent: GeometryAttribute
}

object GeometryAttributes {
  @scala.inline
  def apply(
    binormal: GeometryAttribute,
    color: GeometryAttribute,
    normal: GeometryAttribute,
    position: GeometryAttribute,
    st: GeometryAttribute,
    tangent: GeometryAttribute
  ): GeometryAttributes = {
    val __obj = js.Dynamic.literal(binormal = binormal, color = color, normal = normal, position = position, st = st, tangent = tangent)
  
    __obj.asInstanceOf[GeometryAttributes]
  }
}

