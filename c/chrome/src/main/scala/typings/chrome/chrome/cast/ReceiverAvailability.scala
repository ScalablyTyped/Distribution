package typings.chrome.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReceiverAvailability extends StObject
@JSGlobal("chrome.cast.ReceiverAvailability")
@js.native
object ReceiverAvailability extends StObject {
  
  @js.native
  sealed trait AVAILABLE
    extends StObject
       with ReceiverAvailability
  
  @js.native
  sealed trait UNAVAILABLE
    extends StObject
       with ReceiverAvailability
}
