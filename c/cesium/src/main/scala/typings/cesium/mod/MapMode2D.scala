package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MapMode2D extends StObject
@JSImport("cesium", "MapMode2D")
@js.native
object MapMode2D extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MapMode2D with Double] = js.native
  
  @js.native
  sealed trait INFINITE_SCROLL extends MapMode2D
  /* 0 */ val INFINITE_SCROLL: typings.cesium.mod.MapMode2D.INFINITE_SCROLL with Double = js.native
  
  @js.native
  sealed trait ROTATE extends MapMode2D
  /* 1 */ val ROTATE: typings.cesium.mod.MapMode2D.ROTATE with Double = js.native
}
