package typings.bootstrap.collapseMod.Collapse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Events extends js.Object
@JSImport("bootstrap/js/dist/collapse", "Collapse.Events")
@js.native
object Events extends js.Object {
  
  /**
    * This event is fired when a collapse element has been hidden from the
    * user (will wait for CSS transitions to complete).
    */
  @js.native
  sealed trait hidden extends Events
  
  /**
    * This event is fired immediately when the hide method has been called.
    */
  @js.native
  sealed trait hide extends Events
  
  /**
    * This event fires immediately when the show instance method is called.
    */
  @js.native
  sealed trait show extends Events
  
  /**
    * This event is fired when a collapse element has been made visible to the user (will wait for CSS transitions to complete).
    */
  @js.native
  sealed trait shown extends Events
}
