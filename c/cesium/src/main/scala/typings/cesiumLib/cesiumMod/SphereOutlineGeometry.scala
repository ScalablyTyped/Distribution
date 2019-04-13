package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "SphereOutlineGeometry")
@js.native
class SphereOutlineGeometry () extends Packable {
  def this(options: cesiumLib.Anon_RadiusSlicePartitions) = this()
}

/* static members */
@JSImport("cesium", "SphereOutlineGeometry")
@js.native
object SphereOutlineGeometry extends js.Object {
  def createGeometry(sphereGeometry: cesiumLib.cesiumMod.SphereOutlineGeometry): cesiumLib.cesiumMod.Geometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.SphereOutlineGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.SphereOutlineGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.SphereOutlineGeometry
  ): cesiumLib.cesiumMod.SphereOutlineGeometry = js.native
}

