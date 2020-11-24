package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageAttributeValue extends js.Object {
  
  /**
    * Not implemented. Reserved for future use.
    */
  var BinaryListValues: js.UndefOr[BinaryList] = js.native
  
  /**
    * Binary type attributes can store any binary data, such as compressed data, encrypted data, or images.
    */
  var BinaryValue: js.UndefOr[Binary] = js.native
  
  /**
    * Amazon SQS supports the following logical data types: String, Number, and Binary. For the Number data type, you must use StringValue. You can also append custom labels. For more information, see Amazon SQS Message Attributes in the Amazon Simple Queue Service Developer Guide.
    */
  var DataType: String = js.native
  
  /**
    * Not implemented. Reserved for future use.
    */
  var StringListValues: js.UndefOr[StringList] = js.native
  
  /**
    * Strings are Unicode with UTF-8 binary encoding. For a list of code values, see ASCII Printable Characters.
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
  implicit class MessageAttributeValueOps[Self <: MessageAttributeValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataType(value: String): Self = this.set("DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryListValuesVarargs(value: Binary*): Self = this.set("BinaryListValues", js.Array(value :_*))
    
    @scala.inline
    def setBinaryListValues(value: BinaryList): Self = this.set("BinaryListValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaryListValues: Self = this.set("BinaryListValues", js.undefined)
    
    @scala.inline
    def setBinaryValue(value: Binary): Self = this.set("BinaryValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaryValue: Self = this.set("BinaryValue", js.undefined)
    
    @scala.inline
    def setStringListValuesVarargs(value: String*): Self = this.set("StringListValues", js.Array(value :_*))
    
    @scala.inline
    def setStringListValues(value: StringList): Self = this.set("StringListValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringListValues: Self = this.set("StringListValues", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = this.set("StringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringValue: Self = this.set("StringValue", js.undefined)
  }
}
