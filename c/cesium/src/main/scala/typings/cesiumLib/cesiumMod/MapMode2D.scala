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
  
  val INFINITE_SCROLL: INFINITE_SCROLL with java.lang.String = js.native
  val ROTATE: ROTATE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.MapMode2D with java.lang.String] = js.native
}

