package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoundingRectangle extends js.Object {
  var height: scala.Double = js.native
  var width: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def clone(result: BoundingRectangle): BoundingRectangle = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: BoundingRectangle): scala.Boolean = js.native
  def intersect(right: BoundingRectangle): Intersect = js.native
}

