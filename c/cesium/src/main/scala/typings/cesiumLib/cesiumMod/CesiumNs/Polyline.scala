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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("loop")(loop)
    __obj.updateDynamic("material")(material)
    __obj.updateDynamic("positions")(positions)
    __obj.updateDynamic("show")(show)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Polyline]
  }
}

