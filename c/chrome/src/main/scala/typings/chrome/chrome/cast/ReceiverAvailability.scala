package typings.chrome.chrome.cast

import org.scalablytyped.runtime.TopLevel
import typings.chrome.chrome.cast.ReceiverAvailability.AVAILABLE
import typings.chrome.chrome.cast.ReceiverAvailability.UNAVAILABLE
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ReceiverAvailability with String] = js.native
  /* "available" */ @js.native
  object AVAILABLE extends TopLevel[AVAILABLE with String]
  
  /* "unavailable" */ @js.native
  object UNAVAILABLE extends TopLevel[UNAVAILABLE with String]
  
}

