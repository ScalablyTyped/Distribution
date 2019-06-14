package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShadowMode extends js.Object

@JSImport("cesium", "ShadowMode")
@js.native
object ShadowMode extends js.Object {
  @js.native
  sealed trait CAST_ONLY
    extends cesiumLib.cesiumMod.ShadowMode
  
  @js.native
  sealed trait DISABLED
    extends cesiumLib.cesiumMod.ShadowMode
  
  @js.native
  sealed trait ENABLED
    extends cesiumLib.cesiumMod.ShadowMode
  
  @js.native
  sealed trait RECEIVE_ONLY
    extends cesiumLib.cesiumMod.ShadowMode
  
  /* 0 */ val CAST_ONLY: CAST_ONLY with scala.Double = js.native
  /* 1 */ val DISABLED: DISABLED with scala.Double = js.native
  /* 2 */ val ENABLED: ENABLED with scala.Double = js.native
  /* 3 */ val RECEIVE_ONLY: RECEIVE_ONLY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.ShadowMode with scala.Double] = js.native
}

