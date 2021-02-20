package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StreamType extends StObject
@JSGlobal("chrome.cast.media.StreamType")
@js.native
object StreamType extends StObject {
  
  @js.native
  sealed trait BUFFERED extends StreamType
  
  @js.native
  sealed trait LIVE extends StreamType
  
  @js.native
  sealed trait OTHER extends StreamType
}
