package typings.chrome.chromeNs.castNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReceiverAvailability extends js.Object

@JSGlobal("chrome.cast.ReceiverAvailability")
@js.native
object ReceiverAvailability extends js.Object {
  @js.native
  sealed trait AVAILABLE extends ReceiverAvailability
  
  @js.native
  sealed trait UNAVAILABLE extends ReceiverAvailability
  
  /* "available" */ val AVAILABLE: typings.chrome.chromeNs.castNs.ReceiverAvailability.AVAILABLE with String = js.native
  /* "unavailable" */ val UNAVAILABLE: typings.chrome.chromeNs.castNs.ReceiverAvailability.UNAVAILABLE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ReceiverAvailability with String] = js.native
}

