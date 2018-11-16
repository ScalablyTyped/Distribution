package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisAlignedBoundingBox extends js.Object {
  var center: Cartesian3 = js.native
  var maximum: Cartesian3 = js.native
  var minimum: Cartesian3 = js.native
  def clone(result: AxisAlignedBoundingBox): AxisAlignedBoundingBox = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: AxisAlignedBoundingBox): scala.Boolean = js.native
  def intersect(plane: Cartesian4): Intersect = js.native
}

