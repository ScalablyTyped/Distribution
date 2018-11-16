package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CorridorGeometry")
@js.native
class CorridorGeometry protected ()
  extends cesiumLib.cesiumMod.CesiumNs.CorridorGeometry {
  def this(options: cesiumLib.Anon_ExtrudedHeightHeight) = this()
}

@JSImport("cesium", "CorridorGeometry")
@js.native
object CorridorGeometry extends js.Object {
  def createGeometry(corridorGeometry: cesiumLib.cesiumMod.CesiumNs.CorridorGeometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.CorridorGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.CorridorGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.CorridorGeometry
  ): cesiumLib.cesiumMod.CesiumNs.CorridorGeometry = js.native
}

