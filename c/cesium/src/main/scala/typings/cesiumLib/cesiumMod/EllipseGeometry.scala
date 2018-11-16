package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EllipseGeometry")
@js.native
class EllipseGeometry protected ()
  extends cesiumLib.cesiumMod.CesiumNs.EllipseGeometry {
  def this(options: cesiumLib.Anon_ExtrudedHeightSemiMajorAxis) = this()
}

@JSImport("cesium", "EllipseGeometry")
@js.native
object EllipseGeometry extends js.Object {
  def createGeometry(ellipseGeometry: cesiumLib.cesiumMod.CesiumNs.EllipseGeometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.EllipseGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.EllipseGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.EllipseGeometry
  ): cesiumLib.cesiumMod.CesiumNs.EllipseGeometry = js.native
}

