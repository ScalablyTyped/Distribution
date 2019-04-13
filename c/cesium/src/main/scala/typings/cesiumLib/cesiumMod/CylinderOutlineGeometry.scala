package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CylinderOutlineGeometry")
@js.native
class CylinderOutlineGeometry protected () extends Packable {
  def this(options: cesiumLib.Anon_BottomRadiusLength) = this()
}

/* static members */
@JSImport("cesium", "CylinderOutlineGeometry")
@js.native
object CylinderOutlineGeometry extends js.Object {
  def createGeometry(cylinderGeometry: cesiumLib.cesiumMod.CylinderOutlineGeometry): cesiumLib.cesiumMod.Geometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CylinderOutlineGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CylinderOutlineGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CylinderOutlineGeometry
  ): cesiumLib.cesiumMod.CylinderOutlineGeometry = js.native
}

