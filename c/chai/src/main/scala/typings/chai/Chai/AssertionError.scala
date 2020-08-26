package typings.chai.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssertionError extends js.Object {
  var message: String = js.native
  var name: String = js.native
  var showDiff: Boolean = js.native
  var stack: String = js.native
}

object AssertionError {
  @scala.inline
  def apply(message: String, name: String, showDiff: Boolean, stack: String): AssertionError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], showDiff = showDiff.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertionError]
  }
  @scala.inline
  implicit class AssertionErrorOps[Self <: AssertionError] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowDiff(value: Boolean): Self = this.set("showDiff", value.asInstanceOf[js.Any])
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
  }
  
}

