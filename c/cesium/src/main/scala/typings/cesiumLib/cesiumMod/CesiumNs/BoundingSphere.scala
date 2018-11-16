package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoundingSphere extends Packable {
  var center: Cartesian3 = js.native
  var radius: scala.Double = js.native
  def clone(result: BoundingSphere): BoundingSphere = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: BoundingSphere): scala.Boolean = js.native
  def intersect(plane: Cartesian4): Intersect = js.native
}

