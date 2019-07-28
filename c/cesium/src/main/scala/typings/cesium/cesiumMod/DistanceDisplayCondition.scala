package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "DistanceDisplayCondition")
@js.native
class DistanceDisplayCondition protected () extends Packable {
  def this(near: Double, far: Double) = this()
  var far: Double = js.native
  var near: Double = js.native
  def clone(result: DistanceDisplayCondition): DistanceDisplayCondition = js.native
  def equals(other: DistanceDisplayCondition): Boolean = js.native
}

/* static members */
@JSImport("cesium", "DistanceDisplayCondition")
@js.native
object DistanceDisplayCondition extends js.Object {
  def clone(value: DistanceDisplayCondition): DistanceDisplayCondition = js.native
  def clone(value: DistanceDisplayCondition, result: DistanceDisplayCondition): DistanceDisplayCondition = js.native
  def equals(left: DistanceDisplayCondition, right: DistanceDisplayCondition): Boolean = js.native
  def pack(value: DistanceDisplayCondition, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: DistanceDisplayCondition): DistanceDisplayCondition = js.native
}

