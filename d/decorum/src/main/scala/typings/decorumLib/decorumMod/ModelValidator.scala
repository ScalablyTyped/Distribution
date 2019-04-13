package typings
package decorumLib.decorumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decorum", "ModelValidator")
@js.native
class ModelValidator protected () extends js.Object {
  /**
    * Creates a new model validator.
    * @param model The model to validate. Should be a class that has a valid constructor function and prototype.
    */
  def this(model: js.Any) = this()
  /**
    * Gets the validation options for the given field name.
    * @param fieldKey         The name of the field to get options for.
    * @returns {FieldOptions} The field options associated with that field or null if no validations defined
    * for the field.
    */
  def getValidationOptions(fieldKey: java.lang.String): FieldOptions = js.native
  /**
    * Validate the entire model and return a result that indicates whether the model is valid or not and any
    * errors
    * that have occurred in an object indexed by field name on the model.
    * @returns {IValidationResult} An object that contains whether the model is valid or not and errors by field
    *     name.
    */
  def validate(): IValidationResult = js.native
  /**
    * Validates the given field on this {ModelValidator}'s model. If a proposed value is passed, validate
    * against that passed value; otherwise, use the field's current value on the model.
    * @param fieldKey      The name of the field to validate.
    * @param proposedValue [Optional] The proposed value to set on the field.
    * @returns {string[]}  An array of field validation error messages if the field is invalid; otherwise,
    * an empty array.
    */
  def validateField(fieldKey: java.lang.String): js.Array[java.lang.String] = js.native
  def validateField(fieldKey: java.lang.String, proposedValue: js.Any): js.Array[java.lang.String] = js.native
}

