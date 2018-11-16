package typings
package chromeLib.chromeNs.castNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IdleReason extends js.Object

@JSGlobal("chrome.cast.media.IdleReason")
@js.native
object IdleReason extends js.Object {
  @js.native
  sealed trait CANCELLED
    extends chromeLib.chromeNs.castNs.mediaNs.IdleReason
  
  @js.native
  sealed trait ERROR
    extends chromeLib.chromeNs.castNs.mediaNs.IdleReason
  
  @js.native
  sealed trait FINISHED
    extends chromeLib.chromeNs.castNs.mediaNs.IdleReason
  
  @js.native
  sealed trait INTERRUPTED
    extends chromeLib.chromeNs.castNs.mediaNs.IdleReason
  
  /* "CANCELLED" */ val CANCELLED: CANCELLED with java.lang.String = js.native
  /* "ERROR" */ val ERROR: ERROR with java.lang.String = js.native
  /* "FINISHED" */ val FINISHED: FINISHED with java.lang.String = js.native
  /* "INTERRUPTED" */ val INTERRUPTED: INTERRUPTED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[chromeLib.chromeNs.castNs.mediaNs.IdleReason with java.lang.String] = js.native
}

