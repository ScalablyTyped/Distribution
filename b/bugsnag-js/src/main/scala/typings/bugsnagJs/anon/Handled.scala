package typings.bugsnagJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handled extends js.Object {
  var _handled: Double
  var _unhandled: Double
}

object Handled {
  @scala.inline
  def apply(_handled: Double, _unhandled: Double): Handled = {
    val __obj = js.Dynamic.literal(_handled = _handled.asInstanceOf[js.Any], _unhandled = _unhandled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handled]
  }
}

