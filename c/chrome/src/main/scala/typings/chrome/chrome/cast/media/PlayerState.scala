package typings.chrome.chrome.cast.media

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
  
  /* "BUFFERING" */ val BUFFERING: typings.chrome.chrome.cast.media.PlayerState.BUFFERING with String = js.native
  /* "IDLE" */ val IDLE: typings.chrome.chrome.cast.media.PlayerState.IDLE with String = js.native
  /* "PAUSED" */ val PAUSED: typings.chrome.chrome.cast.media.PlayerState.PAUSED with String = js.native
  /* "PLAYING" */ val PLAYING: typings.chrome.chrome.cast.media.PlayerState.PLAYING with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PlayerState with String] = js.native
}

