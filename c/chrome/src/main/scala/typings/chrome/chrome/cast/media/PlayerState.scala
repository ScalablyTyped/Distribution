package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PlayerState with String] = js.native
  /* "BUFFERING" */ @js.native
  object BUFFERING extends TopLevel[BUFFERING with String]
  
  /* "IDLE" */ @js.native
  object IDLE extends TopLevel[IDLE with String]
  
  /* "PAUSED" */ @js.native
  object PAUSED extends TopLevel[PAUSED with String]
  
  /* "PLAYING" */ @js.native
  object PLAYING extends TopLevel[PLAYING with String]
  
}

