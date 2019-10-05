package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextTrackEdgeType extends js.Object

@JSGlobal("chrome.cast.media.TextTrackEdgeType")
@js.native
object TextTrackEdgeType extends js.Object {
  @js.native
  sealed trait DEPRESSED extends TextTrackEdgeType
  
  @js.native
  sealed trait DROP_SHADOW extends TextTrackEdgeType
  
  @js.native
  sealed trait NONE extends TextTrackEdgeType
  
  @js.native
  sealed trait OUTLINE extends TextTrackEdgeType
  
  @js.native
  sealed trait RAISED extends TextTrackEdgeType
  
  /* "DEPRESSED" */ val DEPRESSED: typings.chrome.chrome.cast.media.TextTrackEdgeType.DEPRESSED with String = js.native
  /* "DROP_SHADOW" */ val DROP_SHADOW: typings.chrome.chrome.cast.media.TextTrackEdgeType.DROP_SHADOW with String = js.native
  /* "NONE" */ val NONE: typings.chrome.chrome.cast.media.TextTrackEdgeType.NONE with String = js.native
  /* "OUTLINE" */ val OUTLINE: typings.chrome.chrome.cast.media.TextTrackEdgeType.OUTLINE with String = js.native
  /* "RAISED" */ val RAISED: typings.chrome.chrome.cast.media.TextTrackEdgeType.RAISED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TextTrackEdgeType with String] = js.native
}

