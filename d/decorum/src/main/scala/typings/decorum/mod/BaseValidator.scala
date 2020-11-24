package typings.decorum.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("decorum", "BaseValidator")
@js.native
abstract class BaseValidator protected () extends js.Object {
  /**
    * Initializes the {BaseValidator}
    * @param validatorKey A unique "key" by which to identify this field validator i.e. length, maxlength,
    *     required. Should be a valid JS property name.
    * @param message A custom error message to return. Should be passed down from concrete class' constructors to
    *     enable customizing error messages.
    */
  def this(validatorKey: String, message: String) = this()
  def this(validatorKey: String, message: MessageHandler[_]) = this()
  
  /**
    * Gets the custom error message set on this validator.
    * @param opts Metadata about the field such as name and friendly name.
    * @returns {string} The custom error message or null if none has been set.
    */
  def getCustomMessage(opts: IMessageOpts): String = js.native
  
  /**
    * Gets the unique name for this validator.
    * @returns {string} The unique name for this validator.
    */
  def getKey(): String = js.native
  
  /**
    * [Abstract] Gets the error message to display when a field fails validation by this validator.
    * @param opts Metadata about the field such as name and friendly name.
    */
  def getMessage(opts: IMessageOpts): String = js.native
  
  /**
    * Returns true if the validator instance was passed a custom error message.
    */
  var hasCustomMessage: Boolean = js.native
  
  /**
    * [Abstract] Checks the passed value for validity.
    * @param value The field's proposed value.
    * @param model The rest of the model if cross-field validity checks are necessary.
    */
  def isValid(value: js.Any, model: js.Any): Boolean = js.native
  
  /**
    * Check whether this validator should process an "empty" value (i.e. null, undefined, empty string). Override
    * this in derived classes to skip validators if the field value hasn't been set. Things like email, min/max
    * length, and pattern should return false for this to ensure they don't get fired when the model is initially
    * empty before a user has had a chance to input a value. Things like required should override this to true so
    * that they are fired for empty values. Base implementation defaults to false
    * @returns {boolean}
    */
  def validatesEmptyValue(): Boolean = js.native
}
