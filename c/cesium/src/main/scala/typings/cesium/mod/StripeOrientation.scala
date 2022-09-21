package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StripeOrientation extends StObject
@JSImport("cesium", "StripeOrientation")
@js.native
object StripeOrientation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StripeOrientation & Double] = js.native
  
  /**
    * Horizontal orientation.
    */
  @js.native
  sealed trait HORIZONTAL
    extends StObject
       with StripeOrientation
  /* 0 */ val HORIZONTAL: typings.cesium.mod.StripeOrientation.HORIZONTAL & Double = js.native
  
  /**
    * Vertical orientation.
    */
  @js.native
  sealed trait VERTICAL
    extends StObject
       with StripeOrientation
  /* 1 */ val VERTICAL: typings.cesium.mod.StripeOrientation.VERTICAL & Double = js.native
}
