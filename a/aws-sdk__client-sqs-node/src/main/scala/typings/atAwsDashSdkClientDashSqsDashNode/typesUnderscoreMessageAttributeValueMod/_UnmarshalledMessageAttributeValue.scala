package typings.atAwsDashSdkClientDashSqsDashNode.typesUnderscoreMessageAttributeValueMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledMessageAttributeValue extends _MessageAttributeValue {
  /**
    * <p>Not implemented. Reserved for future use.</p>
    */
  @JSName("BinaryListValues")
  var BinaryListValues__UnmarshalledMessageAttributeValue: js.UndefOr[js.Array[Uint8Array]] = js.undefined
  /**
    * <p>Binary type attributes can store any binary data, such as compressed data, encrypted data, or images.</p>
    */
  @JSName("BinaryValue")
  var BinaryValue__UnmarshalledMessageAttributeValue: js.UndefOr[Uint8Array] = js.undefined
  /**
    * <p>Not implemented. Reserved for future use.</p>
    */
  @JSName("StringListValues")
  var StringListValues__UnmarshalledMessageAttributeValue: js.UndefOr[js.Array[String]] = js.undefined
}

object _UnmarshalledMessageAttributeValue {
  @scala.inline
  def apply(
    DataType: String,
    BinaryListValues: js.Array[Uint8Array] = null,
    BinaryValue: Uint8Array = null,
    StringListValues: js.Array[String] = null,
    StringValue: String = null
  ): _UnmarshalledMessageAttributeValue = {
    val __obj = js.Dynamic.literal(DataType = DataType)
    if (BinaryListValues != null) __obj.updateDynamic("BinaryListValues")(BinaryListValues)
    if (BinaryValue != null) __obj.updateDynamic("BinaryValue")(BinaryValue)
    if (StringListValues != null) __obj.updateDynamic("StringListValues")(StringListValues)
    if (StringValue != null) __obj.updateDynamic("StringValue")(StringValue)
    __obj.asInstanceOf[_UnmarshalledMessageAttributeValue]
  }
}

