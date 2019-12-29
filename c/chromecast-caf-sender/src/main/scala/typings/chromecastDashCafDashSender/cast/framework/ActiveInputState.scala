package typings.chromecastDashCafDashSender.cast.framework

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActiveInputState extends js.Object

@JSGlobal("cast.framework.ActiveInputState")
@js.native
object ActiveInputState extends js.Object {
  @js.native
  sealed trait ACTIVE_INPUT_STATE_NO extends ActiveInputState
  
  @js.native
  sealed trait ACTIVE_INPUT_STATE_UNKNOWN extends ActiveInputState
  
  @js.native
  sealed trait ACTIVE_INPUT_STATE_YES extends ActiveInputState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ActiveInputState with Double] = js.native
  /* 0 */ @js.native
  object ACTIVE_INPUT_STATE_NO extends TopLevel[ACTIVE_INPUT_STATE_NO with Double]
  
  /* -1 */ @js.native
  object ACTIVE_INPUT_STATE_UNKNOWN extends TopLevel[ACTIVE_INPUT_STATE_UNKNOWN with Double]
  
  /* 1 */ @js.native
  object ACTIVE_INPUT_STATE_YES extends TopLevel[ACTIVE_INPUT_STATE_YES with Double]
  
}

