package typings.breeze.breeze

import typings.breeze.breeze.core.EnumSymbol
import typings.breeze.breeze.core.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTypeSymbol extends EnumSymbol {
  var defaultValue: js.Any
  /** Optional function to get the next value when the datatype is used as a concurrency property. */
  var getConcurrencyValue: js.UndefOr[js.Function1[/* val */ js.Any, _]] = js.undefined
  /** Optional function to get the next value for key generation, if this datatype is used as a key.  Uses an internal table of previous values. */
  var getNext: js.UndefOr[js.Function0[_]] = js.undefined
  var isDate: js.UndefOr[Boolean] = js.undefined
  var isFloat: js.UndefOr[Boolean] = js.undefined
  var isInteger: js.UndefOr[Boolean] = js.undefined
  var isNumeric: js.UndefOr[Boolean] = js.undefined
  /** Optional function to normalize a data value for comparison, if its value cannot be used directly.  Note that this will be called each time a property is changed, so make it fast. */
  var normalize: js.UndefOr[js.Function1[/* val */ js.Any, _]] = js.undefined
  /** Function to convert a value from string to this DataType.  Note that this will be called each time a property is changed, so make it fast. */
  var parse: js.UndefOr[js.Function2[/* val */ js.Any, /* sourceTypeName */ js.UndefOr[String], _]] = js.undefined
  /** Optional function to convert a raw (server) value from string to this DataType. */
  var parseRawValue: js.UndefOr[js.Function1[/* val */ js.Any, _]] = js.undefined
  var quoteJsonOData: js.UndefOr[Boolean] = js.undefined
  /** Function to format this DataType for OData queries. */
  def fmtOData(`val`: js.Any): js.Any
  def validatorCtor(context: js.Any): Validator
}

object DataTypeSymbol {
  @scala.inline
  def apply(
    defaultValue: js.Any,
    fmtOData: js.Any => js.Any,
    getName: () => String,
    parentEnum: IEnum,
    validatorCtor: js.Any => Validator,
    getConcurrencyValue: /* val */ js.Any => _ = null,
    getNext: () => _ = null,
    isDate: js.UndefOr[Boolean] = js.undefined,
    isFloat: js.UndefOr[Boolean] = js.undefined,
    isInteger: js.UndefOr[Boolean] = js.undefined,
    isNumeric: js.UndefOr[Boolean] = js.undefined,
    normalize: /* val */ js.Any => _ = null,
    parse: (/* val */ js.Any, /* sourceTypeName */ js.UndefOr[String]) => _ = null,
    parseRawValue: /* val */ js.Any => _ = null,
    quoteJsonOData: js.UndefOr[Boolean] = js.undefined
  ): DataTypeSymbol = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], fmtOData = js.Any.fromFunction1(fmtOData), getName = js.Any.fromFunction0(getName), parentEnum = parentEnum.asInstanceOf[js.Any], validatorCtor = js.Any.fromFunction1(validatorCtor))
    if (getConcurrencyValue != null) __obj.updateDynamic("getConcurrencyValue")(js.Any.fromFunction1(getConcurrencyValue))
    if (getNext != null) __obj.updateDynamic("getNext")(js.Any.fromFunction0(getNext))
    if (!js.isUndefined(isDate)) __obj.updateDynamic("isDate")(isDate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isFloat)) __obj.updateDynamic("isFloat")(isFloat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteger)) __obj.updateDynamic("isInteger")(isInteger.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isNumeric)) __obj.updateDynamic("isNumeric")(isNumeric.get.asInstanceOf[js.Any])
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction1(normalize))
    if (parse != null) __obj.updateDynamic("parse")(js.Any.fromFunction2(parse))
    if (parseRawValue != null) __obj.updateDynamic("parseRawValue")(js.Any.fromFunction1(parseRawValue))
    if (!js.isUndefined(quoteJsonOData)) __obj.updateDynamic("quoteJsonOData")(quoteJsonOData.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTypeSymbol]
  }
}

