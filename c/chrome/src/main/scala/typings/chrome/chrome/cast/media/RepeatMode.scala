package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.TopLevel
import typings.chrome.chrome.cast.media.RepeatMode.ALL
import typings.chrome.chrome.cast.media.RepeatMode.ALL_AND_SHUFFLE
import typings.chrome.chrome.cast.media.RepeatMode.OFF
import typings.chrome.chrome.cast.media.RepeatMode.SINGLE
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RepeatMode with String] = js.native
  /* "REPEAT_ALL" */ @js.native
  object ALL extends TopLevel[ALL with String]
  
  /* "REPEAT_ALL_AND_SHUFFLE" */ @js.native
  object ALL_AND_SHUFFLE extends TopLevel[ALL_AND_SHUFFLE with String]
  
  /* "REPEAT_OFF" */ @js.native
  object OFF extends TopLevel[OFF with String]
  
  /* "REPEAT_SINGLE" */ @js.native
  object SINGLE extends TopLevel[SINGLE with String]
  
}

