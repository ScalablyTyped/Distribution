package typings.classDashValidator.decoratorValidationOptionsMod

import typings.classDashValidator.validationValidationArgumentsMod.ValidationArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOptions extends js.Object {
  /**
    * Indicates if validation must be performed always, no matter of validation groups used.
    */
  var always: js.UndefOr[Boolean] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  /**
    * Specifies if validated value is an array and each of its item must be validated.
    */
  var each: js.UndefOr[Boolean] = js.undefined
  /**
    * Validation groups used for this validation.
    */
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Error message used to be used on validation fail.
    * Message can be either string, either a function that returns a string.
    */
  var message: js.UndefOr[String | (js.Function1[/* validationArguments */ ValidationArguments, String])] = js.undefined
}

object ValidationOptions {
  @scala.inline
  def apply(
    always: js.UndefOr[Boolean] = js.undefined,
    context: js.Any = null,
    each: js.UndefOr[Boolean] = js.undefined,
    groups: js.Array[String] = null,
    message: String | (js.Function1[/* validationArguments */ ValidationArguments, String]) = null
  ): ValidationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(always)) __obj.updateDynamic("always")(always.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(each)) __obj.updateDynamic("each")(each.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptions]
  }
}

