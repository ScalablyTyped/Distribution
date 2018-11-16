package typings
package chromeLib.chromeNs.castNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextTrackFontStyle extends js.Object

@JSGlobal("chrome.cast.media.TextTrackFontStyle")
@js.native
object TextTrackFontStyle extends js.Object {
  @js.native
  sealed trait BOLD
    extends chromeLib.chromeNs.castNs.mediaNs.TextTrackFontStyle
  
  @js.native
  sealed trait BOLD_ITALIC
    extends chromeLib.chromeNs.castNs.mediaNs.TextTrackFontStyle
  
  @js.native
  sealed trait ITALIC
    extends chromeLib.chromeNs.castNs.mediaNs.TextTrackFontStyle
  
  @js.native
  sealed trait NORMAL
    extends chromeLib.chromeNs.castNs.mediaNs.TextTrackFontStyle
  
  /* "BOLD" */ val BOLD: BOLD with java.lang.String = js.native
  /* "BOLD_ITALIC" */ val BOLD_ITALIC: BOLD_ITALIC with java.lang.String = js.native
  /* "ITALIC" */ val ITALIC: ITALIC with java.lang.String = js.native
  /* "NORMAL" */ val NORMAL: NORMAL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[chromeLib.chromeNs.castNs.mediaNs.TextTrackFontStyle with java.lang.String] = js.native
}

