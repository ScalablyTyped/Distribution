package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CircleOutlineGeometry")
@js.native
class CircleOutlineGeometry protected () extends Packable {
  def this(options: cesiumLib.Anon_CenterEllipsoid) = this()
}

/* static members */
@JSImport("cesium", "CircleOutlineGeometry")
@js.native
object CircleOutlineGeometry extends js.Object {
  def createGeometry(circleGeometry: cesiumLib.cesiumMod.CircleOutlineGeometry): cesiumLib.cesiumMod.Geometry = js.native
  def unpack(array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): js.Array[scala.Double] = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CircleOutlineGeometry
  ): js.Array[scala.Double] = js.native
}

