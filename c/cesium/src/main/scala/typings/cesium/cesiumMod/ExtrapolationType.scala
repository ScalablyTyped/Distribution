package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtrapolationType extends js.Object

@JSImport("cesium", "ExtrapolationType")
@js.native
object ExtrapolationType extends js.Object {
  @js.native
  sealed trait EXTRAPOLATE extends ExtrapolationType
  
  @js.native
  sealed trait HOLD extends ExtrapolationType
  
  @js.native
  sealed trait NONE extends ExtrapolationType
  
  /* 2 */ val EXTRAPOLATE: typings.cesium.cesiumMod.ExtrapolationType.EXTRAPOLATE with Double = js.native
  /* 1 */ val HOLD: typings.cesium.cesiumMod.ExtrapolationType.HOLD with Double = js.native
  /* 0 */ val NONE: typings.cesium.cesiumMod.ExtrapolationType.NONE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtrapolationType with Double] = js.native
}

