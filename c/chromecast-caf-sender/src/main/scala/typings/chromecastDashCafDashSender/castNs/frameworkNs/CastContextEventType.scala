package typings.chromecastDashCafDashSender.castNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CastContextEventType extends js.Object

@JSGlobal("cast.framework.CastContextEventType")
@js.native
object CastContextEventType extends js.Object {
  @js.native
  sealed trait CAST_STATE_CHANGED extends CastContextEventType
  
  @js.native
  sealed trait SESSION_STATE_CHANGED extends CastContextEventType
  
  /* "caststatechanged" */ val CAST_STATE_CHANGED: typings.chromecastDashCafDashSender.castNs.frameworkNs.CastContextEventType.CAST_STATE_CHANGED with String = js.native
  /* "sessionstatechanged" */ val SESSION_STATE_CHANGED: typings.chromecastDashCafDashSender.castNs.frameworkNs.CastContextEventType.SESSION_STATE_CHANGED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CastContextEventType with String] = js.native
}

