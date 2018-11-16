package typings
package chromeLib.chromeNs.castNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReceiverAction extends js.Object

@JSGlobal("chrome.cast.ReceiverAction")
@js.native
object ReceiverAction extends js.Object {
  @js.native
  sealed trait CAST
    extends chromeLib.chromeNs.castNs.ReceiverAction
  
  @js.native
  sealed trait STOP
    extends chromeLib.chromeNs.castNs.ReceiverAction
  
  /* "cast" */ val CAST: CAST with java.lang.String = js.native
  /* "stop" */ val STOP: STOP with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[chromeLib.chromeNs.castNs.ReceiverAction with java.lang.String] = js.native
}

