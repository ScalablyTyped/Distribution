package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtrapolationType extends js.Object

@JSImport("cesium", "ExtrapolationType")
@js.native
object ExtrapolationType extends js.Object {
  @js.native
  sealed trait EXTRAPOLATE
    extends cesiumLib.cesiumMod.ExtrapolationType
  
  @js.native
  sealed trait HOLD
    extends cesiumLib.cesiumMod.ExtrapolationType
  
  @js.native
  sealed trait NONE
    extends cesiumLib.cesiumMod.ExtrapolationType
  
  /* 2 */ val EXTRAPOLATE: EXTRAPOLATE with scala.Double = js.native
  /* 1 */ val HOLD: HOLD with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.ExtrapolationType with scala.Double] = js.native
}

