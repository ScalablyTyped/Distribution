package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.TopLevel
import typings.chrome.chrome.cast.media.TrackType.AUDIO
import typings.chrome.chrome.cast.media.TrackType.TEXT
import typings.chrome.chrome.cast.media.TrackType.VIDEO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TrackType extends js.Object

@JSGlobal("chrome.cast.media.TrackType")
@js.native
object TrackType extends js.Object {
  @js.native
  sealed trait AUDIO extends TrackType
  
  @js.native
  sealed trait TEXT extends TrackType
  
  @js.native
  sealed trait VIDEO extends TrackType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TrackType with String] = js.native
  /* "AUDIO" */ @js.native
  object AUDIO extends TopLevel[AUDIO with String]
  
  /* "TEXT" */ @js.native
  object TEXT extends TopLevel[TEXT with String]
  
  /* "VIDEO" */ @js.native
  object VIDEO extends TopLevel[VIDEO with String]
  
}

