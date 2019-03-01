package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VertexFormat extends Packable {
  var binormal: scala.Boolean
  var color: scala.Boolean
  var normal: scala.Boolean
  var position: scala.Boolean
  var st: scala.Boolean
  var tangent: scala.Boolean
}

object VertexFormat {
  @scala.inline
  def apply(
    binormal: scala.Boolean,
    color: scala.Boolean,
    normal: scala.Boolean,
    position: scala.Boolean,
    st: scala.Boolean,
    tangent: scala.Boolean
  ): VertexFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("binormal")(binormal)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("normal")(normal)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("st")(st)
    __obj.updateDynamic("tangent")(tangent)
    __obj.asInstanceOf[VertexFormat]
  }
}

