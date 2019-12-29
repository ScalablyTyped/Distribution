package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaCommand extends js.Object

@JSGlobal("chrome.cast.media.MediaCommand")
@js.native
object MediaCommand extends js.Object {
  @js.native
  sealed trait PAUSE extends MediaCommand
  
  @js.native
  sealed trait SEEK extends MediaCommand
  
  @js.native
  sealed trait STREAM_MUTE extends MediaCommand
  
  @js.native
  sealed trait STREAM_VOLUME extends MediaCommand
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MediaCommand with String] = js.native
  /* "pause" */ @js.native
  object PAUSE extends TopLevel[PAUSE with String]
  
  /* "seek" */ @js.native
  object SEEK extends TopLevel[SEEK with String]
  
  /* "stream_mute" */ @js.native
  object STREAM_MUTE extends TopLevel[STREAM_MUTE with String]
  
  /* "stream_volume" */ @js.native
  object STREAM_VOLUME extends TopLevel[STREAM_VOLUME with String]
  
}

