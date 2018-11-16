package typings
package chromeLib.chromeNs.castNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Capability extends js.Object

@JSGlobal("chrome.cast.Capability")
@js.native
object Capability extends js.Object {
  @js.native
  sealed trait AUDIO_IN
    extends chromeLib.chromeNs.castNs.Capability
  
  @js.native
  sealed trait AUDIO_OUT
    extends chromeLib.chromeNs.castNs.Capability
  
  @js.native
  sealed trait MULTIZONE_GROUP
    extends chromeLib.chromeNs.castNs.Capability
  
  @js.native
  sealed trait VIDEO_IN
    extends chromeLib.chromeNs.castNs.Capability
  
  @js.native
  sealed trait VIDEO_OUT
    extends chromeLib.chromeNs.castNs.Capability
  
  /* "audio_in" */ val AUDIO_IN: AUDIO_IN with java.lang.String = js.native
  /* "audio_out" */ val AUDIO_OUT: AUDIO_OUT with java.lang.String = js.native
  /* "multizone_group" */ val MULTIZONE_GROUP: MULTIZONE_GROUP with java.lang.String = js.native
  /* "video_in" */ val VIDEO_IN: VIDEO_IN with java.lang.String = js.native
  /* "video_out" */ val VIDEO_OUT: VIDEO_OUT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[chromeLib.chromeNs.castNs.Capability with java.lang.String] = js.native
}

