package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.TopLevel
import typings.chrome.chrome.cast.media.ResumeState.PLAYBACK_PAUSE
import typings.chrome.chrome.cast.media.ResumeState.PLAYBACK_START
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResumeState extends js.Object

@JSGlobal("chrome.cast.media.ResumeState")
@js.native
object ResumeState extends js.Object {
  @js.native
  sealed trait PLAYBACK_PAUSE extends ResumeState
  
  @js.native
  sealed trait PLAYBACK_START extends ResumeState
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ResumeState with String] = js.native
  /* "PLAYBACK_PAUSE" */ @js.native
  object PLAYBACK_PAUSE extends TopLevel[PLAYBACK_PAUSE with String]
  
  /* "PLAYBACK_START" */ @js.native
  object PLAYBACK_START extends TopLevel[PLAYBACK_START with String]
  
}

