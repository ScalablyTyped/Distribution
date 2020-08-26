package typings.awsSdkTypes.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & {  connectionError :boolean | undefined} */
@js.native
trait SdkError extends js.Object {
  var connectionError: js.UndefOr[Boolean] = js.native
  var message: String = js.native
  var name: String = js.native
  var stack: js.UndefOr[String] = js.native
}

object SdkError {
  @scala.inline
  def apply(message: String, name: String): SdkError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SdkError]
  }
  @scala.inline
  implicit class SdkErrorOps[Self <: SdkError] (val x: Self) extends AnyVal {
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
    def setConnectionError(value: Boolean): Self = this.set("connectionError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionError: Self = this.set("connectionError", js.undefined)
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
  
}

