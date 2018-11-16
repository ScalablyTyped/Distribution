package typings
package chromeLib.chromeNs.castNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TrackType extends js.Object

@JSGlobal("chrome.cast.media.TrackType")
@js.native
object TrackType extends js.Object {
  @js.native
  sealed trait AUDIO
    extends chromeLib.chromeNs.castNs.mediaNs.TrackType
  
  @js.native
  sealed trait TEXT
    extends chromeLib.chromeNs.castNs.mediaNs.TrackType
  
  @js.native
  sealed trait VIDEO
    extends chromeLib.chromeNs.castNs.mediaNs.TrackType
  
  /* "AUDIO" */ val AUDIO: AUDIO with java.lang.String = js.native
  /* "TEXT" */ val TEXT: TEXT with java.lang.String = js.native
  /* "VIDEO" */ val VIDEO: VIDEO with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[chromeLib.chromeNs.castNs.mediaNs.TrackType with java.lang.String] = js.native
}

