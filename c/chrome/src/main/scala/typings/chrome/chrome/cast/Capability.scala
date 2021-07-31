package typings.chrome.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Capability extends StObject
@JSGlobal("chrome.cast.Capability")
@js.native
object Capability extends StObject {
  
  @js.native
  sealed trait AUDIO_IN
    extends StObject
       with Capability
  
  @js.native
  sealed trait AUDIO_OUT
    extends StObject
       with Capability
  
  @js.native
  sealed trait MULTIZONE_GROUP
    extends StObject
       with Capability
  
  @js.native
  sealed trait VIDEO_IN
    extends StObject
       with Capability
  
  @js.native
  sealed trait VIDEO_OUT
    extends StObject
       with Capability
}
