package typings.chrome.chromeNs.castNs.mediaNs

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
  
  /* "pause" */ val PAUSE: typings.chrome.chromeNs.castNs.mediaNs.MediaCommand.PAUSE with String = js.native
  /* "seek" */ val SEEK: typings.chrome.chromeNs.castNs.mediaNs.MediaCommand.SEEK with String = js.native
  /* "stream_mute" */ val STREAM_MUTE: typings.chrome.chromeNs.castNs.mediaNs.MediaCommand.STREAM_MUTE with String = js.native
  /* "stream_volume" */ val STREAM_VOLUME: typings.chrome.chromeNs.castNs.mediaNs.MediaCommand.STREAM_VOLUME with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MediaCommand with String] = js.native
}

