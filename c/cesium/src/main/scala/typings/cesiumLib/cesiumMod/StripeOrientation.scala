package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StripeOrientation extends js.Object

@JSImport("cesium", "StripeOrientation")
@js.native
object StripeOrientation extends js.Object {
  @js.native
  sealed trait HORIZONTAL
    extends cesiumLib.cesiumMod.StripeOrientation
  
  @js.native
  sealed trait VERTICAL
    extends cesiumLib.cesiumMod.StripeOrientation
  
  /* 0 */ val HORIZONTAL: HORIZONTAL with scala.Double = js.native
  /* 1 */ val VERTICAL: VERTICAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.StripeOrientation with scala.Double] = js.native
}

