package typings.classDashValidator.decoratorValidationOptionsMod

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
    * You can use "$value" to use value that was failed by validation.
    * You can use "$constraint1" and "$constraint2" keys in the message string,
    * and they will be replaced with constraint values if they exist.
    * Message can be either string, either a function that returns a string.
    * Second option allows to use values and custom messages depend of them.
    */
  var message: js.UndefOr[
    String | (js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* constraint1 */ js.UndefOr[js.Any], 
      /* constraint2 */ js.UndefOr[js.Any], 
      String
    ])
  ] = js.undefined
}

object ValidationOptions {
  @scala.inline
  def apply(
    always: js.UndefOr[Boolean] = js.undefined,
    context: js.Any = null,
    each: js.UndefOr[Boolean] = js.undefined,
    groups: js.Array[String] = null,
    message: String | (js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* constraint1 */ js.UndefOr[js.Any], 
      /* constraint2 */ js.UndefOr[js.Any], 
      String
    ]) = null
  ): ValidationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(always)) __obj.updateDynamic("always")(always)
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(each)) __obj.updateDynamic("each")(each)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptions]
  }
}

