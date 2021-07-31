package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextTrackEdgeType extends StObject
@JSGlobal("chrome.cast.media.TextTrackEdgeType")
@js.native
object TextTrackEdgeType extends StObject {
  
  @js.native
  sealed trait DEPRESSED
    extends StObject
       with TextTrackEdgeType
  
  @js.native
  sealed trait DROP_SHADOW
    extends StObject
       with TextTrackEdgeType
  
  @js.native
  sealed trait NONE
    extends StObject
       with TextTrackEdgeType
  
  @js.native
  sealed trait OUTLINE
    extends StObject
       with TextTrackEdgeType
  
  @js.native
  sealed trait RAISED
    extends StObject
       with TextTrackEdgeType
}
