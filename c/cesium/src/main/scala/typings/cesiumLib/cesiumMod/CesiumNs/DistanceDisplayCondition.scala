package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceDisplayCondition extends Packable {
  var far: scala.Double
  var near: scala.Double
  def clone(result: DistanceDisplayCondition): DistanceDisplayCondition
  def equals(other: DistanceDisplayCondition): scala.Boolean
}

object DistanceDisplayCondition {
  @scala.inline
  def apply(
    clone: DistanceDisplayCondition => DistanceDisplayCondition,
    equals: DistanceDisplayCondition => scala.Boolean,
    far: scala.Double,
    near: scala.Double
  ): DistanceDisplayCondition = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction1(clone), equals = js.Any.fromFunction1(equals), far = far, near = near)
  
    __obj.asInstanceOf[DistanceDisplayCondition]
  }
}

