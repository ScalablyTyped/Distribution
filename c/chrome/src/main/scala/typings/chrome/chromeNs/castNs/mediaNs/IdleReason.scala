package typings.chrome.chromeNs.castNs.mediaNs

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
  
  /* "CANCELLED" */ val CANCELLED: typings.chrome.chromeNs.castNs.mediaNs.IdleReason.CANCELLED with String = js.native
  /* "ERROR" */ val ERROR: typings.chrome.chromeNs.castNs.mediaNs.IdleReason.ERROR with String = js.native
  /* "FINISHED" */ val FINISHED: typings.chrome.chromeNs.castNs.mediaNs.IdleReason.FINISHED with String = js.native
  /* "INTERRUPTED" */ val INTERRUPTED: typings.chrome.chromeNs.castNs.mediaNs.IdleReason.INTERRUPTED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[IdleReason with String] = js.native
}

