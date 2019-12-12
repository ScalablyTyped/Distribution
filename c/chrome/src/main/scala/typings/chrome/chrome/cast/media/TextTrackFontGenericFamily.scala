package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.TopLevel
import typings.chrome.chrome.cast.media.TextTrackFontGenericFamily.CASUAL
import typings.chrome.chrome.cast.media.TextTrackFontGenericFamily.CURSIVE
import typings.chrome.chrome.cast.media.TextTrackFontGenericFamily.MONOSPACED_SANS_SERIF
import typings.chrome.chrome.cast.media.TextTrackFontGenericFamily.MONOSPACED_SERIF
import typings.chrome.chrome.cast.media.TextTrackFontGenericFamily.SANS_SERIF
import typings.chrome.chrome.cast.media.TextTrackFontGenericFamily.SERIF
import typings.chrome.chrome.cast.media.TextTrackFontGenericFamily.SMALL_CAPITALS
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TextTrackFontGenericFamily with String] = js.native
  /* "CASUAL" */ @js.native
  object CASUAL extends TopLevel[CASUAL with String]
  
  /* "CURSIVE" */ @js.native
  object CURSIVE extends TopLevel[CURSIVE with String]
  
  /* "MONOSPACED_SANS_SERIF" */ @js.native
  object MONOSPACED_SANS_SERIF extends TopLevel[MONOSPACED_SANS_SERIF with String]
  
  /* "MONOSPACED_SERIF" */ @js.native
  object MONOSPACED_SERIF extends TopLevel[MONOSPACED_SERIF with String]
  
  /* "SANS_SERIF" */ @js.native
  object SANS_SERIF extends TopLevel[SANS_SERIF with String]
  
  /* "SERIF" */ @js.native
  object SERIF extends TopLevel[SERIF with String]
  
  /* "SMALL_CAPITALS" */ @js.native
  object SMALL_CAPITALS extends TopLevel[SMALL_CAPITALS with String]
  
}

