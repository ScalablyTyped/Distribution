package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionGroupOption extends StObject {
  
  /**
    * If the option requires a port, specifies the default port for the option.
    */
  var DefaultPort: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The description of the option.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the engine that this option can be applied to.
    */
  var EngineName: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the major engine version that the option is available for.
    */
  var MajorEngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The minimum required engine version for the option to be applied.
    */
  var MinimumRequiredMinorEngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the option.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The option settings that are available (and the default value) for each option in an option group.
    */
  var OptionGroupOptionSettings: js.UndefOr[OptionGroupOptionSettingsList] = js.undefined
  
  /**
    * The versions that are available for the option.
    */
  var OptionGroupOptionVersions: js.UndefOr[OptionGroupOptionVersionsList] = js.undefined
  
  /**
    * The options that conflict with this option.
    */
  var OptionsConflictsWith: js.UndefOr[typings.awsSdk.rdsMod.OptionsConflictsWith] = js.undefined
  
  /**
    * The options that are prerequisites for this option.
    */
  var OptionsDependedOn: js.UndefOr[typings.awsSdk.rdsMod.OptionsDependedOn] = js.undefined
  
  /**
    * Permanent options can never be removed from an option group. An option group containing a permanent option can't be removed from a DB instance.
    */
  var Permanent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Persistent options can't be removed from an option group while DB instances are associated with the option group. If you disassociate all DB instances from the option group, your can remove the persistent option from the option group.
    */
  var Persistent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the option requires a port.
    */
  var PortRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, you must enable the Auto Minor Version Upgrade setting for your DB instance before you can use this option. You can enable Auto Minor Version Upgrade when you first create your DB instance, or by modifying your DB instance later. 
    */
  var RequiresAutoMinorEngineVersionUpgrade: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, you can change the option to an earlier version of the option. This only applies to options that have different versions available. 
    */
  var SupportsOptionVersionDowngrade: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * If true, you can only use this option with a DB instance that is in a VPC. 
    */
  var VpcOnly: js.UndefOr[Boolean] = js.undefined
}
object OptionGroupOption {
  
  @scala.inline
  def apply(): OptionGroupOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionGroupOption]
  }
  
  @scala.inline
  implicit class OptionGroupOptionMutableBuilder[Self <: OptionGroupOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultPort(value: IntegerOptional): Self = StObject.set(x, "DefaultPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPortUndefined: Self = StObject.set(x, "DefaultPort", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEngineName(value: String): Self = StObject.set(x, "EngineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineNameUndefined: Self = StObject.set(x, "EngineName", js.undefined)
    
    @scala.inline
    def setMajorEngineVersion(value: String): Self = StObject.set(x, "MajorEngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorEngineVersionUndefined: Self = StObject.set(x, "MajorEngineVersion", js.undefined)
    
    @scala.inline
    def setMinimumRequiredMinorEngineVersion(value: String): Self = StObject.set(x, "MinimumRequiredMinorEngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumRequiredMinorEngineVersionUndefined: Self = StObject.set(x, "MinimumRequiredMinorEngineVersion", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOptionGroupOptionSettings(value: OptionGroupOptionSettingsList): Self = StObject.set(x, "OptionGroupOptionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionGroupOptionSettingsUndefined: Self = StObject.set(x, "OptionGroupOptionSettings", js.undefined)
    
    @scala.inline
    def setOptionGroupOptionSettingsVarargs(value: OptionGroupOptionSetting*): Self = StObject.set(x, "OptionGroupOptionSettings", js.Array(value :_*))
    
    @scala.inline
    def setOptionGroupOptionVersions(value: OptionGroupOptionVersionsList): Self = StObject.set(x, "OptionGroupOptionVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionGroupOptionVersionsUndefined: Self = StObject.set(x, "OptionGroupOptionVersions", js.undefined)
    
    @scala.inline
    def setOptionGroupOptionVersionsVarargs(value: OptionVersion*): Self = StObject.set(x, "OptionGroupOptionVersions", js.Array(value :_*))
    
    @scala.inline
    def setOptionsConflictsWith(value: OptionsConflictsWith): Self = StObject.set(x, "OptionsConflictsWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsConflictsWithUndefined: Self = StObject.set(x, "OptionsConflictsWith", js.undefined)
    
    @scala.inline
    def setOptionsConflictsWithVarargs(value: String*): Self = StObject.set(x, "OptionsConflictsWith", js.Array(value :_*))
    
    @scala.inline
    def setOptionsDependedOn(value: OptionsDependedOn): Self = StObject.set(x, "OptionsDependedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsDependedOnUndefined: Self = StObject.set(x, "OptionsDependedOn", js.undefined)
    
    @scala.inline
    def setOptionsDependedOnVarargs(value: String*): Self = StObject.set(x, "OptionsDependedOn", js.Array(value :_*))
    
    @scala.inline
    def setPermanent(value: Boolean): Self = StObject.set(x, "Permanent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermanentUndefined: Self = StObject.set(x, "Permanent", js.undefined)
    
    @scala.inline
    def setPersistent(value: Boolean): Self = StObject.set(x, "Persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentUndefined: Self = StObject.set(x, "Persistent", js.undefined)
    
    @scala.inline
    def setPortRequired(value: Boolean): Self = StObject.set(x, "PortRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortRequiredUndefined: Self = StObject.set(x, "PortRequired", js.undefined)
    
    @scala.inline
    def setRequiresAutoMinorEngineVersionUpgrade(value: Boolean): Self = StObject.set(x, "RequiresAutoMinorEngineVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresAutoMinorEngineVersionUpgradeUndefined: Self = StObject.set(x, "RequiresAutoMinorEngineVersionUpgrade", js.undefined)
    
    @scala.inline
    def setSupportsOptionVersionDowngrade(value: BooleanOptional): Self = StObject.set(x, "SupportsOptionVersionDowngrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsOptionVersionDowngradeUndefined: Self = StObject.set(x, "SupportsOptionVersionDowngrade", js.undefined)
    
    @scala.inline
    def setVpcOnly(value: Boolean): Self = StObject.set(x, "VpcOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcOnlyUndefined: Self = StObject.set(x, "VpcOnly", js.undefined)
  }
}
