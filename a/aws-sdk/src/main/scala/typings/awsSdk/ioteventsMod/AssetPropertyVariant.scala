package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetPropertyVariant extends js.Object {
  /**
    * The asset property value is a Boolean value that must be TRUE or FALSE. You can also specify an expression. If you use an expression, the evaluated result should be a Boolean value.
    */
  var booleanValue: js.UndefOr[AssetPropertyBooleanValue] = js.native
  /**
    * The asset property value is a double. You can also specify an expression. If you use an expression, the evaluated result should be a double.
    */
  var doubleValue: js.UndefOr[AssetPropertyDoubleValue] = js.native
  /**
    * The asset property value is an integer. You can also specify an expression. If you use an expression, the evaluated result should be an integer.
    */
  var integerValue: js.UndefOr[AssetPropertyIntegerValue] = js.native
  /**
    * The asset property value is a string. You can also specify an expression. If you use an expression, the evaluated result should be a string.
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

