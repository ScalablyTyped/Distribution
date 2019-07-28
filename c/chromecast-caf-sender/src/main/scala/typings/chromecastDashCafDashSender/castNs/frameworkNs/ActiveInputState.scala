package typings.chromecastDashCafDashSender.castNs.frameworkNs

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
  
  /* 0 */ val ACTIVE_INPUT_STATE_NO: typings.chromecastDashCafDashSender.castNs.frameworkNs.ActiveInputState.ACTIVE_INPUT_STATE_NO with Double = js.native
  /* -1 */ val ACTIVE_INPUT_STATE_UNKNOWN: typings.chromecastDashCafDashSender.castNs.frameworkNs.ActiveInputState.ACTIVE_INPUT_STATE_UNKNOWN with Double = js.native
  /* 1 */ val ACTIVE_INPUT_STATE_YES: typings.chromecastDashCafDashSender.castNs.frameworkNs.ActiveInputState.ACTIVE_INPUT_STATE_YES with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ActiveInputState with Double] = js.native
}

