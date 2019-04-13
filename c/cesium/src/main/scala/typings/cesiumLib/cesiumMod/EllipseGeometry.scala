package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EllipseGeometry")
@js.native
class EllipseGeometry protected () extends Packable {
  def this(options: cesiumLib.Anon_CenterEllipsoidExtrudedHeight) = this()
}

/* static members */
@JSImport("cesium", "EllipseGeometry")
@js.native
object EllipseGeometry extends js.Object {
  def createGeometry(ellipseGeometry: cesiumLib.cesiumMod.EllipseGeometry): cesiumLib.cesiumMod.Geometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.EllipseGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.EllipseGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.EllipseGeometry
  ): cesiumLib.cesiumMod.EllipseGeometry = js.native
}

