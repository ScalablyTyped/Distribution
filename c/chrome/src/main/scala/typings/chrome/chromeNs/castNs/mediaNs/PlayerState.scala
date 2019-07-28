package typings.chrome.chromeNs.castNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlayerState extends js.Object

@JSGlobal("chrome.cast.media.PlayerState")
@js.native
object PlayerState extends js.Object {
  @js.native
  sealed trait BUFFERING extends PlayerState
  
  @js.native
  sealed trait IDLE extends PlayerState
  
  @js.native
  sealed trait PAUSED extends PlayerState
  
  @js.native
  sealed trait PLAYING extends PlayerState
  
  /* "BUFFERING" */ val BUFFERING: typings.chrome.chromeNs.castNs.mediaNs.PlayerState.BUFFERING with String = js.native
  /* "IDLE" */ val IDLE: typings.chrome.chromeNs.castNs.mediaNs.PlayerState.IDLE with String = js.native
  /* "PAUSED" */ val PAUSED: typings.chrome.chromeNs.castNs.mediaNs.PlayerState.PAUSED with String = js.native
  /* "PLAYING" */ val PLAYING: typings.chrome.chromeNs.castNs.mediaNs.PlayerState.PLAYING with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PlayerState with String] = js.native
}

