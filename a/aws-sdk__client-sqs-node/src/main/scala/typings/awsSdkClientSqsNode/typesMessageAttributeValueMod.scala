package typings.awsSdkClientSqsNode

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Iterable
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMessageAttributeValueMod {
  
  @js.native
  trait MessageAttributeValue extends StObject {
    
    /**
      * <p>Not implemented. Reserved for future use.</p>
      */
    var BinaryListValues: js.UndefOr[
        (js.Array[ArrayBuffer | ArrayBufferView | String]) | (Iterable[ArrayBuffer | ArrayBufferView | String])
      ] = js.native
    
    /**
      * <p>Binary type attributes can store any binary data, such as compressed data, encrypted data, or images.</p>
      */
    var BinaryValue: js.UndefOr[ArrayBuffer | ArrayBufferView | String] = js.native
    
    /**
      * <p>Amazon SQS supports the following logical data types: <code>String</code>, <code>Number</code>, and <code>Binary</code>. For the <code>Number</code> data type, you must use <code>StringValue</code>.</p> <p>You can also append custom labels. For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html">Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p>
      */
    var DataType: String = js.native
    
    /**
      * <p>Not implemented. Reserved for future use.</p>
      */
    var StringListValues: js.UndefOr[js.Array[String] | Iterable[String]] = js.native
    
    /**
      * <p>Strings are Unicode with UTF-8 binary encoding. For a list of code values, see <a href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">ASCII Printable Characters</a>.</p>
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
      def setBinaryListValues(
        value: (js.Array[ArrayBuffer | ArrayBufferView | String]) | (Iterable[ArrayBuffer | ArrayBufferView | String])
      ): Self = StObject.set(x, "BinaryListValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryListValuesUndefined: Self = StObject.set(x, "BinaryListValues", js.undefined)
      
      @scala.inline
      def setBinaryListValuesVarargs(value: (ArrayBuffer | ArrayBufferView | String)*): Self = StObject.set(x, "BinaryListValues", js.Array(value :_*))
      
      @scala.inline
      def setBinaryValue(value: ArrayBuffer | ArrayBufferView | String): Self = StObject.set(x, "BinaryValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryValueUndefined: Self = StObject.set(x, "BinaryValue", js.undefined)
      
      @scala.inline
      def setDataType(value: String): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringListValues(value: js.Array[String] | Iterable[String]): Self = StObject.set(x, "StringListValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringListValuesUndefined: Self = StObject.set(x, "StringListValues", js.undefined)
      
      @scala.inline
      def setStringListValuesVarargs(value: String*): Self = StObject.set(x, "StringListValues", js.Array(value :_*))
      
      @scala.inline
      def setStringValue(value: String): Self = StObject.set(x, "StringValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringValueUndefined: Self = StObject.set(x, "StringValue", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledMessageAttributeValue extends MessageAttributeValue {
    
    /**
      * <p>Not implemented. Reserved for future use.</p>
      */
    @JSName("BinaryListValues")
    var BinaryListValues_UnmarshalledMessageAttributeValue: js.UndefOr[js.Array[Uint8Array]] = js.native
    
    /**
      * <p>Binary type attributes can store any binary data, such as compressed data, encrypted data, or images.</p>
      */
    @JSName("BinaryValue")
    var BinaryValue_UnmarshalledMessageAttributeValue: js.UndefOr[Uint8Array] = js.native
    
    /**
      * <p>Not implemented. Reserved for future use.</p>
      */
    @JSName("StringListValues")
    var StringListValues_UnmarshalledMessageAttributeValue: js.UndefOr[js.Array[String]] = js.native
  }
  object UnmarshalledMessageAttributeValue {
    
    @scala.inline
    def apply(DataType: String): UnmarshalledMessageAttributeValue = {
      val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledMessageAttributeValue]
    }
    
    @scala.inline
    implicit class UnmarshalledMessageAttributeValueMutableBuilder[Self <: UnmarshalledMessageAttributeValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinaryListValues(value: js.Array[Uint8Array]): Self = StObject.set(x, "BinaryListValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryListValuesUndefined: Self = StObject.set(x, "BinaryListValues", js.undefined)
      
      @scala.inline
      def setBinaryListValuesVarargs(value: Uint8Array*): Self = StObject.set(x, "BinaryListValues", js.Array(value :_*))
      
      @scala.inline
      def setBinaryValue(value: Uint8Array): Self = StObject.set(x, "BinaryValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryValueUndefined: Self = StObject.set(x, "BinaryValue", js.undefined)
      
      @scala.inline
      def setStringListValues(value: js.Array[String]): Self = StObject.set(x, "StringListValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringListValuesUndefined: Self = StObject.set(x, "StringListValues", js.undefined)
      
      @scala.inline
      def setStringListValuesVarargs(value: String*): Self = StObject.set(x, "StringListValues", js.Array(value :_*))
    }
  }
}
