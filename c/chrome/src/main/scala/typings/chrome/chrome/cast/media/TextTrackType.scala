package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextTrackType extends StObject
@JSGlobal("chrome.cast.media.TextTrackType")
@js.native
object TextTrackType extends StObject {
  
  @js.native
  sealed trait CAPTIONS
    extends StObject
       with TextTrackType
  
  @js.native
  sealed trait CHAPTERS
    extends StObject
       with TextTrackType
  
  @js.native
  sealed trait DESCRIPTIONS
    extends StObject
       with TextTrackType
  
  @js.native
  sealed trait METADATA
    extends StObject
       with TextTrackType
  
  @js.native
  sealed trait SUBTITLES
    extends StObject
       with TextTrackType
}
