package typings
package chromeLib.chromeNs.castNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SessionStatus extends js.Object

@JSGlobal("chrome.cast.SessionStatus")
@js.native
object SessionStatus extends js.Object {
  @js.native
  sealed trait CONNECTED
    extends chromeLib.chromeNs.castNs.SessionStatus
  
  @js.native
  sealed trait DISCONNECTED
    extends chromeLib.chromeNs.castNs.SessionStatus
  
  @js.native
  sealed trait STOPPED
    extends chromeLib.chromeNs.castNs.SessionStatus
  
  /* "connected" */ val CONNECTED: CONNECTED with java.lang.String = js.native
  /* "disconnected" */ val DISCONNECTED: DISCONNECTED with java.lang.String = js.native
  /* "stopped" */ val STOPPED: STOPPED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[chromeLib.chromeNs.castNs.SessionStatus with java.lang.String] = js.native
}

