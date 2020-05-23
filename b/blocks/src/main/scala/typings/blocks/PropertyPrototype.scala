package typings.blocks

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
  var field: js.UndefOr[String] = js.undefined
  var isObservable: js.UndefOr[Boolean] = js.undefined
  var letters: js.UndefOr[Validator] = js.undefined
  var max: js.UndefOr[Validator] = js.undefined
  var maxErrors: js.UndefOr[Double] = js.undefined
  var maxlength: js.UndefOr[Validator] = js.undefined
  var min: js.UndefOr[Validator] = js.undefined
  var minlength: js.UndefOr[Validator] = js.undefined
  var number: js.UndefOr[Validator] = js.undefined
  var regexp: js.UndefOr[Validator] = js.undefined
  // Validators
  var required: js.UndefOr[Validator] = js.undefined
  var url: js.UndefOr[Validator] = js.undefined
  var validateInitially: js.UndefOr[Boolean] = js.undefined
  var validateOnChange: js.UndefOr[Boolean] = js.undefined
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
    field: String = null,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    letters: Validator = null,
    max: Validator = null,
    maxErrors: js.UndefOr[Double] = js.undefined,
    maxlength: Validator = null,
    min: Validator = null,
    minlength: Validator = null,
    number: Validator = null,
    regexp: Validator = null,
    required: Validator = null,
    url: Validator = null,
    validateInitially: js.UndefOr[Boolean] = js.undefined,
    validateOnChange: js.UndefOr[Boolean] = js.undefined,
    value: js.Any = null
  ): PropertyPrototype = {
    val __obj = js.Dynamic.literal()
    if (creditcard != null) __obj.updateDynamic("creditcard")(creditcard.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (digits != null) __obj.updateDynamic("digits")(digits.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (equals != null) __obj.updateDynamic("equals")(equals.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable.get.asInstanceOf[js.Any])
    if (letters != null) __obj.updateDynamic("letters")(letters.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (!js.isUndefined(maxErrors)) __obj.updateDynamic("maxErrors")(maxErrors.get.asInstanceOf[js.Any])
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minlength != null) __obj.updateDynamic("minlength")(minlength.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (regexp != null) __obj.updateDynamic("regexp")(regexp.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(validateInitially)) __obj.updateDynamic("validateInitially")(validateInitially.get.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyPrototype]
  }
}

