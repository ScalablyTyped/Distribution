package typings
package chromeLib.chromeNs.castNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResumeState extends js.Object

@JSGlobal("chrome.cast.media.ResumeState")
@js.native
object ResumeState extends js.Object {
  @js.native
  sealed trait PLAYBACK_PAUSE
    extends chromeLib.chromeNs.castNs.mediaNs.ResumeState
  
  @js.native
  sealed trait PLAYBACK_START
    extends chromeLib.chromeNs.castNs.mediaNs.ResumeState
  
  /* "PLAYBACK_PAUSE" */ val PLAYBACK_PAUSE: PLAYBACK_PAUSE with java.lang.String = js.native
  /* "PLAYBACK_START" */ val PLAYBACK_START: PLAYBACK_START with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[chromeLib.chromeNs.castNs.mediaNs.ResumeState with java.lang.String] = js.native
}

