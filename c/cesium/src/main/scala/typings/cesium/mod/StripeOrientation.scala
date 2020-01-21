package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StripeOrientation with Double] = js.native
  /* 0 */ @js.native
  object HORIZONTAL extends TopLevel[HORIZONTAL with Double]
  
  /* 1 */ @js.native
  object VERTICAL extends TopLevel[VERTICAL with Double]
  
}

