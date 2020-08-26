package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionGroupOptionSetting extends js.Object {
  /**
    * Indicates the acceptable values for the option group option.
    */
  var AllowedValues: js.UndefOr[String] = js.native
  /**
    * The DB engine specific parameter type for the option group option.
    */
  var ApplyType: js.UndefOr[String] = js.native
  /**
    * The default value for the option group option.
    */
  var DefaultValue: js.UndefOr[String] = js.native
  /**
    * Boolean value where true indicates that this option group option can be changed from the default value.
    */
  var IsModifiable: js.UndefOr[Boolean] = js.native
  /**
    * Boolean value where true indicates that a value must be specified for this option setting of the option group option.
    */
  var IsRequired: js.UndefOr[Boolean] = js.native
  /**
    * The minimum DB engine version required for the corresponding allowed value for this option setting.
    */
  var MinimumEngineVersionPerAllowedValue: js.UndefOr[MinimumEngineVersionPerAllowedValueList] = js.native
  /**
    * The description of the option group option.
    */
  var SettingDescription: js.UndefOr[String] = js.native
  /**
    * The name of the option group option.
    */
  var SettingName: js.UndefOr[String] = js.native
}

object OptionGroupOptionSetting {
  @scala.inline
  def apply(): OptionGroupOptionSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionGroupOptionSetting]
  }
  @scala.inline
  implicit class OptionGroupOptionSettingOps[Self <: OptionGroupOptionSetting] (val x: Self) extends AnyVal {
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
    def setDefaultValue(value: String): Self = this.set("DefaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("DefaultValue", js.undefined)
    @scala.inline
    def setIsModifiable(value: Boolean): Self = this.set("IsModifiable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsModifiable: Self = this.set("IsModifiable", js.undefined)
    @scala.inline
    def setIsRequired(value: Boolean): Self = this.set("IsRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRequired: Self = this.set("IsRequired", js.undefined)
    @scala.inline
    def setMinimumEngineVersionPerAllowedValueVarargs(value: MinimumEngineVersionPerAllowedValue*): Self = this.set("MinimumEngineVersionPerAllowedValue", js.Array(value :_*))
    @scala.inline
    def setMinimumEngineVersionPerAllowedValue(value: MinimumEngineVersionPerAllowedValueList): Self = this.set("MinimumEngineVersionPerAllowedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumEngineVersionPerAllowedValue: Self = this.set("MinimumEngineVersionPerAllowedValue", js.undefined)
    @scala.inline
    def setSettingDescription(value: String): Self = this.set("SettingDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettingDescription: Self = this.set("SettingDescription", js.undefined)
    @scala.inline
    def setSettingName(value: String): Self = this.set("SettingName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettingName: Self = this.set("SettingName", js.undefined)
  }
  
}

