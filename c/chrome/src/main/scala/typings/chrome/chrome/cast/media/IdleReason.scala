package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IdleReason extends StObject
@JSGlobal("chrome.cast.media.IdleReason")
@js.native
object IdleReason extends StObject {
  
  @js.native
  sealed trait CANCELLED
    extends StObject
       with IdleReason
  
  @js.native
  sealed trait ERROR
    extends StObject
       with IdleReason
  
  @js.native
  sealed trait FINISHED
    extends StObject
       with IdleReason
  
  @js.native
  sealed trait INTERRUPTED
    extends StObject
       with IdleReason
}
