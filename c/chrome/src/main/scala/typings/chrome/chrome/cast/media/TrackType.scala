package typings.chrome.chrome.cast.media

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
  
  /* "AUDIO" */ val AUDIO: typings.chrome.chrome.cast.media.TrackType.AUDIO with String = js.native
  /* "TEXT" */ val TEXT: typings.chrome.chrome.cast.media.TrackType.TEXT with String = js.native
  /* "VIDEO" */ val VIDEO: typings.chrome.chrome.cast.media.TrackType.VIDEO with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TrackType with String] = js.native
}

