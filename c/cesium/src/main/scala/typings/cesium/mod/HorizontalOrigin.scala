package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HorizontalOrigin extends StObject
@JSImport("cesium", "HorizontalOrigin")
@js.native
object HorizontalOrigin extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HorizontalOrigin with Double] = js.native
  
  @js.native
  sealed trait CENTER extends HorizontalOrigin
  /* 0 */ val CENTER: typings.cesium.mod.HorizontalOrigin.CENTER with Double = js.native
  
  @js.native
  sealed trait LEFT extends HorizontalOrigin
  /* 1 */ val LEFT: typings.cesium.mod.HorizontalOrigin.LEFT with Double = js.native
  
  @js.native
  sealed trait RIGHT extends HorizontalOrigin
  /* 2 */ val RIGHT: typings.cesium.mod.HorizontalOrigin.RIGHT with Double = js.native
}
