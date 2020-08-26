package typings.awsSdkClientSqsNode.typesMessageAttributeValueMod

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageAttributeValue extends js.Object {
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
  implicit class MessageAttributeValueOps[Self <: MessageAttributeValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataType(value: String): Self = this.set("DataType", value.asInstanceOf[js.Any])
    @scala.inline
    def setBinaryListValuesVarargs(value: (ArrayBuffer | ArrayBufferView | String)*): Self = this.set("BinaryListValues", js.Array(value :_*))
    @scala.inline
    def setBinaryListValues(
      value: (js.Array[ArrayBuffer | ArrayBufferView | String]) | (Iterable[ArrayBuffer | ArrayBufferView | String])
    ): Self = this.set("BinaryListValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinaryListValues: Self = this.set("BinaryListValues", js.undefined)
    @scala.inline
    def setBinaryValue(value: ArrayBuffer | ArrayBufferView | String): Self = this.set("BinaryValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinaryValue: Self = this.set("BinaryValue", js.undefined)
    @scala.inline
    def setStringListValuesVarargs(value: String*): Self = this.set("StringListValues", js.Array(value :_*))
    @scala.inline
    def setStringListValues(value: js.Array[String] | Iterable[String]): Self = this.set("StringListValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringListValues: Self = this.set("StringListValues", js.undefined)
    @scala.inline
    def setStringValue(value: String): Self = this.set("StringValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringValue: Self = this.set("StringValue", js.undefined)
  }
  
}

