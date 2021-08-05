package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentAttributeValue extends StObject {
  
  /**
    * A date expressed as an ISO 8601 string.
    */
  var DateValue: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * A long integer value.
    */
  var LongValue: js.UndefOr[Long] = js.undefined
  
  /**
    * A list of strings. 
    */
  var StringListValue: js.UndefOr[DocumentAttributeStringListValue] = js.undefined
  
  /**
    * A string, such as "department".
    */
  var StringValue: js.UndefOr[DocumentAttributeStringValue] = js.undefined
}
object DocumentAttributeValue {
  
  inline def apply(): DocumentAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentAttributeValue]
  }
  
  extension [Self <: DocumentAttributeValue](x: Self) {
    
    inline def setDateValue(value: Timestamp): Self = StObject.set(x, "DateValue", value.asInstanceOf[js.Any])
    
    inline def setDateValueUndefined: Self = StObject.set(x, "DateValue", js.undefined)
    
    inline def setLongValue(value: Long): Self = StObject.set(x, "LongValue", value.asInstanceOf[js.Any])
    
    inline def setLongValueUndefined: Self = StObject.set(x, "LongValue", js.undefined)
    
    inline def setStringListValue(value: DocumentAttributeStringListValue): Self = StObject.set(x, "StringListValue", value.asInstanceOf[js.Any])
    
    inline def setStringListValueUndefined: Self = StObject.set(x, "StringListValue", js.undefined)
    
    inline def setStringListValueVarargs(value: String*): Self = StObject.set(x, "StringListValue", js.Array(value :_*))
    
    inline def setStringValue(value: DocumentAttributeStringValue): Self = StObject.set(x, "StringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "StringValue", js.undefined)
  }
}
