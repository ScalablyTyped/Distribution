package typings.cleaveDotJs.optionsMod

import typings.cleaveDotJs.optionsCreditCardMod.CreditCardTypeChangeHandler
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
    if (blocks != null) __obj.updateDynamic("blocks")(blocks)
    if (!js.isUndefined(copyDelimiter)) __obj.updateDynamic("copyDelimiter")(copyDelimiter)
    if (!js.isUndefined(creditCard)) __obj.updateDynamic("creditCard")(creditCard)
    if (!js.isUndefined(creditCardStrictMode)) __obj.updateDynamic("creditCardStrictMode")(creditCardStrictMode)
    if (creditCardType != null) __obj.updateDynamic("creditCardType")(creditCardType)
    if (!js.isUndefined(date)) __obj.updateDynamic("date")(date)
    if (datePattern != null) __obj.updateDynamic("datePattern")(datePattern)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters)
    if (initValue != null) __obj.updateDynamic("initValue")(initValue)
    if (!js.isUndefined(lowercase)) __obj.updateDynamic("lowercase")(lowercase)
    if (!js.isUndefined(noImmediatePrefix)) __obj.updateDynamic("noImmediatePrefix")(noImmediatePrefix)
    if (!js.isUndefined(numeral)) __obj.updateDynamic("numeral")(numeral)
    if (numeralDecimalMark != null) __obj.updateDynamic("numeralDecimalMark")(numeralDecimalMark)
    if (numeralDecimalScale != null) __obj.updateDynamic("numeralDecimalScale")(numeralDecimalScale.asInstanceOf[js.Any])
    if (numeralIntegerScale != null) __obj.updateDynamic("numeralIntegerScale")(numeralIntegerScale.asInstanceOf[js.Any])
    if (!js.isUndefined(numeralPositiveOnly)) __obj.updateDynamic("numeralPositiveOnly")(numeralPositiveOnly)
    if (numeralThousandsGroupStyle != null) __obj.updateDynamic("numeralThousandsGroupStyle")(numeralThousandsGroupStyle)
    if (!js.isUndefined(numericOnly)) __obj.updateDynamic("numericOnly")(numericOnly)
    if (onCreditCardTypeChanged != null) __obj.updateDynamic("onCreditCardTypeChanged")(onCreditCardTypeChanged)
    if (onValueChanged != null) __obj.updateDynamic("onValueChanged")(js.Any.fromFunction1(onValueChanged))
    if (!js.isUndefined(phone)) __obj.updateDynamic("phone")(phone)
    if (phoneRegionCode != null) __obj.updateDynamic("phoneRegionCode")(phoneRegionCode)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(rawValueTrimPrefix)) __obj.updateDynamic("rawValueTrimPrefix")(rawValueTrimPrefix)
    if (!js.isUndefined(stripLeadingZeroes)) __obj.updateDynamic("stripLeadingZeroes")(stripLeadingZeroes)
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time)
    if (timePattern != null) __obj.updateDynamic("timePattern")(timePattern)
    if (!js.isUndefined(uppercase)) __obj.updateDynamic("uppercase")(uppercase)
    __obj.asInstanceOf[CleaveOptions]
  }
}

