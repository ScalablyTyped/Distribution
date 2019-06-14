package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalOrigin extends js.Object

@JSImport("cesium", "HorizontalOrigin")
@js.native
object HorizontalOrigin extends js.Object {
  @js.native
  sealed trait CENTER
    extends cesiumLib.cesiumMod.HorizontalOrigin
  
  @js.native
  sealed trait LEFT
    extends cesiumLib.cesiumMod.HorizontalOrigin
  
  @js.native
  sealed trait RIGHT
    extends cesiumLib.cesiumMod.HorizontalOrigin
  
  /* 0 */ val CENTER: CENTER with scala.Double = js.native
  /* 1 */ val LEFT: LEFT with scala.Double = js.native
  /* 2 */ val RIGHT: RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.HorizontalOrigin with scala.Double] = js.native
}

