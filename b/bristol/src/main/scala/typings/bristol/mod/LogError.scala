package typings.bristol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogError extends js.Object {
  var message: js.UndefOr[String] = js.native
  var reason: js.UndefOr[js.Any] = js.native
  var stack: js.UndefOr[js.Any] = js.native
}

object LogError {
  @scala.inline
  def apply(): LogError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogError]
  }
  @scala.inline
  implicit class LogErrorOps[Self <: LogError] (val x: Self) extends AnyVal {
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
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setReason(value: js.Any): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setStack(value: js.Any): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
  
}

