package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtrapolationType extends StObject
@JSImport("cesium", "ExtrapolationType")
@js.native
object ExtrapolationType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtrapolationType & Double] = js.native
  
  @js.native
  sealed trait EXTRAPOLATE
    extends StObject
       with ExtrapolationType
  /* 2 */ val EXTRAPOLATE: typings.cesium.mod.ExtrapolationType.EXTRAPOLATE & Double = js.native
  
  @js.native
  sealed trait HOLD
    extends StObject
       with ExtrapolationType
  /* 1 */ val HOLD: typings.cesium.mod.ExtrapolationType.HOLD & Double = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with ExtrapolationType
  /* 0 */ val NONE: typings.cesium.mod.ExtrapolationType.NONE & Double = js.native
}
