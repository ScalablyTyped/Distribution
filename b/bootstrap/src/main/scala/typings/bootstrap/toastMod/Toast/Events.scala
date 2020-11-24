package typings.bootstrap.toastMod.Toast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Events extends js.Object
@JSImport("bootstrap/js/dist/toast", "Toast.Events")
@js.native
object Events extends js.Object {
  
  /**
    * This event is fired when the toast has finished being hidden from the
    * user.
    */
  @js.native
  sealed trait hidden extends Events
  
  /**
    * This event is fired immediately when the hide instance method has
    * been called.
    */
  @js.native
  sealed trait hide extends Events
  
  /**
    * This event fires immediately when the show instance method is called.
    */
  @js.native
  sealed trait show extends Events
  
  /**
    * This event is fired when the toast has been made visible to the user.
    */
  @js.native
  sealed trait shown extends Events
}
