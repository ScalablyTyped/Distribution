package typings.calidation.calidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldConfig extends js.Object {
  var isBlacklisted: js.UndefOr[BlacklistValidator] = js.undefined
  var isEmail: js.UndefOr[SimpleValidator] = js.undefined
  var isEqual: js.UndefOr[ValueValidator[_]] = js.undefined
  var isExactLength: js.UndefOr[LengthValidator] = js.undefined
  var isGreaterThan: js.UndefOr[ValueValidator[Double]] = js.undefined
  var isLessThan: js.UndefOr[ValueValidator[Double]] = js.undefined
  var isMaxLength: js.UndefOr[LengthValidator] = js.undefined
  var isMinLength: js.UndefOr[LengthValidator] = js.undefined
  var isNumber: js.UndefOr[SimpleValidator] = js.undefined
  var isRegexMatch: js.UndefOr[RegexValidator] = js.undefined
  var isRequired: js.UndefOr[SimpleValidator] = js.undefined
  var isWhitelisted: js.UndefOr[WhitelistValidator] = js.undefined
}

object FieldConfig {
  @scala.inline
  def apply(
    isBlacklisted: BlacklistValidator = null,
    isEmail: SimpleValidator = null,
    isEqual: ValueValidator[_] = null,
    isExactLength: LengthValidator = null,
    isGreaterThan: ValueValidator[Double] = null,
    isLessThan: ValueValidator[Double] = null,
    isMaxLength: LengthValidator = null,
    isMinLength: LengthValidator = null,
    isNumber: SimpleValidator = null,
    isRegexMatch: RegexValidator = null,
    isRequired: SimpleValidator = null,
    isWhitelisted: WhitelistValidator = null
  ): FieldConfig = {
    val __obj = js.Dynamic.literal()
    if (isBlacklisted != null) __obj.updateDynamic("isBlacklisted")(isBlacklisted.asInstanceOf[js.Any])
    if (isEmail != null) __obj.updateDynamic("isEmail")(isEmail.asInstanceOf[js.Any])
    if (isEqual != null) __obj.updateDynamic("isEqual")(isEqual.asInstanceOf[js.Any])
    if (isExactLength != null) __obj.updateDynamic("isExactLength")(isExactLength.asInstanceOf[js.Any])
    if (isGreaterThan != null) __obj.updateDynamic("isGreaterThan")(isGreaterThan.asInstanceOf[js.Any])
    if (isLessThan != null) __obj.updateDynamic("isLessThan")(isLessThan.asInstanceOf[js.Any])
    if (isMaxLength != null) __obj.updateDynamic("isMaxLength")(isMaxLength.asInstanceOf[js.Any])
    if (isMinLength != null) __obj.updateDynamic("isMinLength")(isMinLength.asInstanceOf[js.Any])
    if (isNumber != null) __obj.updateDynamic("isNumber")(isNumber.asInstanceOf[js.Any])
    if (isRegexMatch != null) __obj.updateDynamic("isRegexMatch")(isRegexMatch.asInstanceOf[js.Any])
    if (isRequired != null) __obj.updateDynamic("isRequired")(isRequired.asInstanceOf[js.Any])
    if (isWhitelisted != null) __obj.updateDynamic("isWhitelisted")(isWhitelisted.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldConfig]
  }
}

