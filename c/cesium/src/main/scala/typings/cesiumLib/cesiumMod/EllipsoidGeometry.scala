package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EllipsoidGeometry")
@js.native
class EllipsoidGeometry () extends Packable {
  def this(options: cesiumLib.Anon_Radii) = this()
}

/* static members */
@JSImport("cesium", "EllipsoidGeometry")
@js.native
object EllipsoidGeometry extends js.Object {
  def createGeometry(ellipsoidGeometry: cesiumLib.cesiumMod.EllipsoidGeometry): cesiumLib.cesiumMod.Geometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.EllipsoidGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.EllipsoidGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.EllipsoidGeometry
  ): cesiumLib.cesiumMod.EllipsoidGeometry = js.native
}

