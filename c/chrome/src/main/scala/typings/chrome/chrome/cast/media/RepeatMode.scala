package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RepeatMode extends js.Object
@JSGlobal("chrome.cast.media.RepeatMode")
@js.native
object RepeatMode extends js.Object {
  
  @js.native
  sealed trait ALL extends RepeatMode
  
  @js.native
  sealed trait ALL_AND_SHUFFLE extends RepeatMode
  
  @js.native
  sealed trait OFF extends RepeatMode
  
  @js.native
  sealed trait SINGLE extends RepeatMode
}
