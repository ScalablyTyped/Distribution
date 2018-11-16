package typings
package chromeLib.chromeNs.castNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextTrackFontGenericFamily extends js.Object

@JSGlobal("chrome.cast.media.TextTrackFontGenericFamily")
@js.native
object TextTrackFontGenericFamily extends js.Object {
  @js.native
  sealed trait CASUAL
    extends chromeLib.chromeNs.castNs.mediaNs.TextTrackFontGenericFamily
  
  @js.native
  sealed trait CURSIVE
    extends chromeLib.chromeNs.castNs.mediaNs.TextTrackFontGenericFamily
  
  @js.native
  sealed trait MONOSPACED_SANS_SERIF
    extends chromeLib.chromeNs.castNs.mediaNs.TextTrackFontGenericFamily
  
  @js.native
  sealed trait MONOSPACED_SERIF
    extends chromeLib.chromeNs.castNs.mediaNs.TextTrackFontGenericFamily
  
  @js.native
  sealed trait SANS_SERIF
    extends chromeLib.chromeNs.castNs.mediaNs.TextTrackFontGenericFamily
  
  @js.native
  sealed trait SERIF
    extends chromeLib.chromeNs.castNs.mediaNs.TextTrackFontGenericFamily
  
  @js.native
  sealed trait SMALL_CAPITALS
    extends chromeLib.chromeNs.castNs.mediaNs.TextTrackFontGenericFamily
  
  /* "CASUAL" */ val CASUAL: CASUAL with java.lang.String = js.native
  /* "CURSIVE" */ val CURSIVE: CURSIVE with java.lang.String = js.native
  /* "MONOSPACED_SANS_SERIF" */ val MONOSPACED_SANS_SERIF: MONOSPACED_SANS_SERIF with java.lang.String = js.native
  /* "MONOSPACED_SERIF" */ val MONOSPACED_SERIF: MONOSPACED_SERIF with java.lang.String = js.native
  /* "SANS_SERIF" */ val SANS_SERIF: SANS_SERIF with java.lang.String = js.native
  /* "SERIF" */ val SERIF: SERIF with java.lang.String = js.native
  /* "SMALL_CAPITALS" */ val SMALL_CAPITALS: SMALL_CAPITALS with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    chromeLib.chromeNs.castNs.mediaNs.TextTrackFontGenericFamily with java.lang.String
  ] = js.native
}

