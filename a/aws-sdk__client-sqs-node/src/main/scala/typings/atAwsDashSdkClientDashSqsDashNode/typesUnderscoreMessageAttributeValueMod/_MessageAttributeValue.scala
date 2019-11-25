package typings.atAwsDashSdkClientDashSqsDashNode.typesUnderscoreMessageAttributeValueMod

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _MessageAttributeValue extends js.Object {
  /**
    * <p>Not implemented. Reserved for future use.</p>
    */
  var BinaryListValues: js.UndefOr[
    (js.Array[ArrayBuffer | ArrayBufferView | String]) | (Iterable[ArrayBuffer | ArrayBufferView | String])
  ] = js.undefined
  /**
    * <p>Binary type attributes can store any binary data, such as compressed data, encrypted data, or images.</p>
    */
  var BinaryValue: js.UndefOr[ArrayBuffer | ArrayBufferView | String] = js.undefined
  /**
    * <p>Amazon SQS supports the following logical data types: <code>String</code>, <code>Number</code>, and <code>Binary</code>. For the <code>Number</code> data type, you must use <code>StringValue</code>.</p> <p>You can also append custom labels. For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html">Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p>
    */
  var DataType: String
  /**
    * <p>Not implemented. Reserved for future use.</p>
    */
  var StringListValues: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
  /**
    * <p>Strings are Unicode with UTF-8 binary encoding. For a list of code values, see <a href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">ASCII Printable Characters</a>.</p>
    */
  var StringValue: js.UndefOr[String] = js.undefined
}

object _MessageAttributeValue {
  @scala.inline
  def apply(
    DataType: String,
    BinaryListValues: (js.Array[ArrayBuffer | ArrayBufferView | String]) | (Iterable[ArrayBuffer | ArrayBufferView | String]) = null,
    BinaryValue: ArrayBuffer | ArrayBufferView | String = null,
    StringListValues: js.Array[String] | Iterable[String] = null,
    StringValue: String = null
  ): _MessageAttributeValue = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any])
    if (BinaryListValues != null) __obj.updateDynamic("BinaryListValues")(BinaryListValues.asInstanceOf[js.Any])
    if (BinaryValue != null) __obj.updateDynamic("BinaryValue")(BinaryValue.asInstanceOf[js.Any])
    if (StringListValues != null) __obj.updateDynamic("StringListValues")(StringListValues.asInstanceOf[js.Any])
    if (StringValue != null) __obj.updateDynamic("StringValue")(StringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[_MessageAttributeValue]
  }
}

