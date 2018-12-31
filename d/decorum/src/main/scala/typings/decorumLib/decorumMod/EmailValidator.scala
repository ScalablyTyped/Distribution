package typings
package decorumLib.decorumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decorum", "EmailValidator")
@js.native
class EmailValidator ()
  extends decorumLib.decorumMod.decorumNs.EmailValidator {
  def this(message: decorumLib.decorumMod.decorumNs.MessageHandler[decorumLib.decorumMod.decorumNs.EmailValidator]) = this()
  def this(message: java.lang.String) = this()
  /**
    * Returns true if the validator instance was passed a custom error message.
    */
  /* CompleteClass */
  override var hasCustomMessage: scala.Boolean = js.native
  /* CompleteClass */
  override var pattern: stdLib.RegExp = js.native
  /**
    * Gets the custom error message set on this validator.
    * @param opts Metadata about the field such as name and friendly name.
    * @returns {string} The custom error message or null if none has been set.
    */
  /* CompleteClass */
  override def getCustomMessage(opts: decorumLib.decorumMod.decorumNs.IMessageOpts): java.lang.String = js.native
  /**
    * Gets the unique name for this validator.
    * @returns {string} The unique name for this validator.
    */
  /* CompleteClass */
  override def getKey(): java.lang.String = js.native
  /**
    * [Abstract] Gets the error message to display when a field fails validation by this validator.
    * @param opts Metadata about the field such as name and friendly name.
    */
  /* CompleteClass */
  override def getMessage(opts: decorumLib.decorumMod.decorumNs.IMessageOpts): java.lang.String = js.native
  /* CompleteClass */
  override def isValid(value: js.Any): scala.Boolean = js.native
  /**
    * [Abstract] Checks the passed value for validity.
    * @param value The field's proposed value.
    * @param model The rest of the model if cross-field validity checks are necessary.
    */
  /* CompleteClass */
  override def isValid(value: js.Any, model: js.Any): scala.Boolean = js.native
  /**
    * Check whether this validator should process an "empty" value (i.e. null, undefined, empty string). Override
    * this in derived classes to skip validators if the field value hasn't been set. Things like email, min/max
    * length, and pattern should return false for this to ensure they don't get fired when the model is initially
    * empty before a user has had a chance to input a value. Things like required should override this to true so
    * that they are fired for empty values. Base implementation defaults to false
    * @returns {boolean}
    */
  /* CompleteClass */
  override def validatesEmptyValue(): scala.Boolean = js.native
}

@JSImport("decorum", "EmailValidator")
@js.native
object EmailValidator extends js.Object {
  var EmailRegex: stdLib.RegExp = js.native
}

