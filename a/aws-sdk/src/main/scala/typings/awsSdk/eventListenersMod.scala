package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/event_listeners", JSImport.Namespace)
@js.native
object eventListenersMod extends js.Object {
  @js.native
  object EventListeners extends js.Object {
    @js.native
    object Core extends js.Object {
      def HTTP_DATA(): Unit = js.native
      def SEND(): Unit = js.native
      def VALIDATE_CREDENTIALS(): Unit = js.native
      def VALIDATE_PARAMETERS(): Unit = js.native
      def VALIDATE_REGION(): Unit = js.native
      def removeListener(eventName: String, eventListener: js.Function): Unit = js.native
    }
    
  }
  
}

