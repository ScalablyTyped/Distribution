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
  
  /**
    * If the object contains text, the origin is at the baseline of the text, else the origin is at the bottom of the object.
    */
  @js.native
  sealed trait BASELINE
    extends StObject
       with VerticalOrigin
  /* 2 */ val BASELINE: typings.cesium.mod.VerticalOrigin.BASELINE & Double = js.native
  
  /**
    * The origin is at the bottom of the object.
    */
  @js.native
  sealed trait BOTTOM
    extends StObject
       with VerticalOrigin
  /* 1 */ val BOTTOM: typings.cesium.mod.VerticalOrigin.BOTTOM & Double = js.native
  
  /**
    * The origin is at the vertical center between <code>BASELINE</code> and <code>TOP</code>.
    */
  @js.native
  sealed trait CENTER
    extends StObject
       with VerticalOrigin
  /* 0 */ val CENTER: typings.cesium.mod.VerticalOrigin.CENTER & Double = js.native
  
  /**
    * The origin is at the top of the object.
    */
  @js.native
  sealed trait TOP
    extends StObject
       with VerticalOrigin
  /* -1 */ val TOP: typings.cesium.mod.VerticalOrigin.TOP & Double = js.native
}
