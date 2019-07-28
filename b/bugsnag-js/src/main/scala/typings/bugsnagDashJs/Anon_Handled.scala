package typings.bugsnagDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Handled extends js.Object {
  var _handled: Double
  var _unhandled: Double
}

object Anon_Handled {
  @scala.inline
  def apply(_handled: Double, _unhandled: Double): Anon_Handled = {
    val __obj = js.Dynamic.literal(_handled = _handled, _unhandled = _unhandled)
  
    __obj.asInstanceOf[Anon_Handled]
  }
}

