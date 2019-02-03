package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "SphereGeometry")
@js.native
class SphereGeometry ()
  extends cesiumLib.cesiumMod.CesiumNs.SphereGeometry {
  def this(options: cesiumLib.Anon_Radius) = this()
}

/* static members */
@JSImport("cesium", "SphereGeometry")
@js.native
object SphereGeometry extends js.Object {
  def createGeometry(sphereGeometry: cesiumLib.cesiumMod.CesiumNs.SphereGeometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.SphereGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.SphereGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.SphereGeometry
  ): cesiumLib.cesiumMod.CesiumNs.SphereGeometry = js.native
}

