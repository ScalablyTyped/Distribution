package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "SimplePolylineGeometry")
@js.native
class SimplePolylineGeometry protected ()
  extends cesiumLib.cesiumMod.CesiumNs.SimplePolylineGeometry {
  def this(options: cesiumLib.Anon_ColorsColorsPerVertex) = this()
}

@JSImport("cesium", "SimplePolylineGeometry")
@js.native
object SimplePolylineGeometry extends js.Object {
  def createGeometry(simplePolylineGeometry: cesiumLib.cesiumMod.CesiumNs.SimplePolylineGeometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.SimplePolylineGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.SimplePolylineGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.SimplePolylineGeometry
  ): cesiumLib.cesiumMod.CesiumNs.SimplePolylineGeometry = js.native
}

