package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtrapolationType with Double] = js.native
  /* 2 */ @js.native
  object EXTRAPOLATE extends TopLevel[EXTRAPOLATE with Double]
  
  /* 1 */ @js.native
  object HOLD extends TopLevel[HOLD with Double]
  
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
}

