package typings.chrome.chromeNs.castNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* "REPEAT_ALL" */ val ALL: typings.chrome.chromeNs.castNs.mediaNs.RepeatMode.ALL with String = js.native
  /* "REPEAT_ALL_AND_SHUFFLE" */ val ALL_AND_SHUFFLE: typings.chrome.chromeNs.castNs.mediaNs.RepeatMode.ALL_AND_SHUFFLE with String = js.native
  /* "REPEAT_OFF" */ val OFF: typings.chrome.chromeNs.castNs.mediaNs.RepeatMode.OFF with String = js.native
  /* "REPEAT_SINGLE" */ val SINGLE: typings.chrome.chromeNs.castNs.mediaNs.RepeatMode.SINGLE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RepeatMode with String] = js.native
}

