package typings.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
