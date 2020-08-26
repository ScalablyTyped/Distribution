package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateSecurityProfileBehaviorsResponse extends js.Object {
  /**
    * True if the behaviors were valid.
    */
  var valid: js.UndefOr[Valid] = js.native
  /**
    * The list of any errors found in the behaviors.
    */
  var validationErrors: js.UndefOr[ValidationErrors] = js.native
}

object ValidateSecurityProfileBehaviorsResponse {
  @scala.inline
  def apply(): ValidateSecurityProfileBehaviorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateSecurityProfileBehaviorsResponse]
  }
  @scala.inline
  implicit class ValidateSecurityProfileBehaviorsResponseOps[Self <: ValidateSecurityProfileBehaviorsResponse] (val x: Self) extends AnyVal {
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
    def setValid(value: Valid): Self = this.set("valid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
    @scala.inline
    def setValidationErrorsVarargs(value: ValidationError*): Self = this.set("validationErrors", js.Array(value :_*))
    @scala.inline
    def setValidationErrors(value: ValidationErrors): Self = this.set("validationErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationErrors: Self = this.set("validationErrors", js.undefined)
  }
  
}

