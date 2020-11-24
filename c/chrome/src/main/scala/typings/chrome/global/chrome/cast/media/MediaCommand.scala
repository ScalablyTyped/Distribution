package typings.chrome.global.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.cast.media.MediaCommand")
@js.native
object MediaCommand extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.media.MediaCommand with String] = js.native
  
  /* "pause" */ val PAUSE: typings.chrome.chrome.cast.media.MediaCommand.PAUSE with String = js.native
  
  /* "seek" */ val SEEK: typings.chrome.chrome.cast.media.MediaCommand.SEEK with String = js.native
  
  /* "stream_mute" */ val STREAM_MUTE: typings.chrome.chrome.cast.media.MediaCommand.STREAM_MUTE with String = js.native
  
  /* "stream_volume" */ val STREAM_VOLUME: typings.chrome.chrome.cast.media.MediaCommand.STREAM_VOLUME with String = js.native
}
