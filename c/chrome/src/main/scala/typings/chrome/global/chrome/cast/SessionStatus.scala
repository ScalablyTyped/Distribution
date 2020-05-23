package typings.chrome.global.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.SessionStatus")
@js.native
object SessionStatus extends js.Object {
  /* "connected" */ val CONNECTED: typings.chrome.chrome.cast.SessionStatus.CONNECTED with String = js.native
  /* "disconnected" */ val DISCONNECTED: typings.chrome.chrome.cast.SessionStatus.DISCONNECTED with String = js.native
  /* "stopped" */ val STOPPED: typings.chrome.chrome.cast.SessionStatus.STOPPED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.SessionStatus with String] = js.native
}

