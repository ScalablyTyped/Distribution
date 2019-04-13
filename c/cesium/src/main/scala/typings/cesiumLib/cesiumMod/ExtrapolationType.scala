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
  
  val EXTRAPOLATE: EXTRAPOLATE with java.lang.String = js.native
  val HOLD: HOLD with java.lang.String = js.native
  val NONE: NONE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.ExtrapolationType with java.lang.String] = js.native
}

