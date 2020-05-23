package typings.chrome.chrome.cast

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
  
}

