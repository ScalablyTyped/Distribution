package typings.chromecastDashCafDashSender.cast.framework

import org.scalablytyped.runtime.TopLevel
import typings.chromecastDashCafDashSender.cast.framework.SessionState.NO_SESSION
import typings.chromecastDashCafDashSender.cast.framework.SessionState.SESSION_ENDED
import typings.chromecastDashCafDashSender.cast.framework.SessionState.SESSION_ENDING
import typings.chromecastDashCafDashSender.cast.framework.SessionState.SESSION_RESUMED
import typings.chromecastDashCafDashSender.cast.framework.SessionState.SESSION_STARTED
import typings.chromecastDashCafDashSender.cast.framework.SessionState.SESSION_STARTING
import typings.chromecastDashCafDashSender.cast.framework.SessionState.SESSION_START_FAILED
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SessionState with String] = js.native
  /* "NO_SESSION" */ @js.native
  object NO_SESSION extends TopLevel[NO_SESSION with String]
  
  /* "SESSION_ENDED" */ @js.native
  object SESSION_ENDED extends TopLevel[SESSION_ENDED with String]
  
  /* "SESSION_ENDING" */ @js.native
  object SESSION_ENDING extends TopLevel[SESSION_ENDING with String]
  
  /* "SESSION_RESUMED" */ @js.native
  object SESSION_RESUMED extends TopLevel[SESSION_RESUMED with String]
  
  /* "SESSION_STARTED" */ @js.native
  object SESSION_STARTED extends TopLevel[SESSION_STARTED with String]
  
  /* "SESSION_STARTING" */ @js.native
  object SESSION_STARTING extends TopLevel[SESSION_STARTING with String]
  
  /* "SESSION_START_FAILED" */ @js.native
  object SESSION_START_FAILED extends TopLevel[SESSION_START_FAILED with String]
  
}

