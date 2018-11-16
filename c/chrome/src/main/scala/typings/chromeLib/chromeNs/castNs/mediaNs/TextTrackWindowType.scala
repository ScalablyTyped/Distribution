package typings
package chromeLib.chromeNs.castNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextTrackWindowType extends js.Object

@JSGlobal("chrome.cast.media.TextTrackWindowType")
@js.native
object TextTrackWindowType extends js.Object {
  @js.native
  sealed trait NONE
    extends chromeLib.chromeNs.castNs.mediaNs.TextTrackWindowType
  
  @js.native
  sealed trait NORMAL
    extends chromeLib.chromeNs.castNs.mediaNs.TextTrackWindowType
  
  @js.native
  sealed trait ROUNDED_CORNERS
    extends chromeLib.chromeNs.castNs.mediaNs.TextTrackWindowType
  
  /* "NONE" */ val NONE: NONE with java.lang.String = js.native
  /* "NORMAL" */ val NORMAL: NORMAL with java.lang.String = js.native
  /* "ROUNDED_CORNERS" */ val ROUNDED_CORNERS: ROUNDED_CORNERS with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[chromeLib.chromeNs.castNs.mediaNs.TextTrackWindowType with java.lang.String] = js.native
}

