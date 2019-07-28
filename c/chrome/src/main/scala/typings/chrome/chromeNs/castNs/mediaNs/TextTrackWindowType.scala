package typings.chrome.chromeNs.castNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextTrackWindowType extends js.Object

@JSGlobal("chrome.cast.media.TextTrackWindowType")
@js.native
object TextTrackWindowType extends js.Object {
  @js.native
  sealed trait NONE extends TextTrackWindowType
  
  @js.native
  sealed trait NORMAL extends TextTrackWindowType
  
  @js.native
  sealed trait ROUNDED_CORNERS extends TextTrackWindowType
  
  /* "NONE" */ val NONE: typings.chrome.chromeNs.castNs.mediaNs.TextTrackWindowType.NONE with String = js.native
  /* "NORMAL" */ val NORMAL: typings.chrome.chromeNs.castNs.mediaNs.TextTrackWindowType.NORMAL with String = js.native
  /* "ROUNDED_CORNERS" */ val ROUNDED_CORNERS: typings.chrome.chromeNs.castNs.mediaNs.TextTrackWindowType.ROUNDED_CORNERS with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TextTrackWindowType with String] = js.native
}

