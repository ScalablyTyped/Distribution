package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Plane")
@js.native
class Plane protected ()
  extends cesiumLib.cesiumMod.CesiumNs.Plane {
  def this(normal: cesiumLib.cesiumMod.CesiumNs.Cartesian3, distance: scala.Double) = this()
  /* CompleteClass */
  override var distance: scala.Double = js.native
  /* CompleteClass */
  override var normal: cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
}

@JSImport("cesium", "Plane")
@js.native
object Plane extends js.Object {
  def fromPointNormal(point: cesiumLib.cesiumMod.CesiumNs.Cartesian3, normal: cesiumLib.cesiumMod.CesiumNs.Cartesian3): cesiumLib.cesiumMod.CesiumNs.Plane = js.native
  def fromPointNormal(
    point: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    normal: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    result: cesiumLib.cesiumMod.CesiumNs.Plane
  ): cesiumLib.cesiumMod.CesiumNs.Plane = js.native
  def getPointDistance(plane: cesiumLib.cesiumMod.CesiumNs.Plane, point: cesiumLib.cesiumMod.CesiumNs.Cartesian3): scala.Double = js.native
}

