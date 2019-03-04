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
    clone: js.Function1[DistanceDisplayCondition, DistanceDisplayCondition],
    equals: js.Function1[DistanceDisplayCondition, scala.Boolean],
    far: scala.Double,
    near: scala.Double
  ): DistanceDisplayCondition = {
    val __obj = js.Dynamic.literal(clone = clone, equals = equals, far = far, near = near)
  
    __obj.asInstanceOf[DistanceDisplayCondition]
  }
}

