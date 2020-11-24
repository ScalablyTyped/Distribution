package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextTrackFontStyle extends js.Object
@JSGlobal("chrome.cast.media.TextTrackFontStyle")
@js.native
object TextTrackFontStyle extends js.Object {
  
  @js.native
  sealed trait BOLD extends TextTrackFontStyle
  
  @js.native
  sealed trait BOLD_ITALIC extends TextTrackFontStyle
  
  @js.native
  sealed trait ITALIC extends TextTrackFontStyle
  
  @js.native
  sealed trait NORMAL extends TextTrackFontStyle
}
