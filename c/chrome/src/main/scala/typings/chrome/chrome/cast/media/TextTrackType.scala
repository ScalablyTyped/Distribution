package typings.chrome.chrome.cast.media

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
  
  /* "CAPTIONS" */ val CAPTIONS: typings.chrome.chrome.cast.media.TextTrackType.CAPTIONS with String = js.native
  /* "CHAPTERS" */ val CHAPTERS: typings.chrome.chrome.cast.media.TextTrackType.CHAPTERS with String = js.native
  /* "DESCRIPTIONS" */ val DESCRIPTIONS: typings.chrome.chrome.cast.media.TextTrackType.DESCRIPTIONS with String = js.native
  /* "METADATA" */ val METADATA: typings.chrome.chrome.cast.media.TextTrackType.METADATA with String = js.native
  /* "SUBTITLES" */ val SUBTITLES: typings.chrome.chrome.cast.media.TextTrackType.SUBTITLES with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TextTrackType with String] = js.native
}

