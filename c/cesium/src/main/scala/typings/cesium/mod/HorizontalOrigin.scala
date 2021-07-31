package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HorizontalOrigin extends StObject
@JSImport("cesium", "HorizontalOrigin")
@js.native
object HorizontalOrigin extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HorizontalOrigin & Double] = js.native
  
  @js.native
  sealed trait CENTER
    extends StObject
       with HorizontalOrigin
  /* 0 */ val CENTER: typings.cesium.mod.HorizontalOrigin.CENTER & Double = js.native
  
  @js.native
  sealed trait LEFT
    extends StObject
       with HorizontalOrigin
  /* 1 */ val LEFT: typings.cesium.mod.HorizontalOrigin.LEFT & Double = js.native
  
  @js.native
  sealed trait RIGHT
    extends StObject
       with HorizontalOrigin
  /* 2 */ val RIGHT: typings.cesium.mod.HorizontalOrigin.RIGHT & Double = js.native
}
