package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextTrackFontStyle extends js.Object

@JSGlobal("chrome.cast.media.TextTrackFontStyle")
@js.native
object TextTrackFontStyle extends js.Object {
  @js.native
  sealed trait BOLD extends TextTrackFontStyle
  
  @js.native
  sealed trait BOLD_ITALIC extends TextTrackFontStyle
  
  @js.native
  sealed trait ITALIC extends TextTrackFontStyle
  
  @js.native
  sealed trait NORMAL extends TextTrackFontStyle
  
  /* "BOLD" */ val BOLD: typings.chrome.chrome.cast.media.TextTrackFontStyle.BOLD with String = js.native
  /* "BOLD_ITALIC" */ val BOLD_ITALIC: typings.chrome.chrome.cast.media.TextTrackFontStyle.BOLD_ITALIC with String = js.native
  /* "ITALIC" */ val ITALIC: typings.chrome.chrome.cast.media.TextTrackFontStyle.ITALIC with String = js.native
  /* "NORMAL" */ val NORMAL: typings.chrome.chrome.cast.media.TextTrackFontStyle.NORMAL with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TextTrackFontStyle with String] = js.native
}

