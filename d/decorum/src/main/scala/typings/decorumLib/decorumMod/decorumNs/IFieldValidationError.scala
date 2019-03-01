package typings
package decorumLib.decorumMod.decorumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFieldValidationError extends js.Object {
  /**
    * One or more field validation errors. Empty if no errors.
    */
  var errors: js.Array[java.lang.String]
  /**
    * The property name of the field on the model.
    */
  var field: java.lang.String
  /**
    * The "friendly" name of the field. If not set on the model via @FieldName(...), it will default to "Field".
    */
  var fieldName: java.lang.String
}

object IFieldValidationError {
  @scala.inline
  def apply(errors: js.Array[java.lang.String], field: java.lang.String, fieldName: java.lang.String): IFieldValidationError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errors")(errors)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("fieldName")(fieldName)
    __obj.asInstanceOf[IFieldValidationError]
  }
}

