package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MapMode2D extends js.Object
@JSImport("cesium", "MapMode2D")
@js.native
object MapMode2D extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MapMode2D with Double] = js.native
  
  @js.native
  sealed trait INFINITE_SCROLL extends MapMode2D
  /* 0 */ @js.native
  object INFINITE_SCROLL extends TopLevel[INFINITE_SCROLL with Double]
  
  @js.native
  sealed trait ROTATE extends MapMode2D
  /* 1 */ @js.native
  object ROTATE extends TopLevel[ROTATE with Double]
}
