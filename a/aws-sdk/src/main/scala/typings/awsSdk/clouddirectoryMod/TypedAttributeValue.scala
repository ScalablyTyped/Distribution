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
  def apply(): TypedAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypedAttributeValue]
  }
  @scala.inline
  implicit class TypedAttributeValueOps[Self <: TypedAttributeValue] (val x: Self) extends AnyVal {
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
    def setBinaryValue(value: BinaryAttributeValue): Self = this.set("BinaryValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinaryValue: Self = this.set("BinaryValue", js.undefined)
    @scala.inline
    def setBooleanValue(value: BooleanAttributeValue): Self = this.set("BooleanValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBooleanValue: Self = this.set("BooleanValue", js.undefined)
    @scala.inline
    def setDatetimeValue(value: DatetimeAttributeValue): Self = this.set("DatetimeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatetimeValue: Self = this.set("DatetimeValue", js.undefined)
    @scala.inline
    def setNumberValue(value: NumberAttributeValue): Self = this.set("NumberValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberValue: Self = this.set("NumberValue", js.undefined)
    @scala.inline
    def setStringValue(value: StringAttributeValue): Self = this.set("StringValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringValue: Self = this.set("StringValue", js.undefined)
  }
  
}

