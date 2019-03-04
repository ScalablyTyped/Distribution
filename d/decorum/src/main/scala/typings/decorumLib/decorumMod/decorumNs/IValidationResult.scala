package typings
package decorumLib.decorumMod.decorumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidationResult extends js.Object {
  /**
    * A map of field name to validation errors.
    */
  var errors: js.Array[IFieldValidationError]
  /**
    * Whether or not the model is valid.
    */
  var isValid: scala.Boolean
}

object IValidationResult {
  @scala.inline
  def apply(errors: js.Array[IFieldValidationError], isValid: scala.Boolean): IValidationResult = {
    val __obj = js.Dynamic.literal(errors = errors, isValid = isValid)
  
    __obj.asInstanceOf[IValidationResult]
  }
}

