package typings
package chromeLib.chromeNs.castNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaCommand extends js.Object

@JSGlobal("chrome.cast.media.MediaCommand")
@js.native
object MediaCommand extends js.Object {
  @js.native
  sealed trait PAUSE
    extends chromeLib.chromeNs.castNs.mediaNs.MediaCommand
  
  @js.native
  sealed trait SEEK
    extends chromeLib.chromeNs.castNs.mediaNs.MediaCommand
  
  @js.native
  sealed trait STREAM_MUTE
    extends chromeLib.chromeNs.castNs.mediaNs.MediaCommand
  
  @js.native
  sealed trait STREAM_VOLUME
    extends chromeLib.chromeNs.castNs.mediaNs.MediaCommand
  
  /* "pause" */ val PAUSE: PAUSE with java.lang.String = js.native
  /* "seek" */ val SEEK: SEEK with java.lang.String = js.native
  /* "stream_mute" */ val STREAM_MUTE: STREAM_MUTE with java.lang.String = js.native
  /* "stream_volume" */ val STREAM_VOLUME: STREAM_VOLUME with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[chromeLib.chromeNs.castNs.mediaNs.MediaCommand with java.lang.String] = js.native
}

