package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextTrackWindowType extends js.Object
@JSGlobal("chrome.cast.media.TextTrackWindowType")
@js.native
object TextTrackWindowType extends js.Object {
  
  @js.native
  sealed trait NONE extends TextTrackWindowType
  
  @js.native
  sealed trait NORMAL extends TextTrackWindowType
  
  @js.native
  sealed trait ROUNDED_CORNERS extends TextTrackWindowType
}
