package typings
package chromeLib.chromeNs.castNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReceiverAvailability extends js.Object

@JSGlobal("chrome.cast.ReceiverAvailability")
@js.native
object ReceiverAvailability extends js.Object {
  @js.native
  sealed trait AVAILABLE
    extends chromeLib.chromeNs.castNs.ReceiverAvailability
  
  @js.native
  sealed trait UNAVAILABLE
    extends chromeLib.chromeNs.castNs.ReceiverAvailability
  
  /* "available" */ val AVAILABLE: AVAILABLE with java.lang.String = js.native
  /* "unavailable" */ val UNAVAILABLE: UNAVAILABLE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[chromeLib.chromeNs.castNs.ReceiverAvailability with java.lang.String] = js.native
}

