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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("binormal")(binormal)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("normal")(normal)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("st")(st)
    __obj.updateDynamic("tangent")(tangent)
    __obj.asInstanceOf[GeometryAttributes]
  }
}

