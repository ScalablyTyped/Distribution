package typings
package chromeLib.chromeNs.castNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StreamType extends js.Object

@JSGlobal("chrome.cast.media.StreamType")
@js.native
object StreamType extends js.Object {
  @js.native
  sealed trait BUFFERED
    extends chromeLib.chromeNs.castNs.mediaNs.StreamType
  
  @js.native
  sealed trait LIVE
    extends chromeLib.chromeNs.castNs.mediaNs.StreamType
  
  @js.native
  sealed trait OTHER
    extends chromeLib.chromeNs.castNs.mediaNs.StreamType
  
  /* "BUFFERED" */ val BUFFERED: BUFFERED with java.lang.String = js.native
  /* "LIVE" */ val LIVE: LIVE with java.lang.String = js.native
  /* "OTHER" */ val OTHER: OTHER with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[chromeLib.chromeNs.castNs.mediaNs.StreamType with java.lang.String] = js.native
}

