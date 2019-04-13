package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "BoxOutlineGeometry")
@js.native
class BoxOutlineGeometry () extends Packable

/* static members */
@JSImport("cesium", "BoxOutlineGeometry")
@js.native
object BoxOutlineGeometry extends js.Object {
  def createGeometry(boxGeometry: cesiumLib.cesiumMod.BoxOutlineGeometry): cesiumLib.cesiumMod.Geometry = js.native
  def fromDimensions(): scala.Unit = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.BoxOutlineGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.BoxOutlineGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.BoxOutlineGeometry
  ): cesiumLib.cesiumMod.BoxOutlineGeometry = js.native
}

