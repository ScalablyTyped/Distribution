package typings
package decorumLib.decorumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decorum", "FieldOptions")
@js.native
class FieldOptions protected ()
  extends decorumLib.decorumMod.decorumNs.FieldOptions {
  def this(property: java.lang.String) = this()
  /**
    * Add a validator to the list of validators for this field.
    * @param validator The validator to add. Should be a class that extends from {BaseValidator}.
    */
  /* CompleteClass */
  override def addValidator(validator: decorumLib.decorumMod.decorumNs.BaseValidator): scala.Unit = js.native
  /**
    * Gets the "friendly" name of the field for use in validation error messages. Defaults to just "Field".
    * @returns {string}
    */
  /* CompleteClass */
  override def getFriendlyName(): java.lang.String = js.native
  /**
    * Gets the validators assigned to this field.
    * @returns {BaseValidator[]} The validators for this field.
    */
  /* CompleteClass */
  override def getValidators(): js.Array[decorumLib.decorumMod.decorumNs.BaseValidator] = js.native
  /**
    * Sets the "friendly" name of the field for use in validation error messages. This name will be used in the
    * text of validation errors.
    * @param name The new name to set.
    */
  /* CompleteClass */
  override def setFriendlyName(name: java.lang.String): scala.Unit = js.native
  /**
    * Runs through all of the validators for the field given a particular value and returns any validation errors
    * that may have occurred.
    * @param value The value to validate.
    * @param model The rest of the model. Used in custom cross-field validations.
    * @returns {string[]} Any validation errors that may have occurred or an empty array if the value passed is
    *     valid for the field.
    */
  /* CompleteClass */
  override def validateValue(value: js.Any, model: js.Any): js.Array[java.lang.String] = js.native
}

