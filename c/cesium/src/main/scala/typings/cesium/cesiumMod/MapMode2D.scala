package typings.cesium.cesiumMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MapMode2D with Double] = js.native
  /* 0 */ @js.native
  object INFINITE_SCROLL extends TopLevel[INFINITE_SCROLL with Double]
  
  /* 1 */ @js.native
  object ROTATE extends TopLevel[ROTATE with Double]
  
}

