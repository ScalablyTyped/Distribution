package typings.chrome.chromeNs.castNs.mediaNs

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
  
  /* "DEPRESSED" */ val DEPRESSED: typings.chrome.chromeNs.castNs.mediaNs.TextTrackEdgeType.DEPRESSED with String = js.native
  /* "DROP_SHADOW" */ val DROP_SHADOW: typings.chrome.chromeNs.castNs.mediaNs.TextTrackEdgeType.DROP_SHADOW with String = js.native
  /* "NONE" */ val NONE: typings.chrome.chromeNs.castNs.mediaNs.TextTrackEdgeType.NONE with String = js.native
  /* "OUTLINE" */ val OUTLINE: typings.chrome.chromeNs.castNs.mediaNs.TextTrackEdgeType.OUTLINE with String = js.native
  /* "RAISED" */ val RAISED: typings.chrome.chromeNs.castNs.mediaNs.TextTrackEdgeType.RAISED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TextTrackEdgeType with String] = js.native
}

