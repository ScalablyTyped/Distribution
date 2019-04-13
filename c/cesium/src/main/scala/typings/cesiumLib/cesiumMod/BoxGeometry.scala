package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "BoxGeometry")
@js.native
class BoxGeometry protected () extends Packable {
  def this(options: cesiumLib.Anon_MaximumCorner) = this()
}

/* static members */
@JSImport("cesium", "BoxGeometry")
@js.native
object BoxGeometry extends js.Object {
  def createGeometry(boxGeometry: cesiumLib.cesiumMod.BoxGeometry): cesiumLib.cesiumMod.Geometry = js.native
  def fromDimensions(): scala.Unit = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.BoxGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.BoxGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.BoxGeometry
  ): cesiumLib.cesiumMod.BoxGeometry = js.native
}

