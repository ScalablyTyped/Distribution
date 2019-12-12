package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.TopLevel
import typings.chrome.chrome.cast.media.StreamType.BUFFERED
import typings.chrome.chrome.cast.media.StreamType.LIVE
import typings.chrome.chrome.cast.media.StreamType.OTHER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StreamType extends js.Object

@JSGlobal("chrome.cast.media.StreamType")
@js.native
object StreamType extends js.Object {
  @js.native
  sealed trait BUFFERED extends StreamType
  
  @js.native
  sealed trait LIVE extends StreamType
  
  @js.native
  sealed trait OTHER extends StreamType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StreamType with String] = js.native
  /* "BUFFERED" */ @js.native
  object BUFFERED extends TopLevel[BUFFERED with String]
  
  /* "LIVE" */ @js.native
  object LIVE extends TopLevel[LIVE with String]
  
  /* "OTHER" */ @js.native
  object OTHER extends TopLevel[OTHER with String]
  
}

