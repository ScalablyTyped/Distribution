package typings.bootstrap.modalMod.Modal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Events extends js.Object
@JSImport("bootstrap/js/dist/modal", "Modal.Events")
@js.native
object Events extends js.Object {
  
  /**
    * This event is fired when the modal has finished being hidden from the
    * user (will wait for CSS transitions to complete).
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
    * This event is fired when the modal is shown, its backdrop is static
    * and a click outside the modal or an escape key press is performed
    * with the keyboard option or data-keyboard set to false.
    */
  @js.native
  sealed trait hidePrevented extends Events
  
  /**
    * This event fires immediately when the show instance method is called.
    * If caused by a click, the clicked element is available as the
    * relatedTarget property of the event.
    */
  @js.native
  sealed trait show extends Events
  
  /**
    * This event is fired when the modal has been made visible to the user
    * (will wait for CSS transitions to complete). If caused by a click,
    * the clicked element is available as the relatedTarget property of
    * the event.
    */
  @js.native
  sealed trait shown extends Events
}
