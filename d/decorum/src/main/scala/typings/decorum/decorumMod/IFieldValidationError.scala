package typings.decorum.decorumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFieldValidationError extends js.Object {
  /**
    * One or more field validation errors. Empty if no errors.
    */
  var errors: js.Array[String]
  /**
    * The property name of the field on the model.
    */
  var field: String
  /**
    * The "friendly" name of the field. If not set on the model via @FieldName(...), it will default to "Field".
    */
  var fieldName: String
}

object IFieldValidationError {
  @scala.inline
  def apply(errors: js.Array[String], field: String, fieldName: String): IFieldValidationError = {
    val __obj = js.Dynamic.literal(errors = errors, field = field, fieldName = fieldName)
  
    __obj.asInstanceOf[IFieldValidationError]
  }
}

