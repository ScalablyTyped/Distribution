package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "BoxGeometry")
@js.native
class BoxGeometry protected ()
  extends cesiumLib.cesiumMod.CesiumNs.BoxGeometry {
  def this(options: cesiumLib.Anon_MaximumCorner) = this()
}

/* static members */
@JSImport("cesium", "BoxGeometry")
@js.native
object BoxGeometry extends js.Object {
  def createGeometry(boxGeometry: cesiumLib.cesiumMod.CesiumNs.BoxGeometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def fromDimensions(): scala.Unit = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.BoxGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.BoxGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.BoxGeometry
  ): cesiumLib.cesiumMod.CesiumNs.BoxGeometry = js.native
}

