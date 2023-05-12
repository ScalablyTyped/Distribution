package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CsvConfiguration extends StObject {
  
  /**
    * Column separator can be one of comma (','), pipe ('|), semicolon (';'), tab('/t'), or blank space (' '). 
    */
  var ColumnSeparator: js.UndefOr[StringValue1] = js.undefined
  
  /**
    * Escape character can be one of 
    */
  var EscapeChar: js.UndefOr[StringValue1] = js.undefined
  
  /**
    * Can be blank space (' ').
    */
  var NullValue: js.UndefOr[StringValue256] = js.undefined
  
  /**
    * Can be single quote (') or double quote (").
    */
  var QuoteChar: js.UndefOr[StringValue1] = js.undefined
  
  /**
    * Specifies to trim leading and trailing white space.
    */
  var TrimWhiteSpace: js.UndefOr[Boolean] = js.undefined
}
object CsvConfiguration {
  
  inline def apply(): CsvConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CsvConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CsvConfiguration] (val x: Self) extends AnyVal {
    
    inline def setColumnSeparator(value: StringValue1): Self = StObject.set(x, "ColumnSeparator", value.asInstanceOf[js.Any])
    
    inline def setColumnSeparatorUndefined: Self = StObject.set(x, "ColumnSeparator", js.undefined)
    
    inline def setEscapeChar(value: StringValue1): Self = StObject.set(x, "EscapeChar", value.asInstanceOf[js.Any])
    
    inline def setEscapeCharUndefined: Self = StObject.set(x, "EscapeChar", js.undefined)
    
    inline def setNullValue(value: StringValue256): Self = StObject.set(x, "NullValue", value.asInstanceOf[js.Any])
    
    inline def setNullValueUndefined: Self = StObject.set(x, "NullValue", js.undefined)
    
    inline def setQuoteChar(value: StringValue1): Self = StObject.set(x, "QuoteChar", value.asInstanceOf[js.Any])
    
    inline def setQuoteCharUndefined: Self = StObject.set(x, "QuoteChar", js.undefined)
    
    inline def setTrimWhiteSpace(value: Boolean): Self = StObject.set(x, "TrimWhiteSpace", value.asInstanceOf[js.Any])
    
    inline def setTrimWhiteSpaceUndefined: Self = StObject.set(x, "TrimWhiteSpace", js.undefined)
  }
}
