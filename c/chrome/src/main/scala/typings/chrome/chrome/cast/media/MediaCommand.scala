package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaCommand extends js.Object

@JSGlobal("chrome.cast.media.MediaCommand")
@js.native
object MediaCommand extends js.Object {
  @js.native
  sealed trait PAUSE extends MediaCommand
  
  @js.native
  sealed trait SEEK extends MediaCommand
  
  @js.native
  sealed trait STREAM_MUTE extends MediaCommand
  
  @js.native
  sealed trait STREAM_VOLUME extends MediaCommand
  
}

