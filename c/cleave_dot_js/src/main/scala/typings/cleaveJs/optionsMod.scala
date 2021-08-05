package typings.cleaveJs

import typings.cleaveJs.creditCardMod.CreditCardTypeChangeHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  trait CleaveOptions extends StObject {
    
    var blocks: js.UndefOr[js.Array[Double]] = js.undefined
    
    var copyDelimiter: js.UndefOr[Boolean] = js.undefined
    
    var creditCard: js.UndefOr[Boolean] = js.undefined
    
    var creditCardStrictMode: js.UndefOr[Boolean] = js.undefined
    
    var creditCardType: js.UndefOr[String] = js.undefined
    
    var date: js.UndefOr[Boolean] = js.undefined
    
    var dateMax: js.UndefOr[String] = js.undefined
    
    var dateMin: js.UndefOr[String] = js.undefined
    
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
    
    var timeFormat: js.UndefOr[String] = js.undefined
    
    var timePattern: js.UndefOr[js.Array[String]] = js.undefined
    
    var uppercase: js.UndefOr[Boolean] = js.undefined
  }
  object CleaveOptions {
    
    inline def apply(): CleaveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CleaveOptions]
    }
    
    extension [Self <: CleaveOptions](x: Self) {
      
      inline def setBlocks(value: js.Array[Double]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setBlocksUndefined: Self = StObject.set(x, "blocks", js.undefined)
      
      inline def setBlocksVarargs(value: Double*): Self = StObject.set(x, "blocks", js.Array(value :_*))
      
      inline def setCopyDelimiter(value: Boolean): Self = StObject.set(x, "copyDelimiter", value.asInstanceOf[js.Any])
      
      inline def setCopyDelimiterUndefined: Self = StObject.set(x, "copyDelimiter", js.undefined)
      
      inline def setCreditCard(value: Boolean): Self = StObject.set(x, "creditCard", value.asInstanceOf[js.Any])
      
      inline def setCreditCardStrictMode(value: Boolean): Self = StObject.set(x, "creditCardStrictMode", value.asInstanceOf[js.Any])
      
      inline def setCreditCardStrictModeUndefined: Self = StObject.set(x, "creditCardStrictMode", js.undefined)
      
      inline def setCreditCardType(value: String): Self = StObject.set(x, "creditCardType", value.asInstanceOf[js.Any])
      
      inline def setCreditCardTypeUndefined: Self = StObject.set(x, "creditCardType", js.undefined)
      
      inline def setCreditCardUndefined: Self = StObject.set(x, "creditCard", js.undefined)
      
      inline def setDate(value: Boolean): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateMax(value: String): Self = StObject.set(x, "dateMax", value.asInstanceOf[js.Any])
      
      inline def setDateMaxUndefined: Self = StObject.set(x, "dateMax", js.undefined)
      
      inline def setDateMin(value: String): Self = StObject.set(x, "dateMin", value.asInstanceOf[js.Any])
      
      inline def setDateMinUndefined: Self = StObject.set(x, "dateMin", js.undefined)
      
      inline def setDatePattern(value: js.Array[String]): Self = StObject.set(x, "datePattern", value.asInstanceOf[js.Any])
      
      inline def setDatePatternUndefined: Self = StObject.set(x, "datePattern", js.undefined)
      
      inline def setDatePatternVarargs(value: String*): Self = StObject.set(x, "datePattern", js.Array(value :_*))
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterLazyShow(value: Boolean): Self = StObject.set(x, "delimiterLazyShow", value.asInstanceOf[js.Any])
      
      inline def setDelimiterLazyShowUndefined: Self = StObject.set(x, "delimiterLazyShow", js.undefined)
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setDelimiters(value: js.Array[String]): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      inline def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
      
      inline def setDelimitersVarargs(value: String*): Self = StObject.set(x, "delimiters", js.Array(value :_*))
      
      inline def setInitValue(value: js.Any): Self = StObject.set(x, "initValue", value.asInstanceOf[js.Any])
      
      inline def setInitValueUndefined: Self = StObject.set(x, "initValue", js.undefined)
      
      inline def setLowercase(value: Boolean): Self = StObject.set(x, "lowercase", value.asInstanceOf[js.Any])
      
      inline def setLowercaseUndefined: Self = StObject.set(x, "lowercase", js.undefined)
      
      inline def setNoImmediatePrefix(value: Boolean): Self = StObject.set(x, "noImmediatePrefix", value.asInstanceOf[js.Any])
      
      inline def setNoImmediatePrefixUndefined: Self = StObject.set(x, "noImmediatePrefix", js.undefined)
      
      inline def setNumeral(value: Boolean): Self = StObject.set(x, "numeral", value.asInstanceOf[js.Any])
      
      inline def setNumeralDecimalMark(value: String): Self = StObject.set(x, "numeralDecimalMark", value.asInstanceOf[js.Any])
      
      inline def setNumeralDecimalMarkUndefined: Self = StObject.set(x, "numeralDecimalMark", js.undefined)
      
      inline def setNumeralDecimalScale(value: Double): Self = StObject.set(x, "numeralDecimalScale", value.asInstanceOf[js.Any])
      
      inline def setNumeralDecimalScaleUndefined: Self = StObject.set(x, "numeralDecimalScale", js.undefined)
      
      inline def setNumeralIntegerScale(value: Double): Self = StObject.set(x, "numeralIntegerScale", value.asInstanceOf[js.Any])
      
      inline def setNumeralIntegerScaleUndefined: Self = StObject.set(x, "numeralIntegerScale", js.undefined)
      
      inline def setNumeralPositiveOnly(value: Boolean): Self = StObject.set(x, "numeralPositiveOnly", value.asInstanceOf[js.Any])
      
      inline def setNumeralPositiveOnlyUndefined: Self = StObject.set(x, "numeralPositiveOnly", js.undefined)
      
      inline def setNumeralThousandsGroupStyle(value: NumeralThousandsGroupStyleType): Self = StObject.set(x, "numeralThousandsGroupStyle", value.asInstanceOf[js.Any])
      
      inline def setNumeralThousandsGroupStyleUndefined: Self = StObject.set(x, "numeralThousandsGroupStyle", js.undefined)
      
      inline def setNumeralUndefined: Self = StObject.set(x, "numeral", js.undefined)
      
      inline def setNumericOnly(value: Boolean): Self = StObject.set(x, "numericOnly", value.asInstanceOf[js.Any])
      
      inline def setNumericOnlyUndefined: Self = StObject.set(x, "numericOnly", js.undefined)
      
      inline def setOnCreditCardTypeChanged(value: CreditCardTypeChangeHandler): Self = StObject.set(x, "onCreditCardTypeChanged", value.asInstanceOf[js.Any])
      
      inline def setOnCreditCardTypeChangedUndefined: Self = StObject.set(x, "onCreditCardTypeChanged", js.undefined)
      
      inline def setOnValueChanged(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onValueChanged", js.Any.fromFunction1(value))
      
      inline def setOnValueChangedUndefined: Self = StObject.set(x, "onValueChanged", js.undefined)
      
      inline def setPhone(value: Boolean): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneRegionCode(value: String): Self = StObject.set(x, "phoneRegionCode", value.asInstanceOf[js.Any])
      
      inline def setPhoneRegionCodeUndefined: Self = StObject.set(x, "phoneRegionCode", js.undefined)
      
      inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRawValueTrimPrefix(value: Boolean): Self = StObject.set(x, "rawValueTrimPrefix", value.asInstanceOf[js.Any])
      
      inline def setRawValueTrimPrefixUndefined: Self = StObject.set(x, "rawValueTrimPrefix", js.undefined)
      
      inline def setStripLeadingZeroes(value: Boolean): Self = StObject.set(x, "stripLeadingZeroes", value.asInstanceOf[js.Any])
      
      inline def setStripLeadingZeroesUndefined: Self = StObject.set(x, "stripLeadingZeroes", js.undefined)
      
      inline def setTime(value: Boolean): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeFormat(value: String): Self = StObject.set(x, "timeFormat", value.asInstanceOf[js.Any])
      
      inline def setTimeFormatUndefined: Self = StObject.set(x, "timeFormat", js.undefined)
      
      inline def setTimePattern(value: js.Array[String]): Self = StObject.set(x, "timePattern", value.asInstanceOf[js.Any])
      
      inline def setTimePatternUndefined: Self = StObject.set(x, "timePattern", js.undefined)
      
      inline def setTimePatternVarargs(value: String*): Self = StObject.set(x, "timePattern", js.Array(value :_*))
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      inline def setUppercase(value: Boolean): Self = StObject.set(x, "uppercase", value.asInstanceOf[js.Any])
      
      inline def setUppercaseUndefined: Self = StObject.set(x, "uppercase", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cleaveJs.cleaveJsStrings.lakh
    - typings.cleaveJs.cleaveJsStrings.thousand
    - typings.cleaveJs.cleaveJsStrings.wan
    - typings.cleaveJs.cleaveJsStrings.none
  */
  trait NumeralThousandsGroupStyleType extends StObject
  object NumeralThousandsGroupStyleType {
    
    inline def lakh: typings.cleaveJs.cleaveJsStrings.lakh = "lakh".asInstanceOf[typings.cleaveJs.cleaveJsStrings.lakh]
    
    inline def none: typings.cleaveJs.cleaveJsStrings.none = "none".asInstanceOf[typings.cleaveJs.cleaveJsStrings.none]
    
    inline def thousand: typings.cleaveJs.cleaveJsStrings.thousand = "thousand".asInstanceOf[typings.cleaveJs.cleaveJsStrings.thousand]
    
    inline def wan: typings.cleaveJs.cleaveJsStrings.wan = "wan".asInstanceOf[typings.cleaveJs.cleaveJsStrings.wan]
  }
}
