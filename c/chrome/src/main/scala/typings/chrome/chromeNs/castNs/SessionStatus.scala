package typings.chrome.chromeNs.castNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SessionStatus extends js.Object

@JSGlobal("chrome.cast.SessionStatus")
@js.native
object SessionStatus extends js.Object {
  @js.native
  sealed trait CONNECTED extends SessionStatus
  
  @js.native
  sealed trait DISCONNECTED extends SessionStatus
  
  @js.native
  sealed trait STOPPED extends SessionStatus
  
  /* "connected" */ val CONNECTED: typings.chrome.chromeNs.castNs.SessionStatus.CONNECTED with String = js.native
  /* "disconnected" */ val DISCONNECTED: typings.chrome.chromeNs.castNs.SessionStatus.DISCONNECTED with String = js.native
  /* "stopped" */ val STOPPED: typings.chrome.chromeNs.castNs.SessionStatus.STOPPED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SessionStatus with String] = js.native
}

