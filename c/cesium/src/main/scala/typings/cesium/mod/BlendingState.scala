package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlendingState extends StObject
@JSImport("cesium", "BlendingState")
@js.native
object BlendingState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlendingState with Double] = js.native
  
  @js.native
  sealed trait ADDITIVE_BLEND extends BlendingState
  /* 3 */ val ADDITIVE_BLEND: typings.cesium.mod.BlendingState.ADDITIVE_BLEND with Double = js.native
  
  @js.native
  sealed trait ALPHA_BLEND extends BlendingState
  /* 1 */ val ALPHA_BLEND: typings.cesium.mod.BlendingState.ALPHA_BLEND with Double = js.native
  
  @js.native
  sealed trait DISABLED extends BlendingState
  /* 0 */ val DISABLED: typings.cesium.mod.BlendingState.DISABLED with Double = js.native
  
  @js.native
  sealed trait PRE_MULTIPLIED_ALPHA_BLEND extends BlendingState
  /* 2 */ val PRE_MULTIPLIED_ALPHA_BLEND: typings.cesium.mod.BlendingState.PRE_MULTIPLIED_ALPHA_BLEND with Double = js.native
}
