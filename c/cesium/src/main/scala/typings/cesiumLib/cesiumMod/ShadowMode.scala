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
  
  val CAST_ONLY: CAST_ONLY with java.lang.String = js.native
  val DISABLED: DISABLED with java.lang.String = js.native
  val ENABLED: ENABLED with java.lang.String = js.native
  val RECEIVE_ONLY: RECEIVE_ONLY with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.ShadowMode with java.lang.String] = js.native
}

