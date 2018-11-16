package typings
package chromeLib.chromeNs.castNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextTrackEdgeType extends js.Object

@JSGlobal("chrome.cast.media.TextTrackEdgeType")
@js.native
object TextTrackEdgeType extends js.Object {
  @js.native
  sealed trait DEPRESSED
    extends chromeLib.chromeNs.castNs.mediaNs.TextTrackEdgeType
  
  @js.native
  sealed trait DROP_SHADOW
    extends chromeLib.chromeNs.castNs.mediaNs.TextTrackEdgeType
  
  @js.native
  sealed trait NONE
    extends chromeLib.chromeNs.castNs.mediaNs.TextTrackEdgeType
  
  @js.native
  sealed trait OUTLINE
    extends chromeLib.chromeNs.castNs.mediaNs.TextTrackEdgeType
  
  @js.native
  sealed trait RAISED
    extends chromeLib.chromeNs.castNs.mediaNs.TextTrackEdgeType
  
  /* "DEPRESSED" */ val DEPRESSED: DEPRESSED with java.lang.String = js.native
  /* "DROP_SHADOW" */ val DROP_SHADOW: DROP_SHADOW with java.lang.String = js.native
  /* "NONE" */ val NONE: NONE with java.lang.String = js.native
  /* "OUTLINE" */ val OUTLINE: OUTLINE with java.lang.String = js.native
  /* "RAISED" */ val RAISED: RAISED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[chromeLib.chromeNs.castNs.mediaNs.TextTrackEdgeType with java.lang.String] = js.native
}

