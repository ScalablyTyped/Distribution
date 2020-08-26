package typings.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationErrorsEntry extends js.Object {
  /**
    * Checks the name of the policy.
    */
  var CheckName: js.UndefOr[NameType] = js.native
  /**
    * Displays error messages if validation encounters problems during validation of the resource policy.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.secretsmanagerMod.ErrorMessage] = js.native
}

object ValidationErrorsEntry {
  @scala.inline
  def apply(): ValidationErrorsEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationErrorsEntry]
  }
  @scala.inline
  implicit class ValidationErrorsEntryOps[Self <: ValidationErrorsEntry] (val x: Self) extends AnyVal {
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
    def setCheckName(value: NameType): Self = this.set("CheckName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckName: Self = this.set("CheckName", js.undefined)
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
  }
  
}

