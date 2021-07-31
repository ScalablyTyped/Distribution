package typings.chrome.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReceiverType extends StObject
@JSGlobal("chrome.cast.ReceiverType")
@js.native
object ReceiverType extends StObject {
  
  @js.native
  sealed trait CAST
    extends StObject
       with ReceiverType
  
  @js.native
  sealed trait CUSTOM
    extends StObject
       with ReceiverType
  
  @js.native
  sealed trait DIAL
    extends StObject
       with ReceiverType
  
  @js.native
  sealed trait HANGOUT
    extends StObject
       with ReceiverType
}
