package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextTrackFontStyle extends StObject
@JSGlobal("chrome.cast.media.TextTrackFontStyle")
@js.native
object TextTrackFontStyle extends StObject {
  
  @js.native
  sealed trait BOLD
    extends StObject
       with TextTrackFontStyle
  
  @js.native
  sealed trait BOLD_ITALIC
    extends StObject
       with TextTrackFontStyle
  
  @js.native
  sealed trait ITALIC
    extends StObject
       with TextTrackFontStyle
  
  @js.native
  sealed trait NORMAL
    extends StObject
       with TextTrackFontStyle
}
