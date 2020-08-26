package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentError extends js.Object {
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[String] = js.native
  /**
    * The error message.
    */
  var Message: js.UndefOr[SensitiveString] = js.native
}

object EnvironmentError {
  @scala.inline
  def apply(): EnvironmentError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentError]
  }
  @scala.inline
  implicit class EnvironmentErrorOps[Self <: EnvironmentError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorCode(value: String): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    @scala.inline
    def setMessage(value: SensitiveString): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
  }
  
}

