package typings.chrome.chromeNs.castNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextTrackFontGenericFamily extends js.Object

@JSGlobal("chrome.cast.media.TextTrackFontGenericFamily")
@js.native
object TextTrackFontGenericFamily extends js.Object {
  @js.native
  sealed trait CASUAL extends TextTrackFontGenericFamily
  
  @js.native
  sealed trait CURSIVE extends TextTrackFontGenericFamily
  
  @js.native
  sealed trait MONOSPACED_SANS_SERIF extends TextTrackFontGenericFamily
  
  @js.native
  sealed trait MONOSPACED_SERIF extends TextTrackFontGenericFamily
  
  @js.native
  sealed trait SANS_SERIF extends TextTrackFontGenericFamily
  
  @js.native
  sealed trait SERIF extends TextTrackFontGenericFamily
  
  @js.native
  sealed trait SMALL_CAPITALS extends TextTrackFontGenericFamily
  
  /* "CASUAL" */ val CASUAL: typings.chrome.chromeNs.castNs.mediaNs.TextTrackFontGenericFamily.CASUAL with String = js.native
  /* "CURSIVE" */ val CURSIVE: typings.chrome.chromeNs.castNs.mediaNs.TextTrackFontGenericFamily.CURSIVE with String = js.native
  /* "MONOSPACED_SANS_SERIF" */ val MONOSPACED_SANS_SERIF: typings.chrome.chromeNs.castNs.mediaNs.TextTrackFontGenericFamily.MONOSPACED_SANS_SERIF with String = js.native
  /* "MONOSPACED_SERIF" */ val MONOSPACED_SERIF: typings.chrome.chromeNs.castNs.mediaNs.TextTrackFontGenericFamily.MONOSPACED_SERIF with String = js.native
  /* "SANS_SERIF" */ val SANS_SERIF: typings.chrome.chromeNs.castNs.mediaNs.TextTrackFontGenericFamily.SANS_SERIF with String = js.native
  /* "SERIF" */ val SERIF: typings.chrome.chromeNs.castNs.mediaNs.TextTrackFontGenericFamily.SERIF with String = js.native
  /* "SMALL_CAPITALS" */ val SMALL_CAPITALS: typings.chrome.chromeNs.castNs.mediaNs.TextTrackFontGenericFamily.SMALL_CAPITALS with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TextTrackFontGenericFamily with String] = js.native
}

