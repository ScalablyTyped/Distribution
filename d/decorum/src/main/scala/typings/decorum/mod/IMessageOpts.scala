package typings.decorum.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageOpts extends js.Object {
  /**
    * The friendly name for the field. I.e. 'Email address', 'Password Confirmation', etc.
    */
  var friendlyName: String
  /**
    * The property name from the model. I.e. 'emailAddress', 'username', etc.
    */
  var property: String
  /**
    * The current value of the field at the time the validation error was generated.
    */
  var value: String
}

object IMessageOpts {
  @scala.inline
  def apply(friendlyName: String, property: String, value: String): IMessageOpts = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMessageOpts]
  }
}

