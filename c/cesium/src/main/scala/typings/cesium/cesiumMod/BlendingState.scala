package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BlendingState extends js.Object

@JSImport("cesium", "BlendingState")
@js.native
object BlendingState extends js.Object {
  @js.native
  sealed trait ADDITIVE_BLEND extends BlendingState
  
  @js.native
  sealed trait ALPHA_BLEND extends BlendingState
  
  @js.native
  sealed trait DISABLED extends BlendingState
  
  @js.native
  sealed trait PRE_MULTIPLIED_ALPHA_BLEND extends BlendingState
  
  /* 3 */ val ADDITIVE_BLEND: typings.cesium.cesiumMod.BlendingState.ADDITIVE_BLEND with Double = js.native
  /* 1 */ val ALPHA_BLEND: typings.cesium.cesiumMod.BlendingState.ALPHA_BLEND with Double = js.native
  /* 0 */ val DISABLED: typings.cesium.cesiumMod.BlendingState.DISABLED with Double = js.native
  /* 2 */ val PRE_MULTIPLIED_ALPHA_BLEND: typings.cesium.cesiumMod.BlendingState.PRE_MULTIPLIED_ALPHA_BLEND with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlendingState with Double] = js.native
}

