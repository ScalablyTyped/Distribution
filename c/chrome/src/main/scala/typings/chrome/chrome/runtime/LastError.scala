package typings.chrome.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastError extends js.Object {
  /** Optional. Details about the error which occurred.  */
  var message: js.UndefOr[String] = js.undefined
}

object LastError {
  @scala.inline
  def apply(message: String = null): LastError = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastError]
  }
}

