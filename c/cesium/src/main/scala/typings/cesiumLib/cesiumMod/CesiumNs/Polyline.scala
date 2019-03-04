package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Polyline extends js.Object {
  var id: js.Any
  var loop: scala.Boolean
  var material: Material
  var positions: js.Array[Cartesian3]
  var show: scala.Boolean
  var width: scala.Double
}

object Polyline {
  @scala.inline
  def apply(
    id: js.Any,
    loop: scala.Boolean,
    material: Material,
    positions: js.Array[Cartesian3],
    show: scala.Boolean,
    width: scala.Double
  ): Polyline = {
    val __obj = js.Dynamic.literal(id = id, loop = loop, material = material, positions = positions, show = show, width = width)
  
    __obj.asInstanceOf[Polyline]
  }
}

