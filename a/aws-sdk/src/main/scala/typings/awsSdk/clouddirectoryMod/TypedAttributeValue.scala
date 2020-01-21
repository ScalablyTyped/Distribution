package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedAttributeValue extends js.Object {
  /**
    * A binary data value.
    */
  var BinaryValue: js.UndefOr[BinaryAttributeValue] = js.native
  /**
    * A Boolean data value.
    */
  var BooleanValue: js.UndefOr[BooleanAttributeValue] = js.native
  /**
    * A date and time value.
    */
  var DatetimeValue: js.UndefOr[DatetimeAttributeValue] = js.native
  /**
    * A number data value.
    */
  var NumberValue: js.UndefOr[NumberAttributeValue] = js.native
  /**
    * A string data value.
    */
  var StringValue: js.UndefOr[StringAttributeValue] = js.native
}

object TypedAttributeValue {
  @scala.inline
  def apply(
    BinaryValue: BinaryAttributeValue = null,
    BooleanValue: js.UndefOr[Boolean] = js.undefined,
    DatetimeValue: DatetimeAttributeValue = null,
    NumberValue: NumberAttributeValue = null,
    StringValue: StringAttributeValue = null
  ): TypedAttributeValue = {
    val __obj = js.Dynamic.literal()
    if (BinaryValue != null) __obj.updateDynamic("BinaryValue")(BinaryValue.asInstanceOf[js.Any])
    if (!js.isUndefined(BooleanValue)) __obj.updateDynamic("BooleanValue")(BooleanValue.asInstanceOf[js.Any])
    if (DatetimeValue != null) __obj.updateDynamic("DatetimeValue")(DatetimeValue.asInstanceOf[js.Any])
    if (NumberValue != null) __obj.updateDynamic("NumberValue")(NumberValue.asInstanceOf[js.Any])
    if (StringValue != null) __obj.updateDynamic("StringValue")(StringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedAttributeValue]
  }
}

