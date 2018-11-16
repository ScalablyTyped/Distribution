package typings
package chromecastDashCafDashSenderLib.castNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SessionState extends js.Object

@JSGlobal("cast.framework.SessionState")
@js.native
object SessionState extends js.Object {
  @js.native
  sealed trait NO_SESSION
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.SessionState
  
  @js.native
  sealed trait SESSION_ENDED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.SessionState
  
  @js.native
  sealed trait SESSION_ENDING
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.SessionState
  
  @js.native
  sealed trait SESSION_RESUMED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.SessionState
  
  @js.native
  sealed trait SESSION_STARTED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.SessionState
  
  @js.native
  sealed trait SESSION_STARTING
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.SessionState
  
  @js.native
  sealed trait SESSION_START_FAILED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.SessionState
  
  /* "NO_SESSION" */ val NO_SESSION: NO_SESSION with java.lang.String = js.native
  /* "SESSION_ENDED" */ val SESSION_ENDED: SESSION_ENDED with java.lang.String = js.native
  /* "SESSION_ENDING" */ val SESSION_ENDING: SESSION_ENDING with java.lang.String = js.native
  /* "SESSION_RESUMED" */ val SESSION_RESUMED: SESSION_RESUMED with java.lang.String = js.native
  /* "SESSION_STARTED" */ val SESSION_STARTED: SESSION_STARTED with java.lang.String = js.native
  /* "SESSION_STARTING" */ val SESSION_STARTING: SESSION_STARTING with java.lang.String = js.native
  /* "SESSION_START_FAILED" */ val SESSION_START_FAILED: SESSION_START_FAILED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    chromecastDashCafDashSenderLib.castNs.frameworkNs.SessionState with java.lang.String
  ] = js.native
}

