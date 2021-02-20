package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageAttributeValue extends StObject {
  
  /**
    * Binary type attributes can store any binary data, for example, compressed data, encrypted data, or images.
    */
  var BinaryValue: js.UndefOr[Binary] = js.native
  
  /**
    * Amazon SNS supports the following logical data types: String, String.Array, Number, and Binary. For more information, see Message Attribute Data Types.
    */
  var DataType: String = js.native
  
  /**
    * Strings are Unicode with UTF8 binary encoding. For a list of code values, see ASCII Printable Characters.
    */
  var StringValue: js.UndefOr[String] = js.native
}
object MessageAttributeValue {
  
  @scala.inline
  def apply(DataType: String): MessageAttributeValue = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageAttributeValue]
  }
  
  @scala.inline
  implicit class MessageAttributeValueMutableBuilder[Self <: MessageAttributeValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinaryValue(value: Binary): Self = StObject.set(x, "BinaryValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryValueUndefined: Self = StObject.set(x, "BinaryValue", js.undefined)
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValue(value: String): Self = StObject.set(x, "StringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "StringValue", js.undefined)
  }
}
