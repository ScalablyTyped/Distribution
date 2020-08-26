package typings.bugsnagJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handled extends js.Object {
  var _handled: Double = js.native
  var _unhandled: Double = js.native
}

object Handled {
  @scala.inline
  def apply(_handled: Double, _unhandled: Double): Handled = {
    val __obj = js.Dynamic.literal(_handled = _handled.asInstanceOf[js.Any], _unhandled = _unhandled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handled]
  }
  @scala.inline
  implicit class HandledOps[Self <: Handled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_handled(value: Double): Self = this.set("_handled", value.asInstanceOf[js.Any])
    @scala.inline
    def set_unhandled(value: Double): Self = this.set("_unhandled", value.asInstanceOf[js.Any])
  }
  
}

