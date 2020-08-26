package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationError extends js.Object {
  var context: js.Any = js.native
  var errorMessage: String = js.native
  var key: String = js.native
  var property: IProperty = js.native
  var propertyName: String = js.native
  var validator: Validator = js.native
  def getKey(validator: Validator, property: String): String = js.native
}

object ValidationError {
  @scala.inline
  def apply(
    context: js.Any,
    errorMessage: String,
    getKey: (Validator, String) => String,
    key: String,
    property: IProperty,
    propertyName: String,
    validator: Validator
  ): ValidationError = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], getKey = js.Any.fromFunction2(getKey), key = key.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
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
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetKey(value: (Validator, String) => String): Self = this.set("getKey", js.Any.fromFunction2(value))
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperty(value: IProperty): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidator(value: Validator): Self = this.set("validator", value.asInstanceOf[js.Any])
  }
  
}

