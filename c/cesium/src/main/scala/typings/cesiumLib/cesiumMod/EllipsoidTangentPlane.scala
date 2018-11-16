package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EllipsoidTangentPlane")
@js.native
class EllipsoidTangentPlane protected ()
  extends cesiumLib.cesiumMod.CesiumNs.EllipsoidTangentPlane {
  def this(ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid, origin: cesiumLib.cesiumMod.CesiumNs.Cartesian3) = this()
}

@JSImport("cesium", "EllipsoidTangentPlane")
@js.native
object EllipsoidTangentPlane extends js.Object {
  def fromPoints(
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid,
    cartesians: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.EllipsoidTangentPlane = js.native
}

