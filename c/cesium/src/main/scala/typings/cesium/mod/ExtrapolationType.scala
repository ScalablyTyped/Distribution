package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtrapolationType extends StObject
@JSImport("cesium", "ExtrapolationType")
@js.native
object ExtrapolationType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtrapolationType with Double] = js.native
  
  @js.native
  sealed trait EXTRAPOLATE extends ExtrapolationType
  /* 2 */ val EXTRAPOLATE: typings.cesium.mod.ExtrapolationType.EXTRAPOLATE with Double = js.native
  
  @js.native
  sealed trait HOLD extends ExtrapolationType
  /* 1 */ val HOLD: typings.cesium.mod.ExtrapolationType.HOLD with Double = js.native
  
  @js.native
  sealed trait NONE extends ExtrapolationType
  /* 0 */ val NONE: typings.cesium.mod.ExtrapolationType.NONE with Double = js.native
}
