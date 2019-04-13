package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CylinderGeometry")
@js.native
class CylinderGeometry protected () extends Packable {
  def this(options: cesiumLib.Anon_BottomRadius) = this()
}

/* static members */
@JSImport("cesium", "CylinderGeometry")
@js.native
object CylinderGeometry extends js.Object {
  def createGeometry(cylinderGeometry: cesiumLib.cesiumMod.CylinderGeometry): cesiumLib.cesiumMod.Geometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CylinderGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CylinderGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CylinderGeometry
  ): cesiumLib.cesiumMod.CylinderGeometry = js.native
}

