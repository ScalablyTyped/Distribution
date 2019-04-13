package typings
package decorumLib.decorumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageOpts extends js.Object {
  /**
    * The friendly name for the field. I.e. 'Email address', 'Password Confirmation', etc.
    */
  var friendlyName: java.lang.String
  /**
    * The property name from the model. I.e. 'emailAddress', 'username', etc.
    */
  var property: java.lang.String
  /**
    * The current value of the field at the time the validation error was generated.
    */
  var value: java.lang.String
}

object IMessageOpts {
  @scala.inline
  def apply(friendlyName: java.lang.String, property: java.lang.String, value: java.lang.String): IMessageOpts = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName, property = property, value = value)
  
    __obj.asInstanceOf[IMessageOpts]
  }
}

