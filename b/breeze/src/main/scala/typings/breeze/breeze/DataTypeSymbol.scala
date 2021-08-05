package typings.breeze.breeze

import typings.breeze.breeze.core.EnumSymbol
import typings.breeze.breeze.core.IEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTypeSymbol
  extends StObject
     with EnumSymbol {
  
  var defaultValue: js.Any
  
  /** Function to format this DataType for OData queries. */
  def fmtOData(`val`: js.Any): js.Any
  
  /** Optional function to get the next value when the datatype is used as a concurrency property. */
  var getConcurrencyValue: js.UndefOr[js.Function1[/* val */ js.Any, js.Any]] = js.undefined
  
  /** Optional function to get the next value for key generation, if this datatype is used as a key.  Uses an internal table of previous values. */
  var getNext: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var isDate: js.UndefOr[Boolean] = js.undefined
  
  var isFloat: js.UndefOr[Boolean] = js.undefined
  
  var isInteger: js.UndefOr[Boolean] = js.undefined
  
  var isNumeric: js.UndefOr[Boolean] = js.undefined
  
  /** Optional function to normalize a data value for comparison, if its value cannot be used directly.  Note that this will be called each time a property is changed, so make it fast. */
  var normalize: js.UndefOr[js.Function1[/* val */ js.Any, js.Any]] = js.undefined
  
  /** Function to convert a value from string to this DataType.  Note that this will be called each time a property is changed, so make it fast. */
  var parse: js.UndefOr[js.Function2[/* val */ js.Any, /* sourceTypeName */ js.UndefOr[String], js.Any]] = js.undefined
  
  /** Optional function to convert a raw (server) value from string to this DataType. */
  var parseRawValue: js.UndefOr[js.Function1[/* val */ js.Any, js.Any]] = js.undefined
  
  var quoteJsonOData: js.UndefOr[Boolean] = js.undefined
  
  def validatorCtor(context: js.Any): Validator
}
object DataTypeSymbol {
  
  inline def apply(
    defaultValue: js.Any,
    fmtOData: js.Any => js.Any,
    getName: () => String,
    parentEnum: IEnum,
    validatorCtor: js.Any => Validator
  ): DataTypeSymbol = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], fmtOData = js.Any.fromFunction1(fmtOData), getName = js.Any.fromFunction0(getName), parentEnum = parentEnum.asInstanceOf[js.Any], validatorCtor = js.Any.fromFunction1(validatorCtor))
    __obj.asInstanceOf[DataTypeSymbol]
  }
  
  extension [Self <: DataTypeSymbol](x: Self) {
    
    inline def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setFmtOData(value: js.Any => js.Any): Self = StObject.set(x, "fmtOData", js.Any.fromFunction1(value))
    
    inline def setGetConcurrencyValue(value: /* val */ js.Any => js.Any): Self = StObject.set(x, "getConcurrencyValue", js.Any.fromFunction1(value))
    
    inline def setGetConcurrencyValueUndefined: Self = StObject.set(x, "getConcurrencyValue", js.undefined)
    
    inline def setGetNext(value: () => js.Any): Self = StObject.set(x, "getNext", js.Any.fromFunction0(value))
    
    inline def setGetNextUndefined: Self = StObject.set(x, "getNext", js.undefined)
    
    inline def setIsDate(value: Boolean): Self = StObject.set(x, "isDate", value.asInstanceOf[js.Any])
    
    inline def setIsDateUndefined: Self = StObject.set(x, "isDate", js.undefined)
    
    inline def setIsFloat(value: Boolean): Self = StObject.set(x, "isFloat", value.asInstanceOf[js.Any])
    
    inline def setIsFloatUndefined: Self = StObject.set(x, "isFloat", js.undefined)
    
    inline def setIsInteger(value: Boolean): Self = StObject.set(x, "isInteger", value.asInstanceOf[js.Any])
    
    inline def setIsIntegerUndefined: Self = StObject.set(x, "isInteger", js.undefined)
    
    inline def setIsNumeric(value: Boolean): Self = StObject.set(x, "isNumeric", value.asInstanceOf[js.Any])
    
    inline def setIsNumericUndefined: Self = StObject.set(x, "isNumeric", js.undefined)
    
    inline def setNormalize(value: /* val */ js.Any => js.Any): Self = StObject.set(x, "normalize", js.Any.fromFunction1(value))
    
    inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    
    inline def setParse(value: (/* val */ js.Any, /* sourceTypeName */ js.UndefOr[String]) => js.Any): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
    
    inline def setParseRawValue(value: /* val */ js.Any => js.Any): Self = StObject.set(x, "parseRawValue", js.Any.fromFunction1(value))
    
    inline def setParseRawValueUndefined: Self = StObject.set(x, "parseRawValue", js.undefined)
    
    inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    inline def setQuoteJsonOData(value: Boolean): Self = StObject.set(x, "quoteJsonOData", value.asInstanceOf[js.Any])
    
    inline def setQuoteJsonODataUndefined: Self = StObject.set(x, "quoteJsonOData", js.undefined)
    
    inline def setValidatorCtor(value: js.Any => Validator): Self = StObject.set(x, "validatorCtor", js.Any.fromFunction1(value))
  }
}
