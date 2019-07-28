package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Plane")
@js.native
class Plane protected () extends js.Object {
  def this(normal: Cartesian3, distance: Double) = this()
  var distance: Double = js.native
  var normal: Cartesian3 = js.native
}

/* static members */
@JSImport("cesium", "Plane")
@js.native
object Plane extends js.Object {
  def fromPointNormal(point: Cartesian3, normal: Cartesian3): Plane = js.native
  def fromPointNormal(point: Cartesian3, normal: Cartesian3, result: Plane): Plane = js.native
  def getPointDistance(plane: Plane, point: Cartesian3): Double = js.native
}

