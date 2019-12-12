package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.TopLevel
import typings.chrome.chrome.cast.media.IdleReason.CANCELLED
import typings.chrome.chrome.cast.media.IdleReason.ERROR
import typings.chrome.chrome.cast.media.IdleReason.FINISHED
import typings.chrome.chrome.cast.media.IdleReason.INTERRUPTED
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[IdleReason with String] = js.native
  /* "CANCELLED" */ @js.native
  object CANCELLED extends TopLevel[CANCELLED with String]
  
  /* "ERROR" */ @js.native
  object ERROR extends TopLevel[ERROR with String]
  
  /* "FINISHED" */ @js.native
  object FINISHED extends TopLevel[FINISHED with String]
  
  /* "INTERRUPTED" */ @js.native
  object INTERRUPTED extends TopLevel[INTERRUPTED with String]
  
}

