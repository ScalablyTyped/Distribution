package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateError extends js.Object {
  /**
    * Description of the error type.
    */
  var Message: js.UndefOr[NonEmptyString] = js.native
  /**
    * Type of error.
    */
  var Type: js.UndefOr[TemplateErrorType] = js.native
}

object TemplateError {
  @scala.inline
  def apply(): TemplateError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateError]
  }
  @scala.inline
  implicit class TemplateErrorOps[Self <: TemplateError] (val x: Self) extends AnyVal {
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
    def setMessage(value: NonEmptyString): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setType(value: TemplateErrorType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

