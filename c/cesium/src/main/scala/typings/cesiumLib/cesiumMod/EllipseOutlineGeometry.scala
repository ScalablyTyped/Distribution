package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EllipseOutlineGeometry")
@js.native
class EllipseOutlineGeometry protected ()
  extends cesiumLib.cesiumMod.CesiumNs.EllipseOutlineGeometry {
  def this(options: cesiumLib.Anon_ExtrudedHeightSemiMajorAxisCenter) = this()
}

@JSImport("cesium", "EllipseOutlineGeometry")
@js.native
object EllipseOutlineGeometry extends js.Object {
  def createGeometry(ellipseGeometry: cesiumLib.cesiumMod.CesiumNs.EllipseOutlineGeometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.EllipseOutlineGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.EllipseOutlineGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.EllipseOutlineGeometry
  ): cesiumLib.cesiumMod.CesiumNs.EllipseOutlineGeometry = js.native
}

