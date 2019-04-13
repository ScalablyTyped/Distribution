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
  
  val CENTER: CENTER with java.lang.String = js.native
  val LEFT: LEFT with java.lang.String = js.native
  val RIGHT: RIGHT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.HorizontalOrigin with java.lang.String] = js.native
}

