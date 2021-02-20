package typings.breeze.breeze

import typings.breeze.breeze.core.EnumSymbol
import typings.breeze.breeze.core.IEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTypeSymbol extends EnumSymbol {
  
  var defaultValue: js.Any = js.native
  
  /** Function to format this DataType for OData queries. */
  def fmtOData(`val`: js.Any): js.Any = js.native
  
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
  implicit class DataTypeSymbolMutableBuilder[Self <: DataTypeSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFmtOData(value: js.Any => js.Any): Self = StObject.set(x, "fmtOData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetConcurrencyValue(value: /* val */ js.Any => _): Self = StObject.set(x, "getConcurrencyValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetConcurrencyValueUndefined: Self = StObject.set(x, "getConcurrencyValue", js.undefined)
    
    @scala.inline
    def setGetNext(value: () => _): Self = StObject.set(x, "getNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNextUndefined: Self = StObject.set(x, "getNext", js.undefined)
    
    @scala.inline
    def setIsDate(value: Boolean): Self = StObject.set(x, "isDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDateUndefined: Self = StObject.set(x, "isDate", js.undefined)
    
    @scala.inline
    def setIsFloat(value: Boolean): Self = StObject.set(x, "isFloat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFloatUndefined: Self = StObject.set(x, "isFloat", js.undefined)
    
    @scala.inline
    def setIsInteger(value: Boolean): Self = StObject.set(x, "isInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIntegerUndefined: Self = StObject.set(x, "isInteger", js.undefined)
    
    @scala.inline
    def setIsNumeric(value: Boolean): Self = StObject.set(x, "isNumeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNumericUndefined: Self = StObject.set(x, "isNumeric", js.undefined)
    
    @scala.inline
    def setNormalize(value: /* val */ js.Any => _): Self = StObject.set(x, "normalize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    
    @scala.inline
    def setParse(value: (/* val */ js.Any, /* sourceTypeName */ js.UndefOr[String]) => _): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
    
    @scala.inline
    def setParseRawValue(value: /* val */ js.Any => _): Self = StObject.set(x, "parseRawValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseRawValueUndefined: Self = StObject.set(x, "parseRawValue", js.undefined)
    
    @scala.inline
    def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    @scala.inline
    def setQuoteJsonOData(value: Boolean): Self = StObject.set(x, "quoteJsonOData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteJsonODataUndefined: Self = StObject.set(x, "quoteJsonOData", js.undefined)
    
    @scala.inline
    def setValidatorCtor(value: js.Any => Validator): Self = StObject.set(x, "validatorCtor", js.Any.fromFunction1(value))
  }
}
