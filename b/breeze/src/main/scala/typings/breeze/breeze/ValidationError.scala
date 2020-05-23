package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError extends js.Object {
  var context: js.Any
  var errorMessage: String
  var key: String
  var property: IProperty
  var propertyName: String
  var validator: Validator
  def getKey(validator: Validator, property: String): String
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
}

