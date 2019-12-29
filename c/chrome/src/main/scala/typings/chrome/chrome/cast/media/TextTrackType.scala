package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextTrackType extends js.Object

@JSGlobal("chrome.cast.media.TextTrackType")
@js.native
object TextTrackType extends js.Object {
  @js.native
  sealed trait CAPTIONS extends TextTrackType
  
  @js.native
  sealed trait CHAPTERS extends TextTrackType
  
  @js.native
  sealed trait DESCRIPTIONS extends TextTrackType
  
  @js.native
  sealed trait METADATA extends TextTrackType
  
  @js.native
  sealed trait SUBTITLES extends TextTrackType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TextTrackType with String] = js.native
  /* "CAPTIONS" */ @js.native
  object CAPTIONS extends TopLevel[CAPTIONS with String]
  
  /* "CHAPTERS" */ @js.native
  object CHAPTERS extends TopLevel[CHAPTERS with String]
  
  /* "DESCRIPTIONS" */ @js.native
  object DESCRIPTIONS extends TopLevel[DESCRIPTIONS with String]
  
  /* "METADATA" */ @js.native
  object METADATA extends TopLevel[METADATA with String]
  
  /* "SUBTITLES" */ @js.native
  object SUBTITLES extends TopLevel[SUBTITLES with String]
  
}

