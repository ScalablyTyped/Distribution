package typings.chrome.global.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.cast.media.IdleReason")
@js.native
object IdleReason extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.media.IdleReason with String] = js.native
  
  /* "CANCELLED" */ val CANCELLED: typings.chrome.chrome.cast.media.IdleReason.CANCELLED with String = js.native
  
  /* "ERROR" */ val ERROR: typings.chrome.chrome.cast.media.IdleReason.ERROR with String = js.native
  
  /* "FINISHED" */ val FINISHED: typings.chrome.chrome.cast.media.IdleReason.FINISHED with String = js.native
  
  /* "INTERRUPTED" */ val INTERRUPTED: typings.chrome.chrome.cast.media.IdleReason.INTERRUPTED with String = js.native
}
