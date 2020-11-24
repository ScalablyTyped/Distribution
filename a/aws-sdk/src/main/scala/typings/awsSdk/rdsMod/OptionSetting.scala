package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionSetting extends js.Object {
  
  /**
    * The allowed values of the option setting.
    */
  var AllowedValues: js.UndefOr[String] = js.native
  
  /**
    * The DB engine specific parameter type.
    */
  var ApplyType: js.UndefOr[String] = js.native
  
  /**
    * The data type of the option setting.
    */
  var DataType: js.UndefOr[String] = js.native
  
  /**
    * The default value of the option setting.
    */
  var DefaultValue: js.UndefOr[String] = js.native
  
  /**
    * The description of the option setting.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * Indicates if the option setting is part of a collection.
    */
  var IsCollection: js.UndefOr[Boolean] = js.native
  
  /**
    * A Boolean value that, when true, indicates the option setting can be modified from the default.
    */
  var IsModifiable: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the option that has settings that you can set.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The current value of the option setting.
    */
  var Value: js.UndefOr[String] = js.native
}
object OptionSetting {
  
  @scala.inline
  def apply(): OptionSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionSetting]
  }
  
  @scala.inline
  implicit class OptionSettingOps[Self <: OptionSetting] (val x: Self) extends AnyVal {
    
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
    def setAllowedValues(value: String): Self = this.set("AllowedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedValues: Self = this.set("AllowedValues", js.undefined)
    
    @scala.inline
    def setApplyType(value: String): Self = this.set("ApplyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyType: Self = this.set("ApplyType", js.undefined)
    
    @scala.inline
    def setDataType(value: String): Self = this.set("DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("DataType", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("DefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("DefaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setIsCollection(value: Boolean): Self = this.set("IsCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCollection: Self = this.set("IsCollection", js.undefined)
    
    @scala.inline
    def setIsModifiable(value: Boolean): Self = this.set("IsModifiable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsModifiable: Self = this.set("IsModifiable", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
