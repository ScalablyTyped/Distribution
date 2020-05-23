package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IdleReason extends js.Object

@JSGlobal("chrome.cast.media.IdleReason")
@js.native
object IdleReason extends js.Object {
  @js.native
  sealed trait CANCELLED extends IdleReason
  
  @js.native
  sealed trait ERROR extends IdleReason
  
  @js.native
  sealed trait FINISHED extends IdleReason
  
  @js.native
  sealed trait INTERRUPTED extends IdleReason
  
}

