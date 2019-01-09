package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CircleGeometry")
@js.native
class CircleGeometry protected ()
  extends cesiumLib.cesiumMod.CesiumNs.CircleGeometry {
  def this(options: cesiumLib.Anon_Center) = this()
}

@JSImport("cesium", "CircleGeometry")
@js.native
object CircleGeometry extends js.Object {
  def createGeometry(circleGeometry: cesiumLib.cesiumMod.CesiumNs.CircleGeometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def unpack(array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): js.Array[scala.Double] = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.CircleGeometry
  ): js.Array[scala.Double] = js.native
}

