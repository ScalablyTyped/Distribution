package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.DistanceDisplayCondition")
@js.native
class DistanceDisplayCondition protected ()
  extends typings.cesium.mod.DistanceDisplayCondition {
  def this(near: Double, far: Double) = this()
}
object DistanceDisplayCondition {
  
  @JSGlobal("Cesium.DistanceDisplayCondition")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def clone_(): typings.cesium.mod.DistanceDisplayCondition = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")().asInstanceOf[typings.cesium.mod.DistanceDisplayCondition]
  inline def clone_(value: Unit, result: typings.cesium.mod.DistanceDisplayCondition): typings.cesium.mod.DistanceDisplayCondition = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(value.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.DistanceDisplayCondition]
  inline def clone_(value: typings.cesium.mod.DistanceDisplayCondition): typings.cesium.mod.DistanceDisplayCondition = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(value.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.DistanceDisplayCondition]
  inline def clone_(
    value: typings.cesium.mod.DistanceDisplayCondition,
    result: typings.cesium.mod.DistanceDisplayCondition
  ): typings.cesium.mod.DistanceDisplayCondition = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(value.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.DistanceDisplayCondition]
  
  /* static member */
  inline def equals_(
    left: typings.cesium.mod.DistanceDisplayCondition,
    right: typings.cesium.mod.DistanceDisplayCondition
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def pack(value: typings.cesium.mod.DistanceDisplayCondition, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  inline def unpack(
    array: js.Array[Double],
    startingIndex: Double,
    result: typings.cesium.mod.DistanceDisplayCondition
  ): typings.cesium.mod.DistanceDisplayCondition = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.DistanceDisplayCondition]
}
