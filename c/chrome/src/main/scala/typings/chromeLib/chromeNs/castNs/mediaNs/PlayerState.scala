package typings
package chromeLib.chromeNs.castNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlayerState extends js.Object

@JSGlobal("chrome.cast.media.PlayerState")
@js.native
object PlayerState extends js.Object {
  @js.native
  sealed trait BUFFERING
    extends chromeLib.chromeNs.castNs.mediaNs.PlayerState
  
  @js.native
  sealed trait IDLE
    extends chromeLib.chromeNs.castNs.mediaNs.PlayerState
  
  @js.native
  sealed trait PAUSED
    extends chromeLib.chromeNs.castNs.mediaNs.PlayerState
  
  @js.native
  sealed trait PLAYING
    extends chromeLib.chromeNs.castNs.mediaNs.PlayerState
  
  /* "BUFFERING" */ val BUFFERING: BUFFERING with java.lang.String = js.native
  /* "IDLE" */ val IDLE: IDLE with java.lang.String = js.native
  /* "PAUSED" */ val PAUSED: PAUSED with java.lang.String = js.native
  /* "PLAYING" */ val PLAYING: PLAYING with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[chromeLib.chromeNs.castNs.mediaNs.PlayerState with java.lang.String] = js.native
}

