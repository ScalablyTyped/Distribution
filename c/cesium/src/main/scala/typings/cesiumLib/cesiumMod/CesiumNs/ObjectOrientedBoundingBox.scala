package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectOrientedBoundingBox extends js.Object {
  var rotation: Matrix3 = js.native
  var scale: Cartesian3 = js.native
  var translation: Cartesian3 = js.native
  def clone(result: ObjectOrientedBoundingBox): ObjectOrientedBoundingBox = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: ObjectOrientedBoundingBox): scala.Boolean = js.native
}

