package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StripeOrientation extends js.Object
@JSImport("cesium", "StripeOrientation")
@js.native
object StripeOrientation extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StripeOrientation with Double] = js.native
  
  @js.native
  sealed trait HORIZONTAL extends StripeOrientation
  /* 0 */ @js.native
  object HORIZONTAL extends TopLevel[HORIZONTAL with Double]
  
  @js.native
  sealed trait VERTICAL extends StripeOrientation
  /* 1 */ @js.native
  object VERTICAL extends TopLevel[VERTICAL with Double]
}
