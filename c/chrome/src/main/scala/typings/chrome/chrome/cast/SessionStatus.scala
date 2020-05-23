package typings.chrome.chrome.cast

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
  
}

