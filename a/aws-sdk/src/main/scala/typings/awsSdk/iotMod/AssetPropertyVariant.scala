package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: java.lang.String, value: js.Any): Self = {
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
