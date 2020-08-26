package typings.awsSdk.marketplaceentitlementserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntitlementValue extends js.Object {
  /**
    * The BooleanValue field will be populated with a boolean value when the entitlement is a boolean type. Otherwise, the field will not be set.
    */
  var BooleanValue: js.UndefOr[Boolean] = js.native
  /**
    * The DoubleValue field will be populated with a double value when the entitlement is a double type. Otherwise, the field will not be set.
    */
  var DoubleValue: js.UndefOr[Double] = js.native
  /**
    * The IntegerValue field will be populated with an integer value when the entitlement is an integer type. Otherwise, the field will not be set.
    */
  var IntegerValue: js.UndefOr[Integer] = js.native
  /**
    * The StringValue field will be populated with a string value when the entitlement is a string type. Otherwise, the field will not be set.
    */
  var StringValue: js.UndefOr[String] = js.native
}

object EntitlementValue {
  @scala.inline
  def apply(): EntitlementValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntitlementValue]
  }
  @scala.inline
  implicit class EntitlementValueOps[Self <: EntitlementValue] (val x: Self) extends AnyVal {
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
    def setBooleanValue(value: Boolean): Self = this.set("BooleanValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBooleanValue: Self = this.set("BooleanValue", js.undefined)
    @scala.inline
    def setDoubleValue(value: Double): Self = this.set("DoubleValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubleValue: Self = this.set("DoubleValue", js.undefined)
    @scala.inline
    def setIntegerValue(value: Integer): Self = this.set("IntegerValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegerValue: Self = this.set("IntegerValue", js.undefined)
    @scala.inline
    def setStringValue(value: String): Self = this.set("StringValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringValue: Self = this.set("StringValue", js.undefined)
  }
  
}

