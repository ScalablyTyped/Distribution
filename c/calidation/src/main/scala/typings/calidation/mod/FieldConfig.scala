package typings.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldConfig[T /* <: js.Object */] extends js.Object {
  var isBlacklisted: js.UndefOr[BlacklistValidator[T]] = js.undefined
  var isEmail: js.UndefOr[SimpleValidator[T]] = js.undefined
  var isEqual: js.UndefOr[ValueValidator[_, T]] = js.undefined
  var isExactLength: js.UndefOr[LengthValidator[T]] = js.undefined
  var isGreaterThan: js.UndefOr[ValueValidator[Double, T]] = js.undefined
  var isLessThan: js.UndefOr[ValueValidator[Double, T]] = js.undefined
  var isMaxLength: js.UndefOr[LengthValidator[T]] = js.undefined
  var isMinLength: js.UndefOr[LengthValidator[T]] = js.undefined
  var isNumber: js.UndefOr[SimpleValidator[T]] = js.undefined
  var isRegexMatch: js.UndefOr[RegexValidator[T]] = js.undefined
  var isRequired: js.UndefOr[SimpleValidator[T]] = js.undefined
  var isWhitelisted: js.UndefOr[WhitelistValidator[T]] = js.undefined
}

object FieldConfig {
  @scala.inline
  def apply[/* <: js.Object */ T](
    isBlacklisted: BlacklistValidator[T] = null,
    isEmail: SimpleValidator[T] = null,
    isEqual: ValueValidator[_, T] = null,
    isExactLength: LengthValidator[T] = null,
    isGreaterThan: ValueValidator[Double, T] = null,
    isLessThan: ValueValidator[Double, T] = null,
    isMaxLength: LengthValidator[T] = null,
    isMinLength: LengthValidator[T] = null,
    isNumber: SimpleValidator[T] = null,
    isRegexMatch: RegexValidator[T] = null,
    isRequired: SimpleValidator[T] = null,
    isWhitelisted: WhitelistValidator[T] = null
  ): FieldConfig[T] = {
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
    __obj.asInstanceOf[FieldConfig[T]]
  }
}

