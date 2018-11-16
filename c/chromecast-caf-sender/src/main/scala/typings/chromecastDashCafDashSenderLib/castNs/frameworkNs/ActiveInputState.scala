package typings
package chromecastDashCafDashSenderLib.castNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActiveInputState extends js.Object

@JSGlobal("cast.framework.ActiveInputState")
@js.native
object ActiveInputState extends js.Object {
  @js.native
  sealed trait ACTIVE_INPUT_STATE_NO
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.ActiveInputState
  
  @js.native
  sealed trait ACTIVE_INPUT_STATE_UNKNOWN
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.ActiveInputState
  
  @js.native
  sealed trait ACTIVE_INPUT_STATE_YES
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.ActiveInputState
  
  /* 0 */ val ACTIVE_INPUT_STATE_NO: ACTIVE_INPUT_STATE_NO with scala.Double = js.native
  /* -1 */ val ACTIVE_INPUT_STATE_UNKNOWN: ACTIVE_INPUT_STATE_UNKNOWN with scala.Double = js.native
  /* 1 */ val ACTIVE_INPUT_STATE_YES: ACTIVE_INPUT_STATE_YES with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    chromecastDashCafDashSenderLib.castNs.frameworkNs.ActiveInputState with scala.Double
  ] = js.native
}

