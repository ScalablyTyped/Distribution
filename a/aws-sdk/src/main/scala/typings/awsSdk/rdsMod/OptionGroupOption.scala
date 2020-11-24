package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionGroupOption extends js.Object {
  
  /**
    * If the option requires a port, specifies the default port for the option.
    */
  var DefaultPort: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The description of the option.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The name of the engine that this option can be applied to.
    */
  var EngineName: js.UndefOr[String] = js.native
  
  /**
    * Indicates the major engine version that the option is available for.
    */
  var MajorEngineVersion: js.UndefOr[String] = js.native
  
  /**
    * The minimum required engine version for the option to be applied.
    */
  var MinimumRequiredMinorEngineVersion: js.UndefOr[String] = js.native
  
  /**
    * The name of the option.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The option settings that are available (and the default value) for each option in an option group.
    */
  var OptionGroupOptionSettings: js.UndefOr[OptionGroupOptionSettingsList] = js.native
  
  /**
    * The versions that are available for the option.
    */
  var OptionGroupOptionVersions: js.UndefOr[OptionGroupOptionVersionsList] = js.native
  
  /**
    * The options that conflict with this option.
    */
  var OptionsConflictsWith: js.UndefOr[typings.awsSdk.rdsMod.OptionsConflictsWith] = js.native
  
  /**
    * The options that are prerequisites for this option.
    */
  var OptionsDependedOn: js.UndefOr[typings.awsSdk.rdsMod.OptionsDependedOn] = js.native
  
  /**
    * Permanent options can never be removed from an option group. An option group containing a permanent option can't be removed from a DB instance.
    */
  var Permanent: js.UndefOr[Boolean] = js.native
  
  /**
    * Persistent options can't be removed from an option group while DB instances are associated with the option group. If you disassociate all DB instances from the option group, your can remove the persistent option from the option group.
    */
  var Persistent: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies whether the option requires a port.
    */
  var PortRequired: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, you must enable the Auto Minor Version Upgrade setting for your DB instance before you can use this option. You can enable Auto Minor Version Upgrade when you first create your DB instance, or by modifying your DB instance later. 
    */
  var RequiresAutoMinorEngineVersionUpgrade: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, you can change the option to an earlier version of the option. This only applies to options that have different versions available. 
    */
  var SupportsOptionVersionDowngrade: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * If true, you can only use this option with a DB instance that is in a VPC. 
    */
  var VpcOnly: js.UndefOr[Boolean] = js.native
}
object OptionGroupOption {
  
  @scala.inline
  def apply(): OptionGroupOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionGroupOption]
  }
  
  @scala.inline
  implicit class OptionGroupOptionOps[Self <: OptionGroupOption] (val x: Self) extends AnyVal {
    
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
    def setDefaultPort(value: IntegerOptional): Self = this.set("DefaultPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPort: Self = this.set("DefaultPort", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setEngineName(value: String): Self = this.set("EngineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineName: Self = this.set("EngineName", js.undefined)
    
    @scala.inline
    def setMajorEngineVersion(value: String): Self = this.set("MajorEngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorEngineVersion: Self = this.set("MajorEngineVersion", js.undefined)
    
    @scala.inline
    def setMinimumRequiredMinorEngineVersion(value: String): Self = this.set("MinimumRequiredMinorEngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumRequiredMinorEngineVersion: Self = this.set("MinimumRequiredMinorEngineVersion", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setOptionGroupOptionSettingsVarargs(value: OptionGroupOptionSetting*): Self = this.set("OptionGroupOptionSettings", js.Array(value :_*))
    
    @scala.inline
    def setOptionGroupOptionSettings(value: OptionGroupOptionSettingsList): Self = this.set("OptionGroupOptionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionGroupOptionSettings: Self = this.set("OptionGroupOptionSettings", js.undefined)
    
    @scala.inline
    def setOptionGroupOptionVersionsVarargs(value: OptionVersion*): Self = this.set("OptionGroupOptionVersions", js.Array(value :_*))
    
    @scala.inline
    def setOptionGroupOptionVersions(value: OptionGroupOptionVersionsList): Self = this.set("OptionGroupOptionVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionGroupOptionVersions: Self = this.set("OptionGroupOptionVersions", js.undefined)
    
    @scala.inline
    def setOptionsConflictsWithVarargs(value: String*): Self = this.set("OptionsConflictsWith", js.Array(value :_*))
    
    @scala.inline
    def setOptionsConflictsWith(value: OptionsConflictsWith): Self = this.set("OptionsConflictsWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionsConflictsWith: Self = this.set("OptionsConflictsWith", js.undefined)
    
    @scala.inline
    def setOptionsDependedOnVarargs(value: String*): Self = this.set("OptionsDependedOn", js.Array(value :_*))
    
    @scala.inline
    def setOptionsDependedOn(value: OptionsDependedOn): Self = this.set("OptionsDependedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionsDependedOn: Self = this.set("OptionsDependedOn", js.undefined)
    
    @scala.inline
    def setPermanent(value: Boolean): Self = this.set("Permanent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermanent: Self = this.set("Permanent", js.undefined)
    
    @scala.inline
    def setPersistent(value: Boolean): Self = this.set("Persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistent: Self = this.set("Persistent", js.undefined)
    
    @scala.inline
    def setPortRequired(value: Boolean): Self = this.set("PortRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortRequired: Self = this.set("PortRequired", js.undefined)
    
    @scala.inline
    def setRequiresAutoMinorEngineVersionUpgrade(value: Boolean): Self = this.set("RequiresAutoMinorEngineVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiresAutoMinorEngineVersionUpgrade: Self = this.set("RequiresAutoMinorEngineVersionUpgrade", js.undefined)
    
    @scala.inline
    def setSupportsOptionVersionDowngrade(value: BooleanOptional): Self = this.set("SupportsOptionVersionDowngrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsOptionVersionDowngrade: Self = this.set("SupportsOptionVersionDowngrade", js.undefined)
    
    @scala.inline
    def setVpcOnly(value: Boolean): Self = this.set("VpcOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcOnly: Self = this.set("VpcOnly", js.undefined)
  }
}
