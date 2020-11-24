package typings.cloudeventsSdk.validationErrorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ignore
  * @typedef {import("ajv").ErrorObject} ErrorObject
  * */
/**
  * A Error class that will be thrown when a CloudEvent
  * cannot be properly validated against a specification.
  */
@js.native
trait ValidationError extends Error {
  
  var errors: js.Array[typings.ajv.mod.ErrorObject | String] = js.native
}
object ValidationError {
  
  @scala.inline
  def apply(errors: js.Array[typings.ajv.mod.ErrorObject | String], message: String, name: String): ValidationError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
  
  @scala.inline
  implicit class ValidationErrorOps[Self <: ValidationError] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: (typings.ajv.mod.ErrorObject | String)*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[typings.ajv.mod.ErrorObject | String]): Self = this.set("errors", value.asInstanceOf[js.Any])
  }
}
