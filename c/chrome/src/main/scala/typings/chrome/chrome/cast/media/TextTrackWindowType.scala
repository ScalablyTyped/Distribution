package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TextTrackWindowType with String] = js.native
  /* "NONE" */ @js.native
  object NONE extends TopLevel[NONE with String]
  
  /* "NORMAL" */ @js.native
  object NORMAL extends TopLevel[NORMAL with String]
  
  /* "ROUNDED_CORNERS" */ @js.native
  object ROUNDED_CORNERS extends TopLevel[ROUNDED_CORNERS with String]
  
}

