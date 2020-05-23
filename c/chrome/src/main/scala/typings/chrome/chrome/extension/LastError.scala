package typings.chrome.chrome.extension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastError extends js.Object {
  /** Description of the error that has taken place. */
  var message: String
}

object LastError {
  @scala.inline
  def apply(message: String): LastError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastError]
  }
}

