package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Ray")
@js.native
class Ray () extends js.Object {
  def this(origin: Cartesian3) = this()
  def this(origin: Cartesian3, direction: Cartesian3) = this()
  var direction: Cartesian3 = js.native
  var origin: Cartesian3 = js.native
}

/* static members */
@JSImport("cesium", "Ray")
@js.native
object Ray extends js.Object {
  def getPoint(t: scala.Double): cesiumLib.cesiumMod.Cartesian3 = js.native
  def getPoint(t: scala.Double, result: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Cartesian3 = js.native
}

