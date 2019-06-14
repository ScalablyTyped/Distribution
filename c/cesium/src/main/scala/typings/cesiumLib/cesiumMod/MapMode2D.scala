package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MapMode2D extends js.Object

@JSImport("cesium", "MapMode2D")
@js.native
object MapMode2D extends js.Object {
  @js.native
  sealed trait INFINITE_SCROLL
    extends cesiumLib.cesiumMod.MapMode2D
  
  @js.native
  sealed trait ROTATE
    extends cesiumLib.cesiumMod.MapMode2D
  
  /* 0 */ val INFINITE_SCROLL: INFINITE_SCROLL with scala.Double = js.native
  /* 1 */ val ROTATE: ROTATE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.MapMode2D with scala.Double] = js.native
}

