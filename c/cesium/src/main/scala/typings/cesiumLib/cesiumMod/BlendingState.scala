package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BlendingState extends js.Object

@JSImport("cesium", "BlendingState")
@js.native
object BlendingState extends js.Object {
  @js.native
  sealed trait ADDITIVE_BLEND
    extends cesiumLib.cesiumMod.BlendingState
  
  @js.native
  sealed trait ALPHA_BLEND
    extends cesiumLib.cesiumMod.BlendingState
  
  @js.native
  sealed trait DISABLED
    extends cesiumLib.cesiumMod.BlendingState
  
  @js.native
  sealed trait PRE_MULTIPLIED_ALPHA_BLEND
    extends cesiumLib.cesiumMod.BlendingState
  
  /* 3 */ val ADDITIVE_BLEND: ADDITIVE_BLEND with scala.Double = js.native
  /* 1 */ val ALPHA_BLEND: ALPHA_BLEND with scala.Double = js.native
  /* 0 */ val DISABLED: DISABLED with scala.Double = js.native
  /* 2 */ val PRE_MULTIPLIED_ALPHA_BLEND: PRE_MULTIPLIED_ALPHA_BLEND with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.BlendingState with scala.Double] = js.native
}

