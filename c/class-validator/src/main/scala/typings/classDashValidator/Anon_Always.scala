package typings.classDashValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Always extends js.Object {
  /**
    * Indicates if validation must be performed always, no matter of validation groups used.
    */
  var always: js.UndefOr[Boolean] = js.undefined
  /**
    * Constraints set by validation type.
    */
  var constraints: js.UndefOr[js.Array[_]] = js.undefined
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
  /**
    * Specific validation type options.
    */
  var options: js.UndefOr[js.Any] = js.undefined
  /**
    * Validation type. Should be one of the ValidationTypes value.
    */
  var `type`: String
}

object Anon_Always {
  @scala.inline
  def apply(
    `type`: String,
    always: js.UndefOr[Boolean] = js.undefined,
    constraints: js.Array[_] = null,
    each: js.UndefOr[Boolean] = js.undefined,
    groups: js.Array[String] = null,
    message: String | (js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* constraint1 */ js.UndefOr[js.Any], 
      /* constraint2 */ js.UndefOr[js.Any], 
      String
    ]) = null,
    options: js.Any = null
  ): Anon_Always = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(always)) __obj.updateDynamic("always")(always)
    if (constraints != null) __obj.updateDynamic("constraints")(constraints)
    if (!js.isUndefined(each)) __obj.updateDynamic("each")(each)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Anon_Always]
  }
}

