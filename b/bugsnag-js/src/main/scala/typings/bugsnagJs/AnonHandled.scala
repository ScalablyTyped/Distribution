package typings.bugsnagJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandled extends js.Object {
  var _handled: Double
  var _unhandled: Double
}

object AnonHandled {
  @scala.inline
  def apply(_handled: Double, _unhandled: Double): AnonHandled = {
    val __obj = js.Dynamic.literal(_handled = _handled.asInstanceOf[js.Any], _unhandled = _unhandled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHandled]
  }
}

