package typings.chrome.chrome.cast

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Capability extends js.Object

@JSGlobal("chrome.cast.Capability")
@js.native
object Capability extends js.Object {
  @js.native
  sealed trait AUDIO_IN extends Capability
  
  @js.native
  sealed trait AUDIO_OUT extends Capability
  
  @js.native
  sealed trait MULTIZONE_GROUP extends Capability
  
  @js.native
  sealed trait VIDEO_IN extends Capability
  
  @js.native
  sealed trait VIDEO_OUT extends Capability
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Capability with String] = js.native
  /* "audio_in" */ @js.native
  object AUDIO_IN extends TopLevel[AUDIO_IN with String]
  
  /* "audio_out" */ @js.native
  object AUDIO_OUT extends TopLevel[AUDIO_OUT with String]
  
  /* "multizone_group" */ @js.native
  object MULTIZONE_GROUP extends TopLevel[MULTIZONE_GROUP with String]
  
  /* "video_in" */ @js.native
  object VIDEO_IN extends TopLevel[VIDEO_IN with String]
  
  /* "video_out" */ @js.native
  object VIDEO_OUT extends TopLevel[VIDEO_OUT with String]
  
}

