package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MapMode2D extends js.Object

@JSImport("cesium", "MapMode2D")
@js.native
object MapMode2D extends js.Object {
  @js.native
  sealed trait INFINITE_SCROLL extends MapMode2D
  
  @js.native
  sealed trait ROTATE extends MapMode2D
  
  /* 0 */ val INFINITE_SCROLL: typings.cesium.cesiumMod.MapMode2D.INFINITE_SCROLL with Double = js.native
  /* 1 */ val ROTATE: typings.cesium.cesiumMod.MapMode2D.ROTATE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MapMode2D with Double] = js.native
}

