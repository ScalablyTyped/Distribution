package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolylineVolumeGeometry")
@js.native
class PolylineVolumeGeometry protected ()
  extends cesiumLib.cesiumMod.CesiumNs.PolylineVolumeGeometry {
  def this(options: cesiumLib.Anon_PolylinePositionsVertexFormat) = this()
}

@JSImport("cesium", "PolylineVolumeGeometry")
@js.native
object PolylineVolumeGeometry extends js.Object {
  def createGeometry(polylineVolumeGeometry: cesiumLib.cesiumMod.CesiumNs.PolylineVolumeGeometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.PolylineVolumeGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.PolylineVolumeGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.PolylineVolumeGeometry
  ): cesiumLib.cesiumMod.CesiumNs.PolylineVolumeGeometry = js.native
}

