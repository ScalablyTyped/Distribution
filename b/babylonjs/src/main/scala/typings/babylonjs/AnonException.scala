package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonException extends js.Object {
  var exception: js.UndefOr[js.Any] = js.undefined
  var message: js.UndefOr[String] = js.undefined
}

object AnonException {
  @scala.inline
  def apply(exception: js.Any = null, message: String = null): AnonException = {
    val __obj = js.Dynamic.literal()
    if (exception != null) __obj.updateDynamic("exception")(exception.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonException]
  }
}

