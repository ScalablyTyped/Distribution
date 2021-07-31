package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
object DistanceDisplayCondition {
  
  @JSImport("cesium", "DistanceDisplayCondition")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def clone_(): DistanceDisplayCondition = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")().asInstanceOf[DistanceDisplayCondition]
  @scala.inline
  def clone_(value: Unit, result: DistanceDisplayCondition): DistanceDisplayCondition = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(value.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[DistanceDisplayCondition]
  @scala.inline
  def clone_(value: DistanceDisplayCondition): DistanceDisplayCondition = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(value.asInstanceOf[js.Any]).asInstanceOf[DistanceDisplayCondition]
  @scala.inline
  def clone_(value: DistanceDisplayCondition, result: DistanceDisplayCondition): DistanceDisplayCondition = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(value.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[DistanceDisplayCondition]
  
  /* static member */
  @scala.inline
  def equals_(left: DistanceDisplayCondition, right: DistanceDisplayCondition): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def pack(value: DistanceDisplayCondition, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double, result: DistanceDisplayCondition): DistanceDisplayCondition = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[DistanceDisplayCondition]
}
