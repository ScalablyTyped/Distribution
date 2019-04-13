package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "SimplePolylineGeometry")
@js.native
class SimplePolylineGeometry protected () extends Packable {
  def this(options: cesiumLib.Anon_ColorsColorsPerVertex) = this()
}

/* static members */
@JSImport("cesium", "SimplePolylineGeometry")
@js.native
object SimplePolylineGeometry extends js.Object {
  def createGeometry(simplePolylineGeometry: cesiumLib.cesiumMod.SimplePolylineGeometry): cesiumLib.cesiumMod.Geometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.SimplePolylineGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.SimplePolylineGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.SimplePolylineGeometry
  ): cesiumLib.cesiumMod.SimplePolylineGeometry = js.native
}

