package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolylineGeometry")
@js.native
class PolylineGeometry protected ()
  extends cesiumLib.cesiumMod.CesiumNs.PolylineGeometry {
  def this(options: cesiumLib.Anon_Colors) = this()
}

/* static members */
@JSImport("cesium", "PolylineGeometry")
@js.native
object PolylineGeometry extends js.Object {
  def createGeometry(polylineGeometry: cesiumLib.cesiumMod.CesiumNs.PolylineGeometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.PolylineGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.PolylineGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.PolylineGeometry
  ): cesiumLib.cesiumMod.CesiumNs.PolylineGeometry = js.native
}

