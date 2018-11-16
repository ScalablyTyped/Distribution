package typings
package chromecastDashCafDashSenderLib.castNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CastContextEventType extends js.Object

@JSGlobal("cast.framework.CastContextEventType")
@js.native
object CastContextEventType extends js.Object {
  @js.native
  sealed trait CAST_STATE_CHANGED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.CastContextEventType
  
  @js.native
  sealed trait SESSION_STATE_CHANGED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.CastContextEventType
  
  /* "caststatechanged" */ val CAST_STATE_CHANGED: CAST_STATE_CHANGED with java.lang.String = js.native
  /* "sessionstatechanged" */ val SESSION_STATE_CHANGED: SESSION_STATE_CHANGED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    chromecastDashCafDashSenderLib.castNs.frameworkNs.CastContextEventType with java.lang.String
  ] = js.native
}

