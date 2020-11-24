package typings.bootstrap.alertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alert extends js.Object {
  
  /**
    * Closes an alert by removing it from the DOM. If the .fade and .show
    * classes are present on the element, the alert will fade out before it
    * is removed.
    */
  def close(): Unit = js.native
  
  /**
    * Destroys an element's alert.
    */
  def dispose(): Unit = js.native
}
@JSImport("bootstrap/js/dist/alert", "Alert")
@js.native
object Alert extends js.Object {
  
  @js.native
  sealed trait Events extends js.Object
  @js.native
  object Events extends js.Object {
    
    /**
      * Fires immediately when the close instance method is called.
      */
    @js.native
    sealed trait close extends Events
    
    /**
      * Fired when the alert has been closed and CSS transitions have
      * completed.
      */
    @js.native
    sealed trait closed extends Events
  }
}
