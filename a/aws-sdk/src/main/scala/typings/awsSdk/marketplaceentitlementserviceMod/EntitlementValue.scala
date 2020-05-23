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
  def apply(
    BooleanValue: js.UndefOr[Boolean] = js.undefined,
    DoubleValue: js.UndefOr[Double] = js.undefined,
    IntegerValue: js.UndefOr[Integer] = js.undefined,
    StringValue: String = null
  ): EntitlementValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BooleanValue)) __obj.updateDynamic("BooleanValue")(BooleanValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DoubleValue)) __obj.updateDynamic("DoubleValue")(DoubleValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(IntegerValue)) __obj.updateDynamic("IntegerValue")(IntegerValue.get.asInstanceOf[js.Any])
    if (StringValue != null) __obj.updateDynamic("StringValue")(StringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntitlementValue]
  }
}

