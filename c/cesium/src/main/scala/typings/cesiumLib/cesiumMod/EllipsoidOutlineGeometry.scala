package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EllipsoidOutlineGeometry")
@js.native
class EllipsoidOutlineGeometry ()
  extends cesiumLib.cesiumMod.CesiumNs.EllipsoidOutlineGeometry {
  def this(options: cesiumLib.Anon_RadiiSlicePartitions) = this()
}

/* static members */
@JSImport("cesium", "EllipsoidOutlineGeometry")
@js.native
object EllipsoidOutlineGeometry extends js.Object {
  def createGeometry(ellipsoidGeometry: cesiumLib.cesiumMod.CesiumNs.EllipsoidOutlineGeometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.EllipsoidOutlineGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.EllipsoidOutlineGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.EllipsoidOutlineGeometry
  ): cesiumLib.cesiumMod.CesiumNs.EllipsoidOutlineGeometry = js.native
}

