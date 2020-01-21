package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetPropertyVariant extends js.Object {
  /**
    * Optional. A string that contains the boolean value (true or false) of the value entry. Accepts substitution templates.
    */
  var booleanValue: js.UndefOr[AssetPropertyBooleanValue] = js.native
  /**
    * Optional. A string that contains the double value of the value entry. Accepts substitution templates.
    */
  var doubleValue: js.UndefOr[AssetPropertyDoubleValue] = js.native
  /**
    * Optional. A string that contains the integer value of the value entry. Accepts substitution templates.
    */
  var integerValue: js.UndefOr[AssetPropertyIntegerValue] = js.native
  /**
    * Optional. The string value of the value entry. Accepts substitution templates.
    */
  var stringValue: js.UndefOr[AssetPropertyStringValue] = js.native
}

object AssetPropertyVariant {
  @scala.inline
  def apply(
    booleanValue: AssetPropertyBooleanValue = null,
    doubleValue: AssetPropertyDoubleValue = null,
    integerValue: AssetPropertyIntegerValue = null,
    stringValue: AssetPropertyStringValue = null
  ): AssetPropertyVariant = {
    val __obj = js.Dynamic.literal()
    if (booleanValue != null) __obj.updateDynamic("booleanValue")(booleanValue.asInstanceOf[js.Any])
    if (doubleValue != null) __obj.updateDynamic("doubleValue")(doubleValue.asInstanceOf[js.Any])
    if (integerValue != null) __obj.updateDynamic("integerValue")(integerValue.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetPropertyVariant]
  }
}

