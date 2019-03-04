package typings
package decorumLib.decorumMod.decorumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldOptions extends js.Object {
  /**
    * Add a validator to the list of validators for this field.
    * @param validator The validator to add. Should be a class that extends from {BaseValidator}.
    */
  def addValidator(validator: BaseValidator): scala.Unit
  /**
    * Gets the "friendly" name of the field for use in validation error messages. Defaults to just "Field".
    * @returns {string}
    */
  def getFriendlyName(): java.lang.String
  /**
    * Gets the validators assigned to this field.
    * @returns {BaseValidator[]} The validators for this field.
    */
  def getValidators(): js.Array[BaseValidator]
  /**
    * Sets the "friendly" name of the field for use in validation error messages. This name will be used in the
    * text of validation errors.
    * @param name The new name to set.
    */
  def setFriendlyName(name: java.lang.String): scala.Unit
  /**
    * Runs through all of the validators for the field given a particular value and returns any validation errors
    * that may have occurred.
    * @param value The value to validate.
    * @param model The rest of the model. Used in custom cross-field validations.
    * @returns {string[]} Any validation errors that may have occurred or an empty array if the value passed is
    *     valid for the field.
    */
  def validateValue(value: js.Any, model: js.Any): js.Array[java.lang.String]
}

object FieldOptions {
  @scala.inline
  def apply(
    addValidator: js.Function1[BaseValidator, scala.Unit],
    getFriendlyName: js.Function0[java.lang.String],
    getValidators: js.Function0[js.Array[BaseValidator]],
    setFriendlyName: js.Function1[java.lang.String, scala.Unit],
    validateValue: js.Function2[js.Any, js.Any, js.Array[java.lang.String]]
  ): FieldOptions = {
    val __obj = js.Dynamic.literal(addValidator = addValidator, getFriendlyName = getFriendlyName, getValidators = getValidators, setFriendlyName = setFriendlyName, validateValue = validateValue)
  
    __obj.asInstanceOf[FieldOptions]
  }
}

