package typings
package chromeLib.chromeNs.castNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RepeatMode extends js.Object

@JSGlobal("chrome.cast.media.RepeatMode")
@js.native
object RepeatMode extends js.Object {
  @js.native
  sealed trait ALL
    extends chromeLib.chromeNs.castNs.mediaNs.RepeatMode
  
  @js.native
  sealed trait ALL_AND_SHUFFLE
    extends chromeLib.chromeNs.castNs.mediaNs.RepeatMode
  
  @js.native
  sealed trait OFF
    extends chromeLib.chromeNs.castNs.mediaNs.RepeatMode
  
  @js.native
  sealed trait SINGLE
    extends chromeLib.chromeNs.castNs.mediaNs.RepeatMode
  
  /* "REPEAT_ALL" */ val ALL: ALL with java.lang.String = js.native
  /* "REPEAT_ALL_AND_SHUFFLE" */ val ALL_AND_SHUFFLE: ALL_AND_SHUFFLE with java.lang.String = js.native
  /* "REPEAT_OFF" */ val OFF: OFF with java.lang.String = js.native
  /* "REPEAT_SINGLE" */ val SINGLE: SINGLE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[chromeLib.chromeNs.castNs.mediaNs.RepeatMode with java.lang.String] = js.native
}

