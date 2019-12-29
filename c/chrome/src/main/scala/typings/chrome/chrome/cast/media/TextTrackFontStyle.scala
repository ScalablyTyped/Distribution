package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TextTrackFontStyle with String] = js.native
  /* "BOLD" */ @js.native
  object BOLD extends TopLevel[BOLD with String]
  
  /* "BOLD_ITALIC" */ @js.native
  object BOLD_ITALIC extends TopLevel[BOLD_ITALIC with String]
  
  /* "ITALIC" */ @js.native
  object ITALIC extends TopLevel[ITALIC with String]
  
  /* "NORMAL" */ @js.native
  object NORMAL extends TopLevel[NORMAL with String]
  
}

