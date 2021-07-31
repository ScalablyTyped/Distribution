package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaCommand extends StObject
@JSGlobal("chrome.cast.media.MediaCommand")
@js.native
object MediaCommand extends StObject {
  
  @js.native
  sealed trait PAUSE
    extends StObject
       with MediaCommand
  
  @js.native
  sealed trait SEEK
    extends StObject
       with MediaCommand
  
  @js.native
  sealed trait STREAM_MUTE
    extends StObject
       with MediaCommand
  
  @js.native
  sealed trait STREAM_VOLUME
    extends StObject
       with MediaCommand
}
