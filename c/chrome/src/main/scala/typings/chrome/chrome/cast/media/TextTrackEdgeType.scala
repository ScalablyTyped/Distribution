package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.TopLevel
import typings.chrome.chrome.cast.media.TextTrackEdgeType.DEPRESSED
import typings.chrome.chrome.cast.media.TextTrackEdgeType.DROP_SHADOW
import typings.chrome.chrome.cast.media.TextTrackEdgeType.NONE
import typings.chrome.chrome.cast.media.TextTrackEdgeType.OUTLINE
import typings.chrome.chrome.cast.media.TextTrackEdgeType.RAISED
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TextTrackEdgeType with String] = js.native
  /* "DEPRESSED" */ @js.native
  object DEPRESSED extends TopLevel[DEPRESSED with String]
  
  /* "DROP_SHADOW" */ @js.native
  object DROP_SHADOW extends TopLevel[DROP_SHADOW with String]
  
  /* "NONE" */ @js.native
  object NONE extends TopLevel[NONE with String]
  
  /* "OUTLINE" */ @js.native
  object OUTLINE extends TopLevel[OUTLINE with String]
  
  /* "RAISED" */ @js.native
  object RAISED extends TopLevel[RAISED with String]
  
}

