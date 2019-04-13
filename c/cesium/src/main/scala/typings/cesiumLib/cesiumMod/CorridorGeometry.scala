package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CorridorGeometry")
@js.native
class CorridorGeometry protected () extends Packable {
  def this(options: cesiumLib.Anon_CornerType) = this()
}

/* static members */
@JSImport("cesium", "CorridorGeometry")
@js.native
object CorridorGeometry extends js.Object {
  def createGeometry(corridorGeometry: cesiumLib.cesiumMod.CorridorGeometry): cesiumLib.cesiumMod.Geometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CorridorGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CorridorGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CorridorGeometry
  ): cesiumLib.cesiumMod.CorridorGeometry = js.native
}

