package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionGroupOptionSetting extends StObject {
  
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
  implicit class OptionGroupOptionSettingMutableBuilder[Self <: OptionGroupOptionSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedValues(value: String): Self = StObject.set(x, "AllowedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedValuesUndefined: Self = StObject.set(x, "AllowedValues", js.undefined)
    
    @scala.inline
    def setApplyType(value: String): Self = StObject.set(x, "ApplyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyTypeUndefined: Self = StObject.set(x, "ApplyType", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "DefaultValue", js.undefined)
    
    @scala.inline
    def setIsModifiable(value: Boolean): Self = StObject.set(x, "IsModifiable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsModifiableUndefined: Self = StObject.set(x, "IsModifiable", js.undefined)
    
    @scala.inline
    def setIsRequired(value: Boolean): Self = StObject.set(x, "IsRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRequiredUndefined: Self = StObject.set(x, "IsRequired", js.undefined)
    
    @scala.inline
    def setMinimumEngineVersionPerAllowedValue(value: MinimumEngineVersionPerAllowedValueList): Self = StObject.set(x, "MinimumEngineVersionPerAllowedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumEngineVersionPerAllowedValueUndefined: Self = StObject.set(x, "MinimumEngineVersionPerAllowedValue", js.undefined)
    
    @scala.inline
    def setMinimumEngineVersionPerAllowedValueVarargs(value: MinimumEngineVersionPerAllowedValue*): Self = StObject.set(x, "MinimumEngineVersionPerAllowedValue", js.Array(value :_*))
    
    @scala.inline
    def setSettingDescription(value: String): Self = StObject.set(x, "SettingDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingDescriptionUndefined: Self = StObject.set(x, "SettingDescription", js.undefined)
    
    @scala.inline
    def setSettingName(value: String): Self = StObject.set(x, "SettingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingNameUndefined: Self = StObject.set(x, "SettingName", js.undefined)
  }
}
