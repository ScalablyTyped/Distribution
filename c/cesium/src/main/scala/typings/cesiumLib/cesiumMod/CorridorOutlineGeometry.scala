package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CorridorOutlineGeometry")
@js.native
class CorridorOutlineGeometry protected ()
  extends cesiumLib.cesiumMod.CesiumNs.CorridorOutlineGeometry {
  def this(options: cesiumLib.Anon_CornerTypeEllipsoid) = this()
}

/* static members */
@JSImport("cesium", "CorridorOutlineGeometry")
@js.native
object CorridorOutlineGeometry extends js.Object {
  def createGeometry(corridorOutlineGeometry: cesiumLib.cesiumMod.CesiumNs.CorridorOutlineGeometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.CorridorOutlineGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.CorridorOutlineGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.CorridorOutlineGeometry
  ): cesiumLib.cesiumMod.CesiumNs.CorridorOutlineGeometry = js.native
}

