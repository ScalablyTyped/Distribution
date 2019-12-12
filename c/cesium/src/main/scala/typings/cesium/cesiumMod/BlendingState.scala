package typings.cesium.cesiumMod

import org.scalablytyped.runtime.TopLevel
import typings.cesium.cesiumMod.BlendingState.ADDITIVE_BLEND
import typings.cesium.cesiumMod.BlendingState.ALPHA_BLEND
import typings.cesium.cesiumMod.BlendingState.DISABLED
import typings.cesium.cesiumMod.BlendingState.PRE_MULTIPLIED_ALPHA_BLEND
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlendingState with Double] = js.native
  /* 3 */ @js.native
  object ADDITIVE_BLEND extends TopLevel[ADDITIVE_BLEND with Double]
  
  /* 1 */ @js.native
  object ALPHA_BLEND extends TopLevel[ALPHA_BLEND with Double]
  
  /* 0 */ @js.native
  object DISABLED extends TopLevel[DISABLED with Double]
  
  /* 2 */ @js.native
  object PRE_MULTIPLIED_ALPHA_BLEND extends TopLevel[PRE_MULTIPLIED_ALPHA_BLEND with Double]
  
}

