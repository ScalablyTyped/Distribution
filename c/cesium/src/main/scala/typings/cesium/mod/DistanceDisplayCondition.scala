package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "DistanceDisplayCondition")
@js.native
class DistanceDisplayCondition protected () extends Packable {
  def this(near: Double, far: Double) = this()
  
  def clone(result: DistanceDisplayCondition): DistanceDisplayCondition = js.native
  
  def equals(other: DistanceDisplayCondition): Boolean = js.native
  
  var far: Double = js.native
  
  var near: Double = js.native
}
/* static members */
@JSImport("cesium", "DistanceDisplayCondition")
@js.native
object DistanceDisplayCondition extends js.Object {
  
  def clone(value: js.UndefOr[scala.Nothing], result: DistanceDisplayCondition): DistanceDisplayCondition = js.native
  def clone(value: DistanceDisplayCondition): DistanceDisplayCondition = js.native
  def clone(value: DistanceDisplayCondition, result: DistanceDisplayCondition): DistanceDisplayCondition = js.native
  
  def equals(left: DistanceDisplayCondition, right: DistanceDisplayCondition): Boolean = js.native
  
  def pack(value: DistanceDisplayCondition, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  
  def unpack(array: js.Array[Double], startingIndex: Double, result: DistanceDisplayCondition): DistanceDisplayCondition = js.native
}
