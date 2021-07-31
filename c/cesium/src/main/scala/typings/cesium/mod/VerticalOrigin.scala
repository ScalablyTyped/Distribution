package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VerticalOrigin extends StObject
@JSImport("cesium", "VerticalOrigin")
@js.native
object VerticalOrigin extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VerticalOrigin & Double] = js.native
  
  @js.native
  sealed trait BOTTOM
    extends StObject
       with VerticalOrigin
  /* 1 */ val BOTTOM: typings.cesium.mod.VerticalOrigin.BOTTOM & Double = js.native
  
  @js.native
  sealed trait CENTER
    extends StObject
       with VerticalOrigin
  /* 0 */ val CENTER: typings.cesium.mod.VerticalOrigin.CENTER & Double = js.native
  
  @js.native
  sealed trait TOP
    extends StObject
       with VerticalOrigin
  /* 2 */ val TOP: typings.cesium.mod.VerticalOrigin.TOP & Double = js.native
}
