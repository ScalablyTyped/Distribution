package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EllipsoidOutlineGeometry")
@js.native
class EllipsoidOutlineGeometry () extends Packable {
  def this(options: cesiumLib.Anon_RadiiSlicePartitions) = this()
}

/* static members */
@JSImport("cesium", "EllipsoidOutlineGeometry")
@js.native
object EllipsoidOutlineGeometry extends js.Object {
  def createGeometry(ellipsoidGeometry: cesiumLib.cesiumMod.EllipsoidOutlineGeometry): cesiumLib.cesiumMod.Geometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.EllipsoidOutlineGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.EllipsoidOutlineGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.EllipsoidOutlineGeometry
  ): cesiumLib.cesiumMod.EllipsoidOutlineGeometry = js.native
}

