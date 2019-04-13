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
  
  val ADDITIVE_BLEND: ADDITIVE_BLEND with java.lang.String = js.native
  val ALPHA_BLEND: ALPHA_BLEND with java.lang.String = js.native
  val DISABLED: DISABLED with java.lang.String = js.native
  val PRE_MULTIPLIED_ALPHA_BLEND: PRE_MULTIPLIED_ALPHA_BLEND with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.BlendingState with java.lang.String] = js.native
}

