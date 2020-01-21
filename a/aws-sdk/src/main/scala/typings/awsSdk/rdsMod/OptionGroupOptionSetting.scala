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
  def apply(
    AllowedValues: String = null,
    ApplyType: String = null,
    DefaultValue: String = null,
    IsModifiable: js.UndefOr[scala.Boolean] = js.undefined,
    IsRequired: js.UndefOr[scala.Boolean] = js.undefined,
    MinimumEngineVersionPerAllowedValue: MinimumEngineVersionPerAllowedValueList = null,
    SettingDescription: String = null,
    SettingName: String = null
  ): OptionGroupOptionSetting = {
    val __obj = js.Dynamic.literal()
    if (AllowedValues != null) __obj.updateDynamic("AllowedValues")(AllowedValues.asInstanceOf[js.Any])
    if (ApplyType != null) __obj.updateDynamic("ApplyType")(ApplyType.asInstanceOf[js.Any])
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(IsModifiable)) __obj.updateDynamic("IsModifiable")(IsModifiable.asInstanceOf[js.Any])
    if (!js.isUndefined(IsRequired)) __obj.updateDynamic("IsRequired")(IsRequired.asInstanceOf[js.Any])
    if (MinimumEngineVersionPerAllowedValue != null) __obj.updateDynamic("MinimumEngineVersionPerAllowedValue")(MinimumEngineVersionPerAllowedValue.asInstanceOf[js.Any])
    if (SettingDescription != null) __obj.updateDynamic("SettingDescription")(SettingDescription.asInstanceOf[js.Any])
    if (SettingName != null) __obj.updateDynamic("SettingName")(SettingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionGroupOptionSetting]
  }
}

