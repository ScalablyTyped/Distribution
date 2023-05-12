package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HorizontalOrigin extends StObject
@JSImport("@cesium/engine", "HorizontalOrigin")
@js.native
object HorizontalOrigin extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HorizontalOrigin & Double] = js.native
  
  /**
    * The origin is at the horizontal center of the object.
    */
  @js.native
  sealed trait CENTER
    extends StObject
       with HorizontalOrigin
  /* 0 */ val CENTER: typings.cesiumEngine.mod.HorizontalOrigin.CENTER & Double = js.native
  
  /**
    * The origin is on the left side of the object.
    */
  @js.native
  sealed trait LEFT
    extends StObject
       with HorizontalOrigin
  /* 1 */ val LEFT: typings.cesiumEngine.mod.HorizontalOrigin.LEFT & Double = js.native
  
  /**
    * The origin is on the right side of the object.
    */
  @js.native
  sealed trait RIGHT
    extends StObject
       with HorizontalOrigin
  /* -1 */ val RIGHT: typings.cesiumEngine.mod.HorizontalOrigin.RIGHT & Double = js.native
}
