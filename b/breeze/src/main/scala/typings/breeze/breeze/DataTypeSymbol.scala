package typings.breeze.breeze

import typings.breeze.breeze.core.EnumSymbol
import typings.breeze.breeze.core.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTypeSymbol extends EnumSymbol {
  var defaultValue: js.Any = js.native
  /** Optional function to get the next value when the datatype is used as a concurrency property. */
  var getConcurrencyValue: js.UndefOr[js.Function1[/* val */ js.Any, _]] = js.native
  /** Optional function to get the next value for key generation, if this datatype is used as a key.  Uses an internal table of previous values. */
  var getNext: js.UndefOr[js.Function0[_]] = js.native
  var isDate: js.UndefOr[Boolean] = js.native
  var isFloat: js.UndefOr[Boolean] = js.native
  var isInteger: js.UndefOr[Boolean] = js.native
  var isNumeric: js.UndefOr[Boolean] = js.native
  /** Optional function to normalize a data value for comparison, if its value cannot be used directly.  Note that this will be called each time a property is changed, so make it fast. */
  var normalize: js.UndefOr[js.Function1[/* val */ js.Any, _]] = js.native
  /** Function to convert a value from string to this DataType.  Note that this will be called each time a property is changed, so make it fast. */
  var parse: js.UndefOr[js.Function2[/* val */ js.Any, /* sourceTypeName */ js.UndefOr[String], _]] = js.native
  /** Optional function to convert a raw (server) value from string to this DataType. */
  var parseRawValue: js.UndefOr[js.Function1[/* val */ js.Any, _]] = js.native
  var quoteJsonOData: js.UndefOr[Boolean] = js.native
  /** Function to format this DataType for OData queries. */
  def fmtOData(`val`: js.Any): js.Any = js.native
  def validatorCtor(context: js.Any): Validator = js.native
}

object DataTypeSymbol {
  @scala.inline
  def apply(
    defaultValue: js.Any,
    fmtOData: js.Any => js.Any,
    getName: () => String,
    parentEnum: IEnum,
    validatorCtor: js.Any => Validator
  ): DataTypeSymbol = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], fmtOData = js.Any.fromFunction1(fmtOData), getName = js.Any.fromFunction0(getName), parentEnum = parentEnum.asInstanceOf[js.Any], validatorCtor = js.Any.fromFunction1(validatorCtor))
    __obj.asInstanceOf[DataTypeSymbol]
  }
  @scala.inline
  implicit class DataTypeSymbolOps[Self <: DataTypeSymbol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setFmtOData(value: js.Any => js.Any): Self = this.set("fmtOData", js.Any.fromFunction1(value))
    @scala.inline
    def setValidatorCtor(value: js.Any => Validator): Self = this.set("validatorCtor", js.Any.fromFunction1(value))
    @scala.inline
    def setGetConcurrencyValue(value: /* val */ js.Any => _): Self = this.set("getConcurrencyValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetConcurrencyValue: Self = this.set("getConcurrencyValue", js.undefined)
    @scala.inline
    def setGetNext(value: () => _): Self = this.set("getNext", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetNext: Self = this.set("getNext", js.undefined)
    @scala.inline
    def setIsDate(value: Boolean): Self = this.set("isDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDate: Self = this.set("isDate", js.undefined)
    @scala.inline
    def setIsFloat(value: Boolean): Self = this.set("isFloat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFloat: Self = this.set("isFloat", js.undefined)
    @scala.inline
    def setIsInteger(value: Boolean): Self = this.set("isInteger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInteger: Self = this.set("isInteger", js.undefined)
    @scala.inline
    def setIsNumeric(value: Boolean): Self = this.set("isNumeric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsNumeric: Self = this.set("isNumeric", js.undefined)
    @scala.inline
    def setNormalize(value: /* val */ js.Any => _): Self = this.set("normalize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
    @scala.inline
    def setParse(value: (/* val */ js.Any, /* sourceTypeName */ js.UndefOr[String]) => _): Self = this.set("parse", js.Any.fromFunction2(value))
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
    @scala.inline
    def setParseRawValue(value: /* val */ js.Any => _): Self = this.set("parseRawValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteParseRawValue: Self = this.set("parseRawValue", js.undefined)
    @scala.inline
    def setQuoteJsonOData(value: Boolean): Self = this.set("quoteJsonOData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuoteJsonOData: Self = this.set("quoteJsonOData", js.undefined)
  }
  
}

