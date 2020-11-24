package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
