package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VerticalOrigin extends StObject
@JSImport("cesium", "VerticalOrigin")
@js.native
object VerticalOrigin extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VerticalOrigin with Double] = js.native
  
  @js.native
  sealed trait BOTTOM extends VerticalOrigin
  /* 1 */ val BOTTOM: typings.cesium.mod.VerticalOrigin.BOTTOM with Double = js.native
  
  @js.native
  sealed trait CENTER extends VerticalOrigin
  /* 0 */ val CENTER: typings.cesium.mod.VerticalOrigin.CENTER with Double = js.native
  
  @js.native
  sealed trait TOP extends VerticalOrigin
  /* 2 */ val TOP: typings.cesium.mod.VerticalOrigin.TOP with Double = js.native
}
