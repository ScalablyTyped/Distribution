package typings.cleaveJs.optionsMod

import typings.cleaveJs.creditCardMod.CreditCardTypeChangeHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CleaveOptions extends js.Object {
  var blocks: js.UndefOr[js.Array[Double]] = js.undefined
  var copyDelimiter: js.UndefOr[Boolean] = js.undefined
  var creditCard: js.UndefOr[Boolean] = js.undefined
  var creditCardStrictMode: js.UndefOr[Boolean] = js.undefined
  var creditCardType: js.UndefOr[String] = js.undefined
  var date: js.UndefOr[Boolean] = js.undefined
  var datePattern: js.UndefOr[js.Array[String]] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
  var delimiterLazyShow: js.UndefOr[Boolean] = js.undefined
  var delimiters: js.UndefOr[js.Array[String]] = js.undefined
  var initValue: js.UndefOr[js.Any] = js.undefined
  var lowercase: js.UndefOr[Boolean] = js.undefined
  var noImmediatePrefix: js.UndefOr[Boolean] = js.undefined
  var numeral: js.UndefOr[Boolean] = js.undefined
  var numeralDecimalMark: js.UndefOr[String] = js.undefined
  var numeralDecimalScale: js.UndefOr[Double] = js.undefined
  var numeralIntegerScale: js.UndefOr[Double] = js.undefined
  var numeralPositiveOnly: js.UndefOr[Boolean] = js.undefined
  var numeralThousandsGroupStyle: js.UndefOr[NumeralThousandsGroupStyleType] = js.undefined
  var numericOnly: js.UndefOr[Boolean] = js.undefined
  var onCreditCardTypeChanged: js.UndefOr[CreditCardTypeChangeHandler] = js.undefined
  var onValueChanged: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
  var phone: js.UndefOr[Boolean] = js.undefined
  var phoneRegionCode: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var rawValueTrimPrefix: js.UndefOr[Boolean] = js.undefined
  var stripLeadingZeroes: js.UndefOr[Boolean] = js.undefined
  var time: js.UndefOr[Boolean] = js.undefined
  var timePattern: js.UndefOr[js.Array[String]] = js.undefined
  var uppercase: js.UndefOr[Boolean] = js.undefined
}

object CleaveOptions {
  @scala.inline
  def apply(
    blocks: js.Array[Double] = null,
    copyDelimiter: js.UndefOr[Boolean] = js.undefined,
    creditCard: js.UndefOr[Boolean] = js.undefined,
    creditCardStrictMode: js.UndefOr[Boolean] = js.undefined,
    creditCardType: String = null,
    date: js.UndefOr[Boolean] = js.undefined,
    datePattern: js.Array[String] = null,
    delimiter: String = null,
    delimiterLazyShow: js.UndefOr[Boolean] = js.undefined,
    delimiters: js.Array[String] = null,
    initValue: js.Any = null,
    lowercase: js.UndefOr[Boolean] = js.undefined,
    noImmediatePrefix: js.UndefOr[Boolean] = js.undefined,
    numeral: js.UndefOr[Boolean] = js.undefined,
    numeralDecimalMark: String = null,
    numeralDecimalScale: Int | Double = null,
    numeralIntegerScale: Int | Double = null,
    numeralPositiveOnly: js.UndefOr[Boolean] = js.undefined,
    numeralThousandsGroupStyle: NumeralThousandsGroupStyleType = null,
    numericOnly: js.UndefOr[Boolean] = js.undefined,
    onCreditCardTypeChanged: CreditCardTypeChangeHandler = null,
    onValueChanged: /* event */ js.Any => Unit = null,
    phone: js.UndefOr[Boolean] = js.undefined,
    phoneRegionCode: String = null,
    prefix: String = null,
    rawValueTrimPrefix: js.UndefOr[Boolean] = js.undefined,
    stripLeadingZeroes: js.UndefOr[Boolean] = js.undefined,
    time: js.UndefOr[Boolean] = js.undefined,
    timePattern: js.Array[String] = null,
    uppercase: js.UndefOr[Boolean] = js.undefined
  ): CleaveOptions = {
    val __obj = js.Dynamic.literal()
    if (blocks != null) __obj.updateDynamic("blocks")(blocks.asInstanceOf[js.Any])
    if (!js.isUndefined(copyDelimiter)) __obj.updateDynamic("copyDelimiter")(copyDelimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(creditCard)) __obj.updateDynamic("creditCard")(creditCard.asInstanceOf[js.Any])
    if (!js.isUndefined(creditCardStrictMode)) __obj.updateDynamic("creditCardStrictMode")(creditCardStrictMode.asInstanceOf[js.Any])
    if (creditCardType != null) __obj.updateDynamic("creditCardType")(creditCardType.asInstanceOf[js.Any])
    if (!js.isUndefined(date)) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (datePattern != null) __obj.updateDynamic("datePattern")(datePattern.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(delimiterLazyShow)) __obj.updateDynamic("delimiterLazyShow")(delimiterLazyShow.asInstanceOf[js.Any])
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters.asInstanceOf[js.Any])
    if (initValue != null) __obj.updateDynamic("initValue")(initValue.asInstanceOf[js.Any])
    if (!js.isUndefined(lowercase)) __obj.updateDynamic("lowercase")(lowercase.asInstanceOf[js.Any])
    if (!js.isUndefined(noImmediatePrefix)) __obj.updateDynamic("noImmediatePrefix")(noImmediatePrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(numeral)) __obj.updateDynamic("numeral")(numeral.asInstanceOf[js.Any])
    if (numeralDecimalMark != null) __obj.updateDynamic("numeralDecimalMark")(numeralDecimalMark.asInstanceOf[js.Any])
    if (numeralDecimalScale != null) __obj.updateDynamic("numeralDecimalScale")(numeralDecimalScale.asInstanceOf[js.Any])
    if (numeralIntegerScale != null) __obj.updateDynamic("numeralIntegerScale")(numeralIntegerScale.asInstanceOf[js.Any])
    if (!js.isUndefined(numeralPositiveOnly)) __obj.updateDynamic("numeralPositiveOnly")(numeralPositiveOnly.asInstanceOf[js.Any])
    if (numeralThousandsGroupStyle != null) __obj.updateDynamic("numeralThousandsGroupStyle")(numeralThousandsGroupStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(numericOnly)) __obj.updateDynamic("numericOnly")(numericOnly.asInstanceOf[js.Any])
    if (onCreditCardTypeChanged != null) __obj.updateDynamic("onCreditCardTypeChanged")(onCreditCardTypeChanged.asInstanceOf[js.Any])
    if (onValueChanged != null) __obj.updateDynamic("onValueChanged")(js.Any.fromFunction1(onValueChanged))
    if (!js.isUndefined(phone)) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (phoneRegionCode != null) __obj.updateDynamic("phoneRegionCode")(phoneRegionCode.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(rawValueTrimPrefix)) __obj.updateDynamic("rawValueTrimPrefix")(rawValueTrimPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(stripLeadingZeroes)) __obj.updateDynamic("stripLeadingZeroes")(stripLeadingZeroes.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (timePattern != null) __obj.updateDynamic("timePattern")(timePattern.asInstanceOf[js.Any])
    if (!js.isUndefined(uppercase)) __obj.updateDynamic("uppercase")(uppercase.asInstanceOf[js.Any])
    __obj.asInstanceOf[CleaveOptions]
  }
}

