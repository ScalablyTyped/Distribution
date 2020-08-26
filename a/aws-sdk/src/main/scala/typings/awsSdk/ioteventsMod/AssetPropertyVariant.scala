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
  def apply(): AssetPropertyVariant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetPropertyVariant]
  }
  @scala.inline
  implicit class AssetPropertyVariantOps[Self <: AssetPropertyVariant] (val x: Self) extends AnyVal {
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
    def setBooleanValue(value: AssetPropertyBooleanValue): Self = this.set("booleanValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBooleanValue: Self = this.set("booleanValue", js.undefined)
    @scala.inline
    def setDoubleValue(value: AssetPropertyDoubleValue): Self = this.set("doubleValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubleValue: Self = this.set("doubleValue", js.undefined)
    @scala.inline
    def setIntegerValue(value: AssetPropertyIntegerValue): Self = this.set("integerValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegerValue: Self = this.set("integerValue", js.undefined)
    @scala.inline
    def setStringValue(value: AssetPropertyStringValue): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
  }
  
}

