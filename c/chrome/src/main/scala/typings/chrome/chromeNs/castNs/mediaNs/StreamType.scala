package typings.chrome.chromeNs.castNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StreamType extends js.Object

@JSGlobal("chrome.cast.media.StreamType")
@js.native
object StreamType extends js.Object {
  @js.native
  sealed trait BUFFERED extends StreamType
  
  @js.native
  sealed trait LIVE extends StreamType
  
  @js.native
  sealed trait OTHER extends StreamType
  
  /* "BUFFERED" */ val BUFFERED: typings.chrome.chromeNs.castNs.mediaNs.StreamType.BUFFERED with String = js.native
  /* "LIVE" */ val LIVE: typings.chrome.chromeNs.castNs.mediaNs.StreamType.LIVE with String = js.native
  /* "OTHER" */ val OTHER: typings.chrome.chromeNs.castNs.mediaNs.StreamType.OTHER with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StreamType with String] = js.native
}

