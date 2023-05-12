package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageAttributeValue extends StObject {
  
  /**
    * <p>Not implemented. Reserved for future use.</p>
    */
  var BinaryListValues: js.UndefOr[js.Array[js.typedarray.Uint8Array]] = js.undefined
  
  /**
    * <p>Binary type attributes can store any binary data, such as compressed data, encrypted data, or images.</p>
    */
  var BinaryValue: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * <p>Amazon SQS supports the following logical data types: <code>String</code>, <code>Number</code>, and <code>Binary</code>. For the <code>Number</code> data type, you must use <code>StringValue</code>.</p>
    *          <p>You can also append custom labels. For more information, see <a href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-metadata.html#sqs-message-attributes">Amazon SQS Message Attributes</a> in the <i>Amazon SQS Developer Guide</i>.</p>
    */
  var DataType: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Not implemented. Reserved for future use.</p>
    */
  var StringListValues: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * <p>Strings are Unicode with UTF-8 binary encoding. For a list of code values, see <a href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">ASCII Printable Characters</a>.</p>
    */
  var StringValue: js.UndefOr[String] = js.undefined
}
object MessageAttributeValue {
  
  inline def apply(): MessageAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageAttributeValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageAttributeValue] (val x: Self) extends AnyVal {
    
    inline def setBinaryListValues(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "BinaryListValues", value.asInstanceOf[js.Any])
    
    inline def setBinaryListValuesUndefined: Self = StObject.set(x, "BinaryListValues", js.undefined)
    
    inline def setBinaryListValuesVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "BinaryListValues", js.Array(value*))
    
    inline def setBinaryValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "BinaryValue", value.asInstanceOf[js.Any])
    
    inline def setBinaryValueUndefined: Self = StObject.set(x, "BinaryValue", js.undefined)
    
    inline def setDataType(value: String): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "DataType", js.undefined)
    
    inline def setStringListValues(value: js.Array[String]): Self = StObject.set(x, "StringListValues", value.asInstanceOf[js.Any])
    
    inline def setStringListValuesUndefined: Self = StObject.set(x, "StringListValues", js.undefined)
    
    inline def setStringListValuesVarargs(value: String*): Self = StObject.set(x, "StringListValues", js.Array(value*))
    
    inline def setStringValue(value: String): Self = StObject.set(x, "StringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "StringValue", js.undefined)
  }
}
