package typings.cesium.mod

import org.scalablytyped.runtime.StObject
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
object DistanceDisplayCondition {
  
  /* static member */
  @JSImport("cesium", "DistanceDisplayCondition.clone")
  @js.native
  def clone_(): DistanceDisplayCondition = js.native
  @JSImport("cesium", "DistanceDisplayCondition.clone")
  @js.native
  def clone_(value: js.UndefOr[scala.Nothing], result: DistanceDisplayCondition): DistanceDisplayCondition = js.native
  @JSImport("cesium", "DistanceDisplayCondition.clone")
  @js.native
  def clone_(value: DistanceDisplayCondition): DistanceDisplayCondition = js.native
  @JSImport("cesium", "DistanceDisplayCondition.clone")
  @js.native
  def clone_(value: DistanceDisplayCondition, result: DistanceDisplayCondition): DistanceDisplayCondition = js.native
  
  /* static member */
  @JSImport("cesium", "DistanceDisplayCondition.equals")
  @js.native
  def equals_(left: DistanceDisplayCondition, right: DistanceDisplayCondition): Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "DistanceDisplayCondition.pack")
  @js.native
  def pack(value: DistanceDisplayCondition, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  
  /* static member */
  @JSImport("cesium", "DistanceDisplayCondition.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: DistanceDisplayCondition): DistanceDisplayCondition = js.native
}
