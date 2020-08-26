package typings.cleaveJs.optionsMod

import typings.cleaveJs.creditCardMod.CreditCardTypeChangeHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CleaveOptions extends js.Object {
  var blocks: js.UndefOr[js.Array[Double]] = js.native
  var copyDelimiter: js.UndefOr[Boolean] = js.native
  var creditCard: js.UndefOr[Boolean] = js.native
  var creditCardStrictMode: js.UndefOr[Boolean] = js.native
  var creditCardType: js.UndefOr[String] = js.native
  var date: js.UndefOr[Boolean] = js.native
  var dateMax: js.UndefOr[String] = js.native
  var dateMin: js.UndefOr[String] = js.native
  var datePattern: js.UndefOr[js.Array[String]] = js.native
  var delimiter: js.UndefOr[String] = js.native
  var delimiterLazyShow: js.UndefOr[Boolean] = js.native
  var delimiters: js.UndefOr[js.Array[String]] = js.native
  var initValue: js.UndefOr[js.Any] = js.native
  var lowercase: js.UndefOr[Boolean] = js.native
  var noImmediatePrefix: js.UndefOr[Boolean] = js.native
  var numeral: js.UndefOr[Boolean] = js.native
  var numeralDecimalMark: js.UndefOr[String] = js.native
  var numeralDecimalScale: js.UndefOr[Double] = js.native
  var numeralIntegerScale: js.UndefOr[Double] = js.native
  var numeralPositiveOnly: js.UndefOr[Boolean] = js.native
  var numeralThousandsGroupStyle: js.UndefOr[NumeralThousandsGroupStyleType] = js.native
  var numericOnly: js.UndefOr[Boolean] = js.native
  var onCreditCardTypeChanged: js.UndefOr[CreditCardTypeChangeHandler] = js.native
  var onValueChanged: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  var phone: js.UndefOr[Boolean] = js.native
  var phoneRegionCode: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var rawValueTrimPrefix: js.UndefOr[Boolean] = js.native
  var stripLeadingZeroes: js.UndefOr[Boolean] = js.native
  var time: js.UndefOr[Boolean] = js.native
  var timeFormat: js.UndefOr[String] = js.native
  var timePattern: js.UndefOr[js.Array[String]] = js.native
  var uppercase: js.UndefOr[Boolean] = js.native
}

object CleaveOptions {
  @scala.inline
  def apply(): CleaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CleaveOptions]
  }
  @scala.inline
  implicit class CleaveOptionsOps[Self <: CleaveOptions] (val x: Self) extends AnyVal {
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
    def setBlocksVarargs(value: Double*): Self = this.set("blocks", js.Array(value :_*))
    @scala.inline
    def setBlocks(value: js.Array[Double]): Self = this.set("blocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlocks: Self = this.set("blocks", js.undefined)
    @scala.inline
    def setCopyDelimiter(value: Boolean): Self = this.set("copyDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyDelimiter: Self = this.set("copyDelimiter", js.undefined)
    @scala.inline
    def setCreditCard(value: Boolean): Self = this.set("creditCard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreditCard: Self = this.set("creditCard", js.undefined)
    @scala.inline
    def setCreditCardStrictMode(value: Boolean): Self = this.set("creditCardStrictMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreditCardStrictMode: Self = this.set("creditCardStrictMode", js.undefined)
    @scala.inline
    def setCreditCardType(value: String): Self = this.set("creditCardType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreditCardType: Self = this.set("creditCardType", js.undefined)
    @scala.inline
    def setDate(value: Boolean): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDateMax(value: String): Self = this.set("dateMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateMax: Self = this.set("dateMax", js.undefined)
    @scala.inline
    def setDateMin(value: String): Self = this.set("dateMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateMin: Self = this.set("dateMin", js.undefined)
    @scala.inline
    def setDatePatternVarargs(value: String*): Self = this.set("datePattern", js.Array(value :_*))
    @scala.inline
    def setDatePattern(value: js.Array[String]): Self = this.set("datePattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatePattern: Self = this.set("datePattern", js.undefined)
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setDelimiterLazyShow(value: Boolean): Self = this.set("delimiterLazyShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiterLazyShow: Self = this.set("delimiterLazyShow", js.undefined)
    @scala.inline
    def setDelimitersVarargs(value: String*): Self = this.set("delimiters", js.Array(value :_*))
    @scala.inline
    def setDelimiters(value: js.Array[String]): Self = this.set("delimiters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiters: Self = this.set("delimiters", js.undefined)
    @scala.inline
    def setInitValue(value: js.Any): Self = this.set("initValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitValue: Self = this.set("initValue", js.undefined)
    @scala.inline
    def setLowercase(value: Boolean): Self = this.set("lowercase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowercase: Self = this.set("lowercase", js.undefined)
    @scala.inline
    def setNoImmediatePrefix(value: Boolean): Self = this.set("noImmediatePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoImmediatePrefix: Self = this.set("noImmediatePrefix", js.undefined)
    @scala.inline
    def setNumeral(value: Boolean): Self = this.set("numeral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumeral: Self = this.set("numeral", js.undefined)
    @scala.inline
    def setNumeralDecimalMark(value: String): Self = this.set("numeralDecimalMark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumeralDecimalMark: Self = this.set("numeralDecimalMark", js.undefined)
    @scala.inline
    def setNumeralDecimalScale(value: Double): Self = this.set("numeralDecimalScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumeralDecimalScale: Self = this.set("numeralDecimalScale", js.undefined)
    @scala.inline
    def setNumeralIntegerScale(value: Double): Self = this.set("numeralIntegerScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumeralIntegerScale: Self = this.set("numeralIntegerScale", js.undefined)
    @scala.inline
    def setNumeralPositiveOnly(value: Boolean): Self = this.set("numeralPositiveOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumeralPositiveOnly: Self = this.set("numeralPositiveOnly", js.undefined)
    @scala.inline
    def setNumeralThousandsGroupStyle(value: NumeralThousandsGroupStyleType): Self = this.set("numeralThousandsGroupStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumeralThousandsGroupStyle: Self = this.set("numeralThousandsGroupStyle", js.undefined)
    @scala.inline
    def setNumericOnly(value: Boolean): Self = this.set("numericOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumericOnly: Self = this.set("numericOnly", js.undefined)
    @scala.inline
    def setOnCreditCardTypeChanged(value: CreditCardTypeChangeHandler): Self = this.set("onCreditCardTypeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCreditCardTypeChanged: Self = this.set("onCreditCardTypeChanged", js.undefined)
    @scala.inline
    def setOnValueChanged(value: /* event */ js.Any => Unit): Self = this.set("onValueChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnValueChanged: Self = this.set("onValueChanged", js.undefined)
    @scala.inline
    def setPhone(value: Boolean): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    @scala.inline
    def setPhoneRegionCode(value: String): Self = this.set("phoneRegionCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneRegionCode: Self = this.set("phoneRegionCode", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setRawValueTrimPrefix(value: Boolean): Self = this.set("rawValueTrimPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawValueTrimPrefix: Self = this.set("rawValueTrimPrefix", js.undefined)
    @scala.inline
    def setStripLeadingZeroes(value: Boolean): Self = this.set("stripLeadingZeroes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripLeadingZeroes: Self = this.set("stripLeadingZeroes", js.undefined)
    @scala.inline
    def setTime(value: Boolean): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    @scala.inline
    def setTimeFormat(value: String): Self = this.set("timeFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeFormat: Self = this.set("timeFormat", js.undefined)
    @scala.inline
    def setTimePatternVarargs(value: String*): Self = this.set("timePattern", js.Array(value :_*))
    @scala.inline
    def setTimePattern(value: js.Array[String]): Self = this.set("timePattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePattern: Self = this.set("timePattern", js.undefined)
    @scala.inline
    def setUppercase(value: Boolean): Self = this.set("uppercase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUppercase: Self = this.set("uppercase", js.undefined)
  }
  
}

