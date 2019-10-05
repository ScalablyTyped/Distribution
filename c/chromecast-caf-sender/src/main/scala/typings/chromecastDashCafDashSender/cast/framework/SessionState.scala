package typings.chromecastDashCafDashSender.cast.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SessionState extends js.Object

@JSGlobal("cast.framework.SessionState")
@js.native
object SessionState extends js.Object {
  @js.native
  sealed trait NO_SESSION extends SessionState
  
  @js.native
  sealed trait SESSION_ENDED extends SessionState
  
  @js.native
  sealed trait SESSION_ENDING extends SessionState
  
  @js.native
  sealed trait SESSION_RESUMED extends SessionState
  
  @js.native
  sealed trait SESSION_STARTED extends SessionState
  
  @js.native
  sealed trait SESSION_STARTING extends SessionState
  
  @js.native
  sealed trait SESSION_START_FAILED extends SessionState
  
  /* "NO_SESSION" */ val NO_SESSION: typings.chromecastDashCafDashSender.cast.framework.SessionState.NO_SESSION with String = js.native
  /* "SESSION_ENDED" */ val SESSION_ENDED: typings.chromecastDashCafDashSender.cast.framework.SessionState.SESSION_ENDED with String = js.native
  /* "SESSION_ENDING" */ val SESSION_ENDING: typings.chromecastDashCafDashSender.cast.framework.SessionState.SESSION_ENDING with String = js.native
  /* "SESSION_RESUMED" */ val SESSION_RESUMED: typings.chromecastDashCafDashSender.cast.framework.SessionState.SESSION_RESUMED with String = js.native
  /* "SESSION_STARTED" */ val SESSION_STARTED: typings.chromecastDashCafDashSender.cast.framework.SessionState.SESSION_STARTED with String = js.native
  /* "SESSION_STARTING" */ val SESSION_STARTING: typings.chromecastDashCafDashSender.cast.framework.SessionState.SESSION_STARTING with String = js.native
  /* "SESSION_START_FAILED" */ val SESSION_START_FAILED: typings.chromecastDashCafDashSender.cast.framework.SessionState.SESSION_START_FAILED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SessionState with String] = js.native
}

