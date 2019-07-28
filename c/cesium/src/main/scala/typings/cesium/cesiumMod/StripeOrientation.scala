package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StripeOrientation extends js.Object

@JSImport("cesium", "StripeOrientation")
@js.native
object StripeOrientation extends js.Object {
  @js.native
  sealed trait HORIZONTAL extends StripeOrientation
  
  @js.native
  sealed trait VERTICAL extends StripeOrientation
  
  /* 0 */ val HORIZONTAL: typings.cesium.cesiumMod.StripeOrientation.HORIZONTAL with Double = js.native
  /* 1 */ val VERTICAL: typings.cesium.cesiumMod.StripeOrientation.VERTICAL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StripeOrientation with Double] = js.native
}

