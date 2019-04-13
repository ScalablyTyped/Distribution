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
  
  val HORIZONTAL: HORIZONTAL with java.lang.String = js.native
  val VERTICAL: VERTICAL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.StripeOrientation with java.lang.String] = js.native
}

