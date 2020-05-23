package typings.cordovaPluginContacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The ContactError object is returned to the user through the contactError callback function when an error occurs. */
trait ContactError extends js.Object {
  /** Error code */
  var code: Double
  /** Error message */
  var message: String
}

object ContactError {
  @scala.inline
  def apply(code: Double, message: String): ContactError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactError]
  }
}

