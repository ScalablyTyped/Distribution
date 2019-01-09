package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolylineVolumeOutlineGeometry")
@js.native
class PolylineVolumeOutlineGeometry protected ()
  extends cesiumLib.cesiumMod.CesiumNs.PolylineVolumeOutlineGeometry {
  def this(options: cesiumLib.Anon_CornerTypeEllipsoidGranularityPolylinePositions) = this()
}

@JSImport("cesium", "PolylineVolumeOutlineGeometry")
@js.native
object PolylineVolumeOutlineGeometry extends js.Object {
  def createGeometry(polylineVolumeOutlineGeometry: cesiumLib.cesiumMod.CesiumNs.PolylineVolumeOutlineGeometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.PolylineVolumeOutlineGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.PolylineVolumeOutlineGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.PolylineVolumeOutlineGeometry
  ): cesiumLib.cesiumMod.CesiumNs.PolylineVolumeOutlineGeometry = js.native
}

