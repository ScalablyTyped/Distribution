package typings.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateResourcePolicyResponse extends js.Object {
  /**
    * Returns a message stating that your Reource Policy passed validation. 
    */
  var PolicyValidationPassed: js.UndefOr[BooleanType] = js.native
  /**
    * Returns an error message if your policy doesn't pass validatation.
    */
  var ValidationErrors: js.UndefOr[ValidationErrorsType] = js.native
}

object ValidateResourcePolicyResponse {
  @scala.inline
  def apply(): ValidateResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateResourcePolicyResponse]
  }
  @scala.inline
  implicit class ValidateResourcePolicyResponseOps[Self <: ValidateResourcePolicyResponse] (val x: Self) extends AnyVal {
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
    def setPolicyValidationPassed(value: BooleanType): Self = this.set("PolicyValidationPassed", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyValidationPassed: Self = this.set("PolicyValidationPassed", js.undefined)
    @scala.inline
    def setValidationErrorsVarargs(value: ValidationErrorsEntry*): Self = this.set("ValidationErrors", js.Array(value :_*))
    @scala.inline
    def setValidationErrors(value: ValidationErrorsType): Self = this.set("ValidationErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationErrors: Self = this.set("ValidationErrors", js.undefined)
  }
  
}

