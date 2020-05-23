package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exception extends js.Object {
  var exception: js.UndefOr[js.Any] = js.undefined
  var message: js.UndefOr[String] = js.undefined
}

object Exception {
  @scala.inline
  def apply(exception: js.Any = null, message: String = null): Exception = {
    val __obj = js.Dynamic.literal()
    if (exception != null) __obj.updateDynamic("exception")(exception.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exception]
  }
}

