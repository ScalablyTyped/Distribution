package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plane extends js.Object {
  var distance: scala.Double
  var normal: Cartesian3
}

object Plane {
  @scala.inline
  def apply(distance: scala.Double, normal: Cartesian3): Plane = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("normal")(normal)
    __obj.asInstanceOf[Plane]
  }
}

