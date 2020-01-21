package typings.decorum.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decorum", "FieldOptions")
@js.native
class FieldOptions protected () extends js.Object {
  def this(property: String) = this()
  /**
    * Add a validator to the list of validators for this field.
    * @param validator The validator to add. Should be a class that extends from {BaseValidator}.
    */
  def addValidator(validator: BaseValidator): Unit = js.native
  /**
    * Gets the "friendly" name of the field for use in validation error messages. Defaults to just "Field".
    * @returns {string}
    */
  def getFriendlyName(): String = js.native
  /**
    * Gets the validators assigned to this field.
    * @returns {BaseValidator[]} The validators for this field.
    */
  def getValidators(): js.Array[BaseValidator] = js.native
  /**
    * Sets the "friendly" name of the field for use in validation error messages. This name will be used in the
    * text of validation errors.
    * @param name The new name to set.
    */
  def setFriendlyName(name: String): Unit = js.native
  /**
    * Runs through all of the validators for the field given a particular value and returns any validation errors
    * that may have occurred.
    * @param value The value to validate.
    * @param model The rest of the model. Used in custom cross-field validations.
    * @returns {string[]} Any validation errors that may have occurred or an empty array if the value passed is
    *     valid for the field.
    */
  def validateValue(value: js.Any, model: js.Any): js.Array[String] = js.native
}

