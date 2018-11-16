package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Ray")
@js.native
class Ray ()
  extends cesiumLib.cesiumMod.CesiumNs.Ray {
  def this(origin: cesiumLib.cesiumMod.CesiumNs.Cartesian3) = this()
  def this(origin: cesiumLib.cesiumMod.CesiumNs.Cartesian3, direction: cesiumLib.cesiumMod.CesiumNs.Cartesian3) = this()
  /* CompleteClass */
  override var direction: cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  /* CompleteClass */
  override var origin: cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
}

@JSImport("cesium", "Ray")
@js.native
object Ray extends js.Object {
  def getPoint(t: scala.Double): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def getPoint(t: scala.Double, result: cesiumLib.cesiumMod.CesiumNs.Cartesian3): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
}

