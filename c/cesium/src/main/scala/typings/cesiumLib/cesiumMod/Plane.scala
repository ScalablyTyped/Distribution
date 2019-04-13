package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Plane")
@js.native
class Plane protected () extends js.Object {
  def this(normal: Cartesian3, distance: scala.Double) = this()
  var distance: scala.Double = js.native
  var normal: Cartesian3 = js.native
}

/* static members */
@JSImport("cesium", "Plane")
@js.native
object Plane extends js.Object {
  def fromPointNormal(point: cesiumLib.cesiumMod.Cartesian3, normal: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Plane = js.native
  def fromPointNormal(
    point: cesiumLib.cesiumMod.Cartesian3,
    normal: cesiumLib.cesiumMod.Cartesian3,
    result: cesiumLib.cesiumMod.Plane
  ): cesiumLib.cesiumMod.Plane = js.native
  def getPointDistance(plane: cesiumLib.cesiumMod.Plane, point: cesiumLib.cesiumMod.Cartesian3): scala.Double = js.native
}

