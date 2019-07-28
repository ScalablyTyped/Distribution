package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StencilOperation extends js.Object

@JSImport("cesium", "StencilOperation")
@js.native
object StencilOperation extends js.Object {
  @js.native
  sealed trait DECREMENT extends StencilOperation
  
  @js.native
  sealed trait DECREMENT_WRAP extends StencilOperation
  
  @js.native
  sealed trait INCREMENT extends StencilOperation
  
  @js.native
  sealed trait INCREMENT_WRAP extends StencilOperation
  
  @js.native
  sealed trait INVERT extends StencilOperation
  
  @js.native
  sealed trait KEEP extends StencilOperation
  
  @js.native
  sealed trait REPLACE extends StencilOperation
  
  @js.native
  sealed trait ZERO extends StencilOperation
  
  /* 4 */ val DECREMENT: typings.cesium.cesiumMod.StencilOperation.DECREMENT with Double = js.native
  /* 7 */ val DECREMENT_WRAP: typings.cesium.cesiumMod.StencilOperation.DECREMENT_WRAP with Double = js.native
  /* 3 */ val INCREMENT: typings.cesium.cesiumMod.StencilOperation.INCREMENT with Double = js.native
  /* 6 */ val INCREMENT_WRAP: typings.cesium.cesiumMod.StencilOperation.INCREMENT_WRAP with Double = js.native
  /* 5 */ val INVERT: typings.cesium.cesiumMod.StencilOperation.INVERT with Double = js.native
  /* 1 */ val KEEP: typings.cesium.cesiumMod.StencilOperation.KEEP with Double = js.native
  /* 2 */ val REPLACE: typings.cesium.cesiumMod.StencilOperation.REPLACE with Double = js.native
  /* 0 */ val ZERO: typings.cesium.cesiumMod.StencilOperation.ZERO with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StencilOperation with Double] = js.native
}

