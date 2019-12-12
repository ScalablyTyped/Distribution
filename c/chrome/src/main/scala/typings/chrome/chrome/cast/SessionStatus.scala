package typings.chrome.chrome.cast

import org.scalablytyped.runtime.TopLevel
import typings.chrome.chrome.cast.SessionStatus.CONNECTED
import typings.chrome.chrome.cast.SessionStatus.DISCONNECTED
import typings.chrome.chrome.cast.SessionStatus.STOPPED
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SessionStatus with String] = js.native
  /* "connected" */ @js.native
  object CONNECTED extends TopLevel[CONNECTED with String]
  
  /* "disconnected" */ @js.native
  object DISCONNECTED extends TopLevel[DISCONNECTED with String]
  
  /* "stopped" */ @js.native
  object STOPPED extends TopLevel[STOPPED with String]
  
}

