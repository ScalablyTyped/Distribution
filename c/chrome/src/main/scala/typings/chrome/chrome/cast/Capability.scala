package typings.chrome.chrome.cast

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
  
  /* "audio_in" */ val AUDIO_IN: typings.chrome.chrome.cast.Capability.AUDIO_IN with String = js.native
  /* "audio_out" */ val AUDIO_OUT: typings.chrome.chrome.cast.Capability.AUDIO_OUT with String = js.native
  /* "multizone_group" */ val MULTIZONE_GROUP: typings.chrome.chrome.cast.Capability.MULTIZONE_GROUP with String = js.native
  /* "video_in" */ val VIDEO_IN: typings.chrome.chrome.cast.Capability.VIDEO_IN with String = js.native
  /* "video_out" */ val VIDEO_OUT: typings.chrome.chrome.cast.Capability.VIDEO_OUT with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Capability with String] = js.native
}

