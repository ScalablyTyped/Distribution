package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CylinderOutlineGeometry")
@js.native
class CylinderOutlineGeometry protected ()
  extends cesiumLib.cesiumMod.CesiumNs.CylinderOutlineGeometry {
  def this(options: cesiumLib.Anon_BottomRadiusTopRadius) = this()
}

@JSImport("cesium", "CylinderOutlineGeometry")
@js.native
object CylinderOutlineGeometry extends js.Object {
  def createGeometry(cylinderGeometry: cesiumLib.cesiumMod.CesiumNs.CylinderOutlineGeometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.CylinderOutlineGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.CylinderOutlineGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.CylinderOutlineGeometry
  ): cesiumLib.cesiumMod.CesiumNs.CylinderOutlineGeometry = js.native
}

