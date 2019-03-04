package typings
package decorumLib.decorumMod.decorumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseValidator extends js.Object {
  /**
    * Returns true if the validator instance was passed a custom error message.
    */
  var hasCustomMessage: scala.Boolean
  /**
    * Gets the custom error message set on this validator.
    * @param opts Metadata about the field such as name and friendly name.
    * @returns {string} The custom error message or null if none has been set.
    */
  def getCustomMessage(opts: IMessageOpts): java.lang.String
  /**
    * Gets the unique name for this validator.
    * @returns {string} The unique name for this validator.
    */
  def getKey(): java.lang.String
  /**
    * [Abstract] Gets the error message to display when a field fails validation by this validator.
    * @param opts Metadata about the field such as name and friendly name.
    */
  def getMessage(opts: IMessageOpts): java.lang.String
  /**
    * [Abstract] Checks the passed value for validity.
    * @param value The field's proposed value.
    * @param model The rest of the model if cross-field validity checks are necessary.
    */
  def isValid(value: js.Any, model: js.Any): scala.Boolean
  /**
    * Check whether this validator should process an "empty" value (i.e. null, undefined, empty string). Override
    * this in derived classes to skip validators if the field value hasn't been set. Things like email, min/max
    * length, and pattern should return false for this to ensure they don't get fired when the model is initially
    * empty before a user has had a chance to input a value. Things like required should override this to true so
    * that they are fired for empty values. Base implementation defaults to false
    * @returns {boolean}
    */
  def validatesEmptyValue(): scala.Boolean
}

object BaseValidator {
  @scala.inline
  def apply(
    getCustomMessage: js.Function1[IMessageOpts, java.lang.String],
    getKey: js.Function0[java.lang.String],
    getMessage: js.Function1[IMessageOpts, java.lang.String],
    hasCustomMessage: scala.Boolean,
    isValid: js.Function2[js.Any, js.Any, scala.Boolean],
    validatesEmptyValue: js.Function0[scala.Boolean]
  ): BaseValidator = {
    val __obj = js.Dynamic.literal(getCustomMessage = getCustomMessage, getKey = getKey, getMessage = getMessage, hasCustomMessage = hasCustomMessage, isValid = isValid, validatesEmptyValue = validatesEmptyValue)
  
    __obj.asInstanceOf[BaseValidator]
  }
}

