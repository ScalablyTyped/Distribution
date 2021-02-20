package typings.awsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventListeners {
  
  object Core {
    
    @JSImport("aws-sdk", "EventListeners.Core.HTTP_DATA")
    @js.native
    def HTTP_DATA(): Unit = js.native
    
    @JSImport("aws-sdk", "EventListeners.Core.SEND")
    @js.native
    def SEND(): Unit = js.native
    
    @JSImport("aws-sdk", "EventListeners.Core.VALIDATE_CREDENTIALS")
    @js.native
    def VALIDATE_CREDENTIALS(): Unit = js.native
    
    @JSImport("aws-sdk", "EventListeners.Core.VALIDATE_PARAMETERS")
    @js.native
    def VALIDATE_PARAMETERS(): Unit = js.native
    
    @JSImport("aws-sdk", "EventListeners.Core.VALIDATE_REGION")
    @js.native
    def VALIDATE_REGION(): Unit = js.native
    
    @JSImport("aws-sdk", "EventListeners.Core.removeListener")
    @js.native
    def removeListener(eventName: String, eventListener: js.Function): Unit = js.native
  }
}
