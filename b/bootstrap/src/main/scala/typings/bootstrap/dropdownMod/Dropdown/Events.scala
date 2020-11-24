package typings.bootstrap.dropdownMod.Dropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Events extends js.Object
@JSImport("bootstrap/js/dist/dropdown", "Dropdown.Events")
@js.native
object Events extends js.Object {
  
  /**
    * Fired when the dropdown has finished being hidden from the user and
    * CSS transitions have completed.
    */
  @js.native
  sealed trait hidden extends Events
  
  /**
    * Fires immediately when the hide instance method has been called.
    */
  @js.native
  sealed trait hide extends Events
  
  /**
    * Fires immediately when the show instance method is called.
    */
  @js.native
  sealed trait show extends Events
  
  /**
    * Fired when the dropdown has been made visible to the user and CSS
    * transitions have completed.
    */
  @js.native
  sealed trait shown extends Events
}
