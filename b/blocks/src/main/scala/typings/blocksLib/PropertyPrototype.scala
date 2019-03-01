package typings
package blocksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/////////////////////////////////////////
// App.Property
/////////////////////////////////////////
trait PropertyPrototype extends js.Object {
  var creditcard: js.UndefOr[Validator] = js.undefined
  var date: js.UndefOr[Validator] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var digits: js.UndefOr[Validator] = js.undefined
  var email: js.UndefOr[Validator] = js.undefined
  @JSName("equals")
  var equals_FPropertyPrototype: js.UndefOr[Validator] = js.undefined
  var field: js.UndefOr[java.lang.String] = js.undefined
  var isObservable: js.UndefOr[scala.Boolean] = js.undefined
  var letters: js.UndefOr[Validator] = js.undefined
  var max: js.UndefOr[Validator] = js.undefined
  var maxErrors: js.UndefOr[scala.Double] = js.undefined
  var maxlength: js.UndefOr[Validator] = js.undefined
  var min: js.UndefOr[Validator] = js.undefined
  var minlength: js.UndefOr[Validator] = js.undefined
  var number: js.UndefOr[Validator] = js.undefined
  var regexp: js.UndefOr[Validator] = js.undefined
  // Validators
  var required: js.UndefOr[Validator] = js.undefined
  var url: js.UndefOr[Validator] = js.undefined
  var validateInitially: js.UndefOr[scala.Boolean] = js.undefined
  var validateOnChange: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object PropertyPrototype {
  @scala.inline
  def apply(
    creditcard: Validator = null,
    date: Validator = null,
    defaultValue: js.Any = null,
    digits: Validator = null,
    email: Validator = null,
    equals: Validator = null,
    field: java.lang.String = null,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
    letters: Validator = null,
    max: Validator = null,
    maxErrors: scala.Int | scala.Double = null,
    maxlength: Validator = null,
    min: Validator = null,
    minlength: Validator = null,
    number: Validator = null,
    regexp: Validator = null,
    required: Validator = null,
    url: Validator = null,
    validateInitially: js.UndefOr[scala.Boolean] = js.undefined,
    validateOnChange: js.UndefOr[scala.Boolean] = js.undefined,
    value: js.Any = null
  ): PropertyPrototype = {
    val __obj = js.Dynamic.literal()
    if (creditcard != null) __obj.updateDynamic("creditcard")(creditcard)
    if (date != null) __obj.updateDynamic("date")(date)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (digits != null) __obj.updateDynamic("digits")(digits)
    if (email != null) __obj.updateDynamic("email")(email)
    if (equals != null) __obj.updateDynamic("equals")(equals)
    if (field != null) __obj.updateDynamic("field")(field)
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (letters != null) __obj.updateDynamic("letters")(letters)
    if (max != null) __obj.updateDynamic("max")(max)
    if (maxErrors != null) __obj.updateDynamic("maxErrors")(maxErrors.asInstanceOf[js.Any])
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength)
    if (min != null) __obj.updateDynamic("min")(min)
    if (minlength != null) __obj.updateDynamic("minlength")(minlength)
    if (number != null) __obj.updateDynamic("number")(number)
    if (regexp != null) __obj.updateDynamic("regexp")(regexp)
    if (required != null) __obj.updateDynamic("required")(required)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(validateInitially)) __obj.updateDynamic("validateInitially")(validateInitially)
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PropertyPrototype]
  }
}

