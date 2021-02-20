package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentAttributeValue extends StObject {
  
  /**
    * A date expressed as an ISO 8601 string.
    */
  var DateValue: js.UndefOr[Timestamp] = js.native
  
  /**
    * A long integer value.
    */
  var LongValue: js.UndefOr[Long] = js.native
  
  /**
    * A list of strings. 
    */
  var StringListValue: js.UndefOr[DocumentAttributeStringListValue] = js.native
  
  /**
    * A string, such as "department".
    */
  var StringValue: js.UndefOr[DocumentAttributeStringValue] = js.native
}
object DocumentAttributeValue {
  
  @scala.inline
  def apply(): DocumentAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentAttributeValue]
  }
  
  @scala.inline
  implicit class DocumentAttributeValueMutableBuilder[Self <: DocumentAttributeValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateValue(value: Timestamp): Self = StObject.set(x, "DateValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateValueUndefined: Self = StObject.set(x, "DateValue", js.undefined)
    
    @scala.inline
    def setLongValue(value: Long): Self = StObject.set(x, "LongValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongValueUndefined: Self = StObject.set(x, "LongValue", js.undefined)
    
    @scala.inline
    def setStringListValue(value: DocumentAttributeStringListValue): Self = StObject.set(x, "StringListValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringListValueUndefined: Self = StObject.set(x, "StringListValue", js.undefined)
    
    @scala.inline
    def setStringListValueVarargs(value: String*): Self = StObject.set(x, "StringListValue", js.Array(value :_*))
    
    @scala.inline
    def setStringValue(value: DocumentAttributeStringValue): Self = StObject.set(x, "StringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "StringValue", js.undefined)
  }
}
