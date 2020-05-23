package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Variant extends js.Object {
  /**
    * Asset property data of type Boolean (true or false).
    */
  var booleanValue: js.UndefOr[PropertyValueBooleanValue] = js.native
  /**
    * Asset property data of type double (floating point number).
    */
  var doubleValue: js.UndefOr[PropertyValueDoubleValue] = js.native
  /**
    * Asset property data of type integer (whole number).
    */
  var integerValue: js.UndefOr[PropertyValueIntegerValue] = js.native
  /**
    * Asset property data of type string (sequence of characters).
    */
  var stringValue: js.UndefOr[PropertyValueStringValue] = js.native
}

object Variant {
  @scala.inline
  def apply(
    booleanValue: js.UndefOr[PropertyValueBooleanValue] = js.undefined,
    doubleValue: js.UndefOr[PropertyValueDoubleValue] = js.undefined,
    integerValue: js.UndefOr[PropertyValueIntegerValue] = js.undefined,
    stringValue: PropertyValueStringValue = null
  ): Variant = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(booleanValue)) __obj.updateDynamic("booleanValue")(booleanValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleValue)) __obj.updateDynamic("doubleValue")(doubleValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(integerValue)) __obj.updateDynamic("integerValue")(integerValue.get.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variant]
  }
}

