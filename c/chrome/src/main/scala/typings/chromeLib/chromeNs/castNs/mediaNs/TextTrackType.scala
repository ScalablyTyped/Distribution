package typings
package chromeLib.chromeNs.castNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextTrackType extends js.Object

@JSGlobal("chrome.cast.media.TextTrackType")
@js.native
object TextTrackType extends js.Object {
  @js.native
  sealed trait CAPTIONS
    extends chromeLib.chromeNs.castNs.mediaNs.TextTrackType
  
  @js.native
  sealed trait CHAPTERS
    extends chromeLib.chromeNs.castNs.mediaNs.TextTrackType
  
  @js.native
  sealed trait DESCRIPTIONS
    extends chromeLib.chromeNs.castNs.mediaNs.TextTrackType
  
  @js.native
  sealed trait METADATA
    extends chromeLib.chromeNs.castNs.mediaNs.TextTrackType
  
  @js.native
  sealed trait SUBTITLES
    extends chromeLib.chromeNs.castNs.mediaNs.TextTrackType
  
  /* "CAPTIONS" */ val CAPTIONS: CAPTIONS with java.lang.String = js.native
  /* "CHAPTERS" */ val CHAPTERS: CHAPTERS with java.lang.String = js.native
  /* "DESCRIPTIONS" */ val DESCRIPTIONS: DESCRIPTIONS with java.lang.String = js.native
  /* "METADATA" */ val METADATA: METADATA with java.lang.String = js.native
  /* "SUBTITLES" */ val SUBTITLES: SUBTITLES with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[chromeLib.chromeNs.castNs.mediaNs.TextTrackType with java.lang.String] = js.native
}

